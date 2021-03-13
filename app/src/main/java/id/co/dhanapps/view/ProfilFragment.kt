package id.co.dhanapps.view

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.AsyncTask
import android.os.Bundle
import android.provider.MediaStore
import android.util.Base64
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import id.co.dhanapps.BuildConfig
import id.co.dhanapps.R
import id.co.dhanapps.data.Karya
import id.co.dhanapps.data.Paket
import id.co.dhanapps.data.response.ResponseList
import id.co.dhanapps.data.Studio
import id.co.dhanapps.data.response.ResponseItem
import id.co.dhanapps.databinding.FragmentProfilBinding
import id.co.dhanapps.utils.Constant
import id.co.dhanapps.utils.ConvertBitmap
import id.co.dhanapps.utils.OnClickKarya
import id.co.dhanapps.utils.Resource
import id.co.dhanapps.view.adapter.KaryaAdapter
import id.co.dhanapps.view.adapter.PaketAdapter
import id.co.dhanapps.view.home.HomeViewModel
import id.co.dhanapps.view.home.MainActivity
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.lang.ref.WeakReference

class ProfilFragment : Fragment(), ConvertBitmap, OnClickKarya {

    private lateinit var dataBinding : FragmentProfilBinding
    lateinit var viewModel: HomeViewModel
    private lateinit var paketAdapter: PaketAdapter
    private lateinit var karyaAdapter: KaryaAdapter
    var sharedPreferences: SharedPreferences? = null
    var editor: SharedPreferences.Editor? = null
    var idUser: String? = null


    var bitmap: Bitmap? = null
    var photoUser: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_profil, container, false)
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (context as MainActivity).viewModel
        paketAdapter = PaketAdapter(requireContext(), 1)
        karyaAdapter = KaryaAdapter(requireContext(), 1, this)

        sharedPreferences = requireActivity().getSharedPreferences(Constant.LOGIN_KEY, Context.MODE_PRIVATE)
        editor = sharedPreferences!!.edit()
        idUser = sharedPreferences!!.getString(Constant.ID_USER_KEY, "")

        dataBinding.rvPaket.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = paketAdapter

        }

        dataBinding.rvKarya.apply {
            val layoutManagerStudio = LinearLayoutManager(context)
            layoutManagerStudio.orientation = LinearLayoutManager.HORIZONTAL
            layoutManager = layoutManagerStudio
            adapter = karyaAdapter
        }


        dataBinding.tvTambahKarya.setOnClickListener {
            showDialogInputKarya()
        }


        dataBinding.tvTambahPaket.setOnClickListener {
            val intent = Intent(context, InputPaketActivity::class.java)
            intent.putExtra("type", "input")
            startActivity(intent)
        }


        viewModel.paketMutable.observe(viewLifecycleOwner, Observer { response ->
            when(response){
                is Resource.Success ->{
                    response?.data.let {
                        loadData(it)
                    }
                }
                is Resource.Error ->{

                }
            }
        })

        viewModel.karyaMutable.observe(viewLifecycleOwner, Observer { response ->
            when(response){
                is Resource.Success ->{
                    response?.data.let {
                        loadDataKarya(it)
                    }
                }
            }
        })


        viewModel.studioItemMutable.observe(viewLifecycleOwner, Observer { response ->
            when(response){
                is Resource.Success ->{
                    response?.data.let {
                        loadStudioItem(it)
                    }
                }
            }
        })

        viewModel.inputKaryaMutable.observe(requireActivity(), Observer { response ->
            when(response){
                is Resource.Success ->{
                    response.data?.let {
                        if (it.value == 1){
                            idUser?.let {
                                viewModel.getKaryaResponse(it)
                            }
                            Toast.makeText(requireContext(), "Berhasil input karya", Toast.LENGTH_LONG).show()
                            loadDataProfil()
                        }else{
                            Toast.makeText(requireContext(), "Gagal input karya", Toast.LENGTH_LONG).show()
                        }
                    }
                }
                is Resource.Error ->{

                }
            }
        })

        viewModel.hapusKaryaMutable.observe(viewLifecycleOwner, Observer { response ->
            when(response){
                is Resource.Success ->{
                    response?.data.let {
                        if(it?.value == 1){
                            Toast.makeText(requireContext(), "Berhasil hapus", Toast.LENGTH_LONG).show()
                            loadDataProfil()
                        }else{
                            Toast.makeText(requireContext(), "Gagal hapus", Toast.LENGTH_LONG).show()
                        }
                    }
                }
                is Resource.Error ->{

                }
            }
        })

        loadDataProfil()


        dataBinding.btnLogout.setOnClickListener(View.OnClickListener {
            editor?.putBoolean(Constant.LOGIN_STATUS, false)
            editor?.commit()
            val intent = Intent(activity, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        })

    }

    private fun loadDataProfil() {

        idUser?.let {
            viewModel.getPaketStudio(it)
            viewModel.getKaryaResponse(it)
            viewModel.getStudioItemResponse(it)
        }
    }

    private fun showDialogInputKarya() {
        val builder =
            AlertDialog.Builder(requireContext())
        builder.setTitle("Pilih")
        val pilihJenis =
            arrayOf("Camera", "Galery")
        builder.setItems(
            pilihJenis
        ) { dialog, which ->
            if (which == 0) {
                val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(
                    cameraIntent,
                    EditStudioActivity.REQUEST_CAMERA
                )
            } else {
                val intent = Intent()
                intent.type = "image/*"
                intent.action = Intent.ACTION_GET_CONTENT
                startActivityForResult(
                    intent,
                    EditStudioActivity.REQUEST_GALERY
                )
                dialog.dismiss()
            }
        }
        builder.show()
    }

    private fun loadStudioItem(data: ResponseItem<Studio>?) {
        dataBinding.tvStudio.text = data?.data?.namaStudio

        Glide.with(requireActivity())
            .load(BuildConfig.BASE_URL_GAMBAR+data?.data?.gambar)
            .into(dataBinding.ivStudio)

        dataBinding.btnEdit.setOnClickListener {
            val intent = Intent(activity, EditStudioActivity::class.java)
            intent.putExtra("studio", data?.data)
            activity!!.startActivity(intent)
        }
    }

    private fun loadDataKarya(it: ResponseList<Karya>?) {
        it?.data?.let { it1 -> karyaAdapter.setListKarya(it1) }
    }

    private fun loadData(it: ResponseList<Paket>?) {
        it?.data?.let { it1 -> paketAdapter.setListPaket(it1) }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == EditStudioActivity.CAMERA_PERMISSION) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(
                    cameraIntent,
                    EditStudioActivity.REQUEST_CAMERA
                )
            } else {
                Toast.makeText(requireContext(), "Camera permission denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == EditStudioActivity.REQUEST_GALERY) {
            if (resultCode == Activity.RESULT_OK && data != null) {
                val imageUri = data.data
                try {
                    bitmap = MediaStore.Images.Media.getBitmap(requireActivity().contentResolver, imageUri)
                    LoadBitmapConverterCallback(
                        requireContext(),
                        this
                    ).execute()

                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
        } else if (requestCode == EditStudioActivity.REQUEST_CAMERA) {
            if (resultCode == Activity.RESULT_OK && data != null) {
                bitmap = data.extras!!["data"] as Bitmap?
                LoadBitmapConverterCallback(
                    requireContext(),
                    this
                ).execute()
            }
        }
    }
    inner class LoadBitmapConverterCallback(
        context: Context,
        convertBitmap: ConvertBitmap
    ) :
        AsyncTask<Void?, Void?, String>() {
        private val weakContext: WeakReference<Context>
        private val convertBitmap: ConvertBitmap
        override fun onPreExecute() {
            super.onPreExecute()
            weakContext.get()
        }

        override fun doInBackground(vararg p0: Void?): String? {
            val byteArrayOutputStream =
                ByteArrayOutputStream()
            bitmap?.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream)
            val imgByte = byteArrayOutputStream.toByteArray()
            return Base64.encodeToString(imgByte, Base64.DEFAULT)
        }

        override fun onPostExecute(s: String) {
            super.onPostExecute(s)
            convertBitmap.bitmapToString(s)
        }

        init {
            weakContext = WeakReference(context)
            this.convertBitmap = convertBitmap
        }
    }

    override fun bitmapToString(imgConvert: String?) {
        editProfil(imgConvert)
    }

    private fun editProfil(gambar: String?) {
        photoUser = gambar
        photoUser?.let {image ->
            idUser?.let {id ->
                viewModel.getInputKarya(id, image)
            }
        }
    }

    override fun onClickKarya(idkarya: String) {
        val alertDialog = AlertDialog.Builder(requireContext())
        alertDialog.setMessage("Apakah anda yakin ingin menghapus karya")
        alertDialog.setPositiveButton("Ya"){dialogInterface, i ->
            idkarya?.let {
                viewModel.hapusKarya(it)
            }
        }
        alertDialog.show()
    }

    override fun onResume() {
        super.onResume()
        loadDataProfil()
    }
}