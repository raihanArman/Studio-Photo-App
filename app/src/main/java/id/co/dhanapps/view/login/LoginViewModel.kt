package id.co.dhanapps.view.login

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.net.NetworkInfo
import android.os.Build
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import id.co.dhanapps.GoStudioApplication
import id.co.dhanapps.data.Value
import id.co.dhanapps.repository.LoginRepository
import id.co.dhanapps.utils.Resource
import kotlinx.coroutines.launch
import retrofit2.Response
import java.io.IOException


// Mengambil data dari login repository
class LoginViewModel(val app: Application, val loginRepository: LoginRepository): AndroidViewModel(app) {
    val loginMutable: MutableLiveData<Resource<Value>> = MutableLiveData()
    val registerMutable: MutableLiveData<Resource<Value>> = MutableLiveData()

    var loginsRespopnse: Value?= null
    var registerResponse: Value?= null

    fun getRegisterUser(username: String, password: String, nama: String, lokasi: String) = viewModelScope.launch {
        safeRegisterUser(username, password, nama,lokasi)
    }

    private suspend fun safeRegisterUser(username: String, password: String, nama: String, lokasi: String) {
        registerMutable.postValue(Resource.Loading())

        try{
            if (hasInternetConnection()){
                val response = loginRepository.getRegisterUser(username, password, nama, lokasi)
                registerMutable.postValue(handleRegisterResponse(response))
            }else{
                registerMutable.postValue(Resource.Error("Tidak ada koneksi internet"))
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> registerMutable.postValue(Resource.Error("Network Failure"))
                else -> registerMutable.postValue(Resource.Error("${t.message}"))
            }
        }

    }

    private fun handleRegisterResponse(response: Response<Value>): Resource<Value>? {
        if(response.isSuccessful){
            response.body()?.let {
                registerResponse = it

                return Resource.Success(registerResponse ?: it)
            }
        }

        return Resource.Error(response.message())
    }

    fun getLoginUser(username: String, password: String) = viewModelScope.launch {
        safeLoginUser(username, password)
    }

    private suspend fun safeLoginUser(username: String, password: String) {
        loginMutable.postValue(Resource.Loading())

        try{
            if (hasInternetConnection()){
                val response = loginRepository.getLoginUser(username, password)
                loginMutable.postValue(handleLoginResponse(response))
            }else{
                loginMutable.postValue(Resource.Error("Tidak ada koneksi internet"))
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> loginMutable.postValue(Resource.Error("Network Failure"))
                else -> loginMutable.postValue(Resource.Error("${t.message}"))
            }
        }

    }

    private fun handleLoginResponse(response: Response<Value>): Resource<Value>? {
        if(response.isSuccessful){
            response.body()?.let {
                loginsRespopnse = it

                return Resource.Success(loginsRespopnse ?: it)
            }
        }

        return Resource.Error(response.message())

    }

    @SuppressLint("WrongConstant")
    private fun hasInternetConnection(): Boolean{
        val connectivityManager = app.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (connectivityManager != null) {
            val info = connectivityManager.allNetworkInfo
            if (info != null) {
                for (i in info.indices) {
                    if (info[i].state == NetworkInfo.State.CONNECTED) {
                        return true
                    }
                }
            }
        }
        return false


    }

}