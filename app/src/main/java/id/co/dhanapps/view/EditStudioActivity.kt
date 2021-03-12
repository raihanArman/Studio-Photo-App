package id.co.dhanapps.view

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.AsyncTask
import android.os.Bundle
import android.provider.MediaStore
import android.util.Base64
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import id.co.dhanapps.BuildConfig
import id.co.dhanapps.R
import id.co.dhanapps.data.Studio
import id.co.dhanapps.databinding.ActivityEditStudioBinding
import id.co.dhanapps.repository.HomeRepository
import id.co.dhanapps.utils.ConvertBitmap
import id.co.dhanapps.utils.Resource
import id.co.dhanapps.view.home.HomeViewModel
import id.co.dhanapps.view.home.HomeViewModelProviderFactory
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.lang.ref.WeakReference

class EditStudioActivity : AppCompatActivity(), ConvertBitmap {

    lateinit var binding : ActivityEditStudioBinding
    lateinit var viewModel: HomeViewModel

    var bitmap: Bitmap? = null
    var photoUser: String? = null


    companion object{

        const val REQUEST_GALERY = 96
        const val REQUEST_CAMERA = 98
        const val CAMERA_PERMISSION = 90
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_studio)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_studio)

        loadData()

        val homeRepository = HomeRepository()
        val viewModelFactory = HomeViewModelProviderFactory(application, homeRepository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(HomeViewModel::class.java)

        binding.ivCamera.setOnClickListener {
            val builder =
                AlertDialog.Builder(this)
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
                        REQUEST_CAMERA
                    )
                } else {
                    val intent = Intent()
                    intent.type = "image/*"
                    intent.action = Intent.ACTION_GET_CONTENT
                    startActivityForResult(
                        intent,
                        REQUEST_GALERY
                    )
                    dialog.dismiss()
                }
            }
            builder.show()
        }

        binding.ivUser.setOnClickListener {
            val builder =
                AlertDialog.Builder(this)
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
                        REQUEST_CAMERA
                    )
                } else {
                    val intent = Intent()
                    intent.type = "image/*"
                    intent.action = Intent.ACTION_GET_CONTENT
                    startActivityForResult(
                        intent,
                        REQUEST_GALERY
                    )
                    dialog.dismiss()
                }
            }
            builder.show()
        }

        binding.ivBack.setOnClickListener { finish() }

        viewModel.editStudioMutable.observe(this, Observer { response ->
            when(response){
                is Resource.Success ->{
                    response?.data.let {

                        if (it?.value === 1) {
                            Toast.makeText(
                                this,
                                "Edit berhasil",
                                Toast.LENGTH_SHORT
                            ).show()
                            finish()
                        } else {
                            Toast.makeText(
                                this,
                                "Edit Data gagal",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                }
                is Resource.Error ->{

                }
            }
        })

        binding.btnUpdate.setOnClickListener {
            updateDataStudio()
        }


    }
    private fun loadData() {
        val studio: Studio? = intent.getParcelableExtra("studio")

        Glide.with(this)
            .load(BuildConfig.BASE_URL_GAMBAR+studio?.gambar)
            .into(binding.ivUser)

        binding.user = studio
    }

    private fun updateDataStudio() {

        if (photoUser != null) {
            LoadBitmapConverterCallback(
                this,this
            ).execute()
        }
        val studio: Studio? = intent.getParcelableExtra("studio")
        val user: Studio = Studio()
        user?.idStudio = studio?.idStudio
        user?.namaStudio = binding.etNama.text.toString()
        user?.email = binding.etEmail.text.toString()
        user?.desrkripsi =binding.etDeskripsi.text.toString()
        user?.lokasi = binding.etAlamat.text.toString()
        user?.gambar = photoUser
        user?.username = binding.etUsername.text.toString()
        user?.kontak = binding.etNohp.text.toString()

        viewModel.getEditStudio(user)
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == CAMERA_PERMISSION) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(
                    cameraIntent,
                    REQUEST_CAMERA
                )
            } else {
                Toast.makeText(this, "Camera permission denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_GALERY) {
            if (resultCode == Activity.RESULT_OK && data != null) {
                val imageUri = data.data
                try {
                    bitmap = MediaStore.Images.Media.getBitmap(contentResolver, imageUri)
                    binding.ivUser.setImageBitmap(bitmap)
                    LoadBitmapConverterCallback(
                        this,
                        this
                    ).execute()
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }
        } else if (requestCode == REQUEST_CAMERA) {
            if (resultCode == Activity.RESULT_OK && data != null) {
                bitmap = data.extras!!["data"] as Bitmap?
                binding.ivUser.setImageBitmap(bitmap)
                LoadBitmapConverterCallback(
                    this,
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
    }

}