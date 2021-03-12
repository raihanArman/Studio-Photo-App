package id.co.dhanapps.view.login

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.co.dhanapps.repository.LoginRepository

class LoginViewModelProviderFactory(val app: Application, val loginRepository: LoginRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(app, loginRepository) as T
    }
}