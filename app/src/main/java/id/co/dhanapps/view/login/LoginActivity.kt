package id.co.dhanapps.view.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import id.co.dhanapps.R
import id.co.dhanapps.databinding.ActivityLoginBinding
import id.co.dhanapps.repository.LoginRepository

class LoginActivity : AppCompatActivity() {

    //    variable yang tampilan dari Login activity
    lateinit var binding: ActivityLoginBinding


    //    variable yang mengambil data dari API
    lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        inisialisasi variable
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_login
        )
        val loginRepository = LoginRepository()
        val viewModelFactory = LoginViewModelProviderFactory(application, loginRepository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(LoginViewModel::class.java)


//        Menampilan Sign In
        setFragment(SignInFragment())

    }

    private fun setFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.replace(binding.frameLogin.id, fragment).commit()
    }

}