package id.co.dhanapps.view.home

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import id.co.dhanapps.data.*
import id.co.dhanapps.data.response.ResponseItem
import id.co.dhanapps.data.response.ResponseList
import id.co.dhanapps.repository.HomeRepository
import id.co.dhanapps.utils.Resource
import id.co.kimopay.util.SingleLiveEvent
import kotlinx.coroutines.launch
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import retrofit2.Response
import java.io.IOException

// Mengambil data dari home repository
class HomeViewModel(val app: Application, val homeRepository: HomeRepository): AndroidViewModel(app) {

    val homeMutable: MutableLiveData<Resource<Home>> = MutableLiveData()
    val daftarStudioMutable: MutableLiveData<Resource<ResponseList<Studio>>> = MutableLiveData()
    val paketMutable: MutableLiveData<Resource<ResponseList<Paket>>> = MutableLiveData()
    val routeMutable: MutableLiveData<Resource<String>> = MutableLiveData()
    val karyaMutable: MutableLiveData<Resource<ResponseList<Karya>>> = MutableLiveData()
    val studioItemMutable: SingleLiveEvent<Resource<ResponseItem<Studio>>> = SingleLiveEvent()
    val editStudioMutable: SingleLiveEvent<Resource<Value>> = SingleLiveEvent()
    val inputpaketMutable: MutableLiveData<Resource<Value>> = MutableLiveData()
    val inputKaryaMutable: MutableLiveData<Resource<Value>> = MutableLiveData()
    val editPaketMutable: MutableLiveData<Resource<Value>> = MutableLiveData()
    val hapusPaketMutable: MutableLiveData<Resource<Value>> = MutableLiveData()
    val hapusKaryaMutable: MutableLiveData<Resource<Value>> = MutableLiveData()

    var homeResponse: Home ?= null
    var paketStudioResponse : ResponseList<Paket>?= null
    var routeResponse : String ?= null
    var karyaResponse: ResponseList<Karya>?= null
    var studioItemResponse: ResponseItem<Studio>?= null
    var editStudioResponse: Value ?= null
    var daftarStudioResponse: ResponseList<Studio>?= null
    var inputPaketResponse : Value ?= null
    var inputKaryaResponse: Value ?= null
    var hapusPaketResponse : Value ?= null
    var editPaketResponse: Value ?= null
    var hapusKaryaResponse: Value ?= null

    fun hapusKarya(idKarya: String) = viewModelScope.launch {
        safeHapusKarya(idKarya)
    }

    private suspend fun safeHapusKarya(idKarya: String) {
        hapusKaryaMutable.postValue(Resource.Loading())
        try{
            if(hasInternetConnection()){
                val response = homeRepository.hapusKarya(idKarya)
                hapusKaryaMutable.postValue(handleHapusKarya(response))
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> hapusKaryaMutable.postValue(Resource.Error("Network Failure"))
                else -> hapusKaryaMutable.postValue(Resource.Error("${t.message}"))
            }
        }
    }

    private fun handleHapusKarya(response: Response<Value>): Resource<Value>? {
        if(response.isSuccessful){
            response.body()?.let {
                hapusKaryaResponse = it
                return Resource.Success(hapusKaryaResponse ?: it)
            }
        }else{
            return Resource.Error("Ada yang salah")
        }

        return Resource.Error("${response.message()}")
    }

    fun hapusPaket(idPaket: String) = viewModelScope.launch {
        safeHapusPaket(idPaket)
    }

    private suspend fun safeHapusPaket(idPaket: String) {
        hapusPaketMutable.postValue(Resource.Loading())
        try{
            if(hasInternetConnection()){
                val response = homeRepository.hapusPaket(idPaket)
                hapusPaketMutable.postValue(handleHapusPaket(response))
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> hapusPaketMutable.postValue(Resource.Error("Network Failure"))
                else -> hapusPaketMutable.postValue(Resource.Error("${t.message}"))
            }
        }
    }

    private fun handleHapusPaket(response: Response<Value>): Resource<Value>? {
        if(response.isSuccessful){
            response.body()?.let {
                hapusPaketResponse = it
                return Resource.Success(hapusPaketResponse ?: it)
            }
        }else{
            return Resource.Error("Ada yang salah")
        }

        return Resource.Error("${response.message()}")
    }

    fun getEditPaket(idPaket: String, namaPaket: String, harga: String) = viewModelScope.launch {
        safeEditPaket(idPaket, namaPaket, harga)
    }

    private suspend fun safeEditPaket(idPaket: String, namaPaket: String, harga: String) {
        editPaketMutable.postValue(Resource.Loading())
        try{
            if(hasInternetConnection()){
                val response = homeRepository.editPaket(idPaket, namaPaket, harga)
                editPaketMutable.postValue(handleEditPaket(response))
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> editPaketMutable.postValue(Resource.Error("Network Failure"))
                else -> editPaketMutable.postValue(Resource.Error("${t.message}"))
            }
        }
    }

    private fun handleEditPaket(response: Response<Value>): Resource<Value>? {

        if(response.isSuccessful){
            response.body()?.let {
                editPaketResponse = it
                return Resource.Success(editPaketResponse ?: it)
            }
        }else{
            return Resource.Error("Ada yang salah")
        }

        return Resource.Error("${response.message()}")
    }

    fun getInputKarya(idStudio: String, gambar: String) = viewModelScope.launch {
        safeInputKarya(idStudio, gambar)
    }

    private suspend fun safeInputKarya(idStudio: String, gambar: String) {
        inputKaryaMutable.postValue(Resource.Loading())
        try{
            if(hasInternetConnection()){
                val response = homeRepository.inputKarya(idStudio, gambar)
                inputKaryaMutable.postValue(handleInputKarya(response))
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> inputKaryaMutable.postValue(Resource.Error("Network Failure"))
                else -> inputKaryaMutable.postValue(Resource.Error("${t.message}"))
            }
        }
    }

    private fun handleInputKarya(response: Response<Value>): Resource<Value>? {
        if(response.isSuccessful){
            response.body()?.let {
                inputKaryaResponse = it
                return Resource.Success(inputKaryaResponse ?: it)
            }
        }else{
            return Resource.Error("Ada yang salah")
        }

        return Resource.Error("${response.message()}")
    }

    fun getInputPaket(idStudio: String, namaPaket: String,  harga: String) = viewModelScope.launch {
        safeInputPaket(idStudio, namaPaket, harga)
    }

    private suspend fun safeInputPaket(idStudio: String, namaPaket: String, harga: String) {
        inputpaketMutable.postValue(Resource.Loading())
        try{
            if(hasInternetConnection()){
                val response = homeRepository.inputPaket(idStudio, namaPaket, harga)
                inputpaketMutable.postValue(handleInputPaket(response))
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> inputpaketMutable.postValue(Resource.Error("Network Failure"))
                else -> inputpaketMutable.postValue(Resource.Error("${t.message}"))
            }
        }
    }

    private fun handleInputPaket(response: Response<Value>): Resource<Value>? {
        if(response.isSuccessful){
            response.body()?.let {
                inputPaketResponse = it
                return Resource.Success(inputPaketResponse ?: it)
            }
        }else{
            return Resource.Error("Ada yang salah")
        }

        return Resource.Error("${response.message()}")
    }

    fun getDdaftarStudio() = viewModelScope.launch {
        safeDaftarStudio()
    }

    private suspend fun safeDaftarStudio(){
        daftarStudioMutable.postValue(Resource.Loading())
        try{
            if(hasInternetConnection()){
                val response = homeRepository.getStudio()
                daftarStudioMutable.postValue(handleDaftarStudio(response))
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> daftarStudioMutable.postValue(Resource.Error("Network Failure"))
                else -> daftarStudioMutable.postValue(Resource.Error("${t.message}"))
            }
        }
    }

    private fun handleDaftarStudio(response: Response<ResponseList<Studio>>): Resource<ResponseList<Studio>>? {
        if(response.isSuccessful){
            response.body()?.let {
                daftarStudioResponse = it
                return Resource.Success(daftarStudioResponse ?: it)
            }
        }else{
            return Resource.Error("Ada yang salah")
        }

        return Resource.Error("${response.message()}")
    }

    fun getEditStudio(studio: Studio) = viewModelScope.launch {
        safeEditStudio(studio)
    }

    private suspend fun safeEditStudio(studio: Studio) {
        editStudioMutable.postValue(Resource.Loading())
        try{
            if(hasInternetConnection()){
                val response = homeRepository.editStudio(studio)
                editStudioMutable.postValue(handleEditStudio(response))
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> editStudioMutable.postValue(Resource.Error("Network Failure"))
                else -> editStudioMutable.postValue(Resource.Error("${t.message}"))
            }
        }
    }

    private fun handleEditStudio(response: Response<Value>): Resource<Value>? {
        if(response.isSuccessful){
            response.body()?.let {
                editStudioResponse = it
                return Resource.Success(editStudioResponse ?: it)
            }
        }else{
            return Resource.Error("Ada yang salah")
        }

        return Resource.Error("${response.message()}")
    }

    fun getStudioItemResponse(idStudio: String) = viewModelScope.launch {
        safeStudioItem(idStudio)
    }

    private suspend fun safeStudioItem(idStudio: String) {
        studioItemMutable.postValue(Resource.Loading())
        try{
            if(hasInternetConnection()){
                val response = homeRepository.getStudioItem(idStudio)
                studioItemMutable.postValue(handleStudioItemResponse(response))
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> studioItemMutable.postValue(Resource.Error("Network Failure"))
                else -> studioItemMutable.postValue(Resource.Error("${t.message}"))
            }
        }
    }

    private fun handleStudioItemResponse(response: Response<ResponseItem<Studio>>): Resource<ResponseItem<Studio>>? {
        if(response.isSuccessful){
            response.body()?.let {
                studioItemResponse = it
                return Resource.Success(studioItemResponse ?: it)
            }
        }else{
            return Resource.Error("Ada yang salah")
        }

        return Resource.Error("${response.message()}")
    }

    fun getKaryaResponse(idStudio: String) = viewModelScope.launch {
        safeKarya(idStudio)
    }

    private suspend fun safeKarya(idStudio: String) {
        karyaMutable.postValue(Resource.Loading())
        try{
            if(hasInternetConnection()){
                val response = homeRepository.getKarya(idStudio)
                karyaMutable.postValue(handleKaryaResponse(response))
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> routeMutable.postValue(Resource.Error("Network Failure"))
                else -> routeMutable.postValue(Resource.Error("${t.message}"))
            }
        }
    }

    private fun handleKaryaResponse(response: Response<ResponseList<Karya>>): Resource<ResponseList<Karya>>? {
        if(response.isSuccessful){
            response.body()?.let {
                karyaResponse = it
                return Resource.Success(karyaResponse ?: it)
            }
        }else{
            return Resource.Error("Ada yang salah")
        }

        return Resource.Error("${response.message()}")
    }

    fun getRouteResponse(path: String) = viewModelScope.launch {
        safeRoute(path)
    }

    private suspend fun safeRoute(path: String) {
        routeMutable.postValue(Resource.Loading())
        try{
            if(hasInternetConnection()){
                val response = homeRepository.getRoute(path)
                routeMutable.postValue(handleRouteResponse(response))
            }else{

            }
        }catch (t: Throwable){
            when(t){
                is IOException -> routeMutable.postValue(Resource.Error("Network Failure"))
                else -> routeMutable.postValue(Resource.Error("${t.message}"))
            }
        }
    }

    private fun handleRouteResponse(response: Response<String>): Resource<String>? {
        if(response.isSuccessful){
            response.body()?.let {
                routeResponse = it
                return Resource.Success(routeResponse ?: it)
            }
        }else{
            return Resource.Error("Ada yang salah")
        }

        return Resource.Error("${response.message()}")
    }

    fun getHome(){
        viewModelScope.launch {
            safeHome()
        }
    }

    fun getPaketStudio(idStudio: String) = viewModelScope.launch {
        safePaketStudio(idStudio)
    }

    private suspend fun safePaketStudio(idStudio: String) {
        paketMutable.postValue(Resource.Loading())
        try{
            if (hasInternetConnection()){
                val response = homeRepository.getPaketStudio(idStudio)
                paketMutable.postValue(handlePaketStuadio(response))
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> paketMutable.postValue(Resource.Error("Network Failure"))
                else -> paketMutable.postValue(Resource.Error("${t.message}"))
            }
        }
    }

    private fun handlePaketStuadio(response: Response<ResponseList<Paket>>): Resource<ResponseList<Paket>>? {
        if (response.isSuccessful){
            response.body()?.let {
                paketStudioResponse = it
                return Resource.Success(paketStudioResponse ?: it)
            }
        }else{
            return Resource.Error("Ada yang salah")
        }

        return Resource.Error("${response.message()}")
    }


    private suspend fun safeHome() {
        homeMutable.postValue(Resource.Loading())
        try {
            if (hasInternetConnection()){

                coroutineScope {
                    val response1Deffered =  async{homeRepository.getStudio()}
                    val response2Deffered =  async {homeRepository.getStudio()}

                    val home1FromApi = response1Deffered.await()
                    val home2FromApi = response2Deffered.await()

                    val home = Home()

                    if (home1FromApi.isSuccessful){
                        home1FromApi.body()?.let {
                            home.listHome = it.data
                        }

                        if (home2FromApi.isSuccessful){
                            home2FromApi.body()?.let {
                                home.listHome2 = it.data

                                homeMutable.postValue(Resource.Success(home))
                            }
                        }

                    }

                }
            }
        }catch (t: Throwable){
            when(t){
                is IOException -> homeMutable.postValue(Resource.Error("Network Failure"))
                else -> homeMutable.postValue(Resource.Error("${t.message}"))
            }
        }
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