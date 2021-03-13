package id.co.dhanapps.repository

import id.co.dhanapps.data.Studio
import id.co.dhanapps.data.api.RetrofitRequest


// Mengambil data dari class ApiReqeust untuk data Home
class HomeRepository {
    suspend fun getStudio() =
            RetrofitRequest.api.getStudio()

    suspend fun getPaketStudio(idStudio: String) =
        RetrofitRequest.api.getPaket(idStudio)

    suspend fun getRoute(path: String) =
            RetrofitRequest.apiMaps.getPath(path)

    suspend fun getKarya(idStudio: String) =
        RetrofitRequest.api.getKarya(idStudio)

    suspend fun getStudioItem(idStudio: String) =
        RetrofitRequest.api.getStudioItem(idStudio)

    suspend fun editStudio(studio: Studio) =
        RetrofitRequest.api.editStudio(studio)

    suspend fun inputPaket(idStudio: String, namaPaket: String, harga: String) =
            RetrofitRequest.api.inputPaket(idStudio, namaPaket, harga)

    suspend fun inputKarya(idStudio: String, gambar: String) =
            RetrofitRequest.api.inputKarya(idStudio, gambar)

    suspend fun editPaket(idPaket: String, namaPaket: String,  harga: String) =
            RetrofitRequest.api.inputPaket(idPaket, namaPaket, harga)

    suspend fun hapusPaket(idPaket: String) =
            RetrofitRequest.api.hapusPaket(idPaket)

    suspend fun hapusKarya(idPaket: String) =
            RetrofitRequest.api.hapusKarya(idPaket)
}