package id.co.dhanapps.view.home

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import id.co.dhanapps.R
import id.co.dhanapps.databinding.ActivityMainBinding
import id.co.dhanapps.repository.HomeRepository
import id.co.dhanapps.utils.Constant
import id.co.dhanapps.view.MapsTerdekatActivity
import id.co.dhanapps.view.ProfilFragment
import id.co.dhanapps.view.login.LoginActivity

class MainActivity : AppCompatActivity() {

    private lateinit var dataBinding: ActivityMainBinding
    lateinit var viewModel: HomeViewModel
    var sharedPreferences: SharedPreferences? = null
    var statusLogin = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        sharedPreferences = getSharedPreferences(Constant.LOGIN_KEY, Context.MODE_PRIVATE)
        statusLogin = sharedPreferences?.getBoolean(Constant.LOGIN_STATUS, false)!!

        dataBinding.bottomNavigationView.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.nav_home -> {
                   setFragment(HomeFragment.newInstance())
                }
                R.id.nav_maps ->{
                    setFragment(MapsTerdekatActivity())
                }
                R.id.nav_studio ->{
                    if (statusLogin){
                        setFragment(ProfilFragment())
                    }else{
                        val builder = AlertDialog.Builder(this)
                        builder.setMessage("Anda belum login, login terlebih dahulu")
                        builder.setPositiveButton("Login") { dialogInterface, i ->
                            val intent = Intent(this, LoginActivity::class.java)
                            startActivity(intent)
                            dialogInterface.dismiss()
                        }
                        builder.setNegativeButton("Tidak") { dialogInterface, i -> dialogInterface.dismiss() }
                        builder.show()
                    }
                }
                R.id.nav_list ->{
                    setFragment(DaftarStudioFragment())
                }
            }
        }

        val homeRepository = HomeRepository()
        val viewModelFactory = HomeViewModelProviderFactory(application, homeRepository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(HomeViewModel::class.java)

        setFragment(HomeFragment.newInstance())

    }

    private fun setFragment(fragment: Fragment){
        val fm = supportFragmentManager.beginTransaction()
        fm.replace(dataBinding.frameMain.id, fragment)
        fm.commit()
    }

}