package id.co.dhanapps.view

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import id.co.dhanapps.BuildConfig
import id.co.dhanapps.R
import id.co.dhanapps.data.Karya
import id.co.dhanapps.data.Paket
import id.co.dhanapps.data.response.ResponseList
import id.co.dhanapps.data.Studio
import id.co.dhanapps.data.response.ResponseItem
import id.co.dhanapps.databinding.ActivityDetailStudioBinding
import id.co.dhanapps.repository.HomeRepository
import id.co.dhanapps.utils.Constant
import id.co.dhanapps.utils.OnClickKarya
import id.co.dhanapps.utils.Resource
import id.co.dhanapps.view.adapter.KaryaAdapter
import id.co.dhanapps.view.adapter.PaketAdapter
import id.co.dhanapps.view.home.HomeViewModel
import id.co.dhanapps.view.home.HomeViewModelProviderFactory

class DetailStudioActivity : AppCompatActivity(), OnClickKarya {

    private lateinit var dataBinding: ActivityDetailStudioBinding
    lateinit var viewModel: HomeViewModel
    private lateinit var paketAdapter: PaketAdapter
    private lateinit var karyaAdapter: KaryaAdapter
    var sharedPreferences: SharedPreferences? = null
    var editor: SharedPreferences.Editor? = null
    var idUser: String? = null
    var idStudio: String ?= null
    var telp: String?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val homeRepository = HomeRepository()
        val viewModelFactory = HomeViewModelProviderFactory(application, homeRepository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(HomeViewModel::class.java)

        sharedPreferences = getSharedPreferences(Constant.LOGIN_KEY, Context.MODE_PRIVATE)
        editor = sharedPreferences!!.edit()
        idUser = sharedPreferences!!.getString(Constant.ID_USER_KEY, "")

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail_studio)
        paketAdapter = PaketAdapter(this, 2)
        karyaAdapter = KaryaAdapter(this, 2, this)

        idStudio = intent.getStringExtra("id_studio")


        dataBinding.ivBack.setOnClickListener {
            finish()
        }

        dataBinding.rvPaket.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = paketAdapter
        }

        dataBinding.rvGambar.apply {
            val layoutManagerStudio = LinearLayoutManager(context)
            layoutManagerStudio.orientation = LinearLayoutManager.HORIZONTAL
            layoutManager = layoutManagerStudio
            adapter = karyaAdapter
        }

        viewModel.paketMutable.observe(this, Observer { response ->
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

        viewModel.studioItemMutable.observe(this, Observer { response ->
            when(response){
                is Resource.Success ->{
                    response?.data.let {
                        loadStudioItem(it)
                    }
                }
            }
        })



        viewModel.editPaketMutable.observe(this, Observer { response ->
            when(response){
                is Resource.Success ->{
                    response?.data.let {
                        if(it?.value == 1){
                            Toast.makeText(this, "Berhasil edit", Toast.LENGTH_LONG).show()
                            finish()
                        }else{
                            Toast.makeText(this, "Gagal edit", Toast.LENGTH_LONG).show()
                        }
                    }
                }
                is Resource.Error ->{

                }
            }
        })


        viewModel.hapusPaketMutable.observe(this, Observer { response ->
            when(response){
                is Resource.Success ->{
                    response?.data.let {
                        if(it?.value == 1){
                            Toast.makeText(this, "Berhasil hapus", Toast.LENGTH_LONG).show()
                            finish()
                        }else{
                            Toast.makeText(this, "Gagal hapus", Toast.LENGTH_LONG).show()
                        }
                    }
                }
                is Resource.Error ->{

                }
            }
        })

        viewModel.karyaMutable.observe(this, Observer { response ->
            when(response){
                is Resource.Success ->{
                    response?.data.let {
                        loadDataKarya(it)
                    }
                }
            }
        })


        viewModel.getPaketStudio(idStudio!!)
        viewModel.getKaryaResponse(idStudio!!)
        viewModel.getStudioItemResponse(idStudio!!)

    }

    private fun loadStudioItem(studio: ResponseItem<Studio>?) {

        dataBinding.studio = studio?.data

        dataBinding.rvLihatLokasi.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MapsStudioActivity::class.java)
            intent.putExtra("nama_studio", studio?.data?.namaStudio)
            intent.putExtra("lokasi", studio?.data?.lokasi)
            startActivity(intent)
        })

        Glide.with(this)
                .load(BuildConfig.BASE_URL_GAMBAR+studio?.data?.gambar)
                .into(dataBinding.ivPamflet)

        telp = studio?.data?.kontak

        dataBinding.tvCall.setOnClickListener {

            if (ActivityCompat.checkSelfPermission(
                            this,
                            Manifest.permission.CALL_PHONE
                    )
                    != PackageManager.PERMISSION_GRANTED
            ) {

                ActivityCompat.requestPermissions(
                        this,
                        arrayOf(Manifest.permission.CALL_PHONE),
                        MapsTerdekatActivity.REQUEST_CODE
                )
            }else{
                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "${studio?.data?.kontak}"))
                startActivity(intent)
            }
        }

    }


    override fun onRequestPermissionsResult(
            requestCode: Int,
            permissions: Array<String?>,
            grantResults: IntArray
    ) {
        when (requestCode) {
            MapsTerdekatActivity.REQUEST_CODE -> if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "$telp"))
                startActivity(intent)
            }
        }
    }

    private fun loadDataKarya(it: ResponseList<Karya>?) {
        it?.data?.let { it1 -> karyaAdapter.setListKarya(it1) }
    }

    private fun loadData(it: ResponseList<Paket>?) {
        it?.data?.let { it1 -> paketAdapter.setListPaket(it1) }
    }

    override fun onClickKarya(idKarya: String) {
        TODO("Not yet implemented")
    }
}