package id.co.dhanapps.view

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import id.co.dhanapps.R
import id.co.dhanapps.data.Paket
import id.co.dhanapps.databinding.ActivityInputPaketBinding
import id.co.dhanapps.repository.HomeRepository
import id.co.dhanapps.utils.Constant
import id.co.dhanapps.utils.Resource
import id.co.dhanapps.view.home.HomeViewModel
import id.co.dhanapps.view.home.HomeViewModelProviderFactory

class InputPaketActivity : AppCompatActivity() {
    lateinit var dataBinding: ActivityInputPaketBinding
    lateinit var viewModel: HomeViewModel
    var sharedPreferences: SharedPreferences? = null
    var idUser: String? = null
    var paket: Paket?= null
    var type: String ?= ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_paket)

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_input_paket)

        type = intent.getStringExtra("type")
        if (type == "edit"){
            paket = intent.getParcelableExtra("paket")
            dataBinding.paket = paket
            dataBinding.ivDelete.visibility = View.VISIBLE
            dataBinding.btnUpdate.text = "Update"
        }else{
            dataBinding.btnUpdate.text = "Input"
        }

        sharedPreferences = getSharedPreferences(Constant.LOGIN_KEY, Context.MODE_PRIVATE)
        idUser = sharedPreferences!!.getString(Constant.ID_USER_KEY, "")

        val homeRepository = HomeRepository()
        val viewModelfactory = HomeViewModelProviderFactory(application, homeRepository)
        viewModel = ViewModelProvider(this, viewModelfactory).get(HomeViewModel::class.java)

        viewModel.inputpaketMutable.observe(this, Observer { response ->
            when(response){
                is Resource.Success ->{
                    response.data?.let {
                        if (it.value == 1){
                            Toast.makeText(this, "Berhasil tambah paket", Toast.LENGTH_LONG).show()
                            finish()
                        }else{
                            Toast.makeText(this, "Gagal tambah paket", Toast.LENGTH_LONG).show()
                        }
                    }
                }
                is Resource.Error ->{

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

        dataBinding.btnUpdate.setOnClickListener {
            if(type == "input") {
                inputPaket()
            }else{
                editPaket()
            }
        }

        dataBinding.ivDelete.setOnClickListener {
            paket?.idPaket?.let { it1 -> viewModel.hapusPaket(it1) }
        }

    }

    private fun editPaket() {
        val namapaket = dataBinding.etNama.text.toString()
        val harga = dataBinding.etHarga.text.toString()

        idUser?.let {
            paket?.idPaket?.let { it1 -> viewModel.getEditPaket(it1, namapaket, harga) }
        }
    }

    private fun inputPaket() {
        val namapaket = dataBinding.etNama.text.toString()
        val harga = dataBinding.etHarga.text.toString()

        idUser?.let {
            viewModel.getInputPaket(it, namapaket, harga)
        }

    }


}