package id.co.dhanapps.data.api

import id.co.dhanapps.data.*
import id.co.dhanapps.data.response.ResponseItem
import id.co.dhanapps.data.response.ResponseList
import retrofit2.Response
import retrofit2.http.*

// Mengambil data dari API
interface ApiService {
    @FormUrlEncoded
    @POST("login_user.php")
    suspend fun loginUser(
        @Field("email") username: String,
        @Field("password") password: String
    ) : Response<Value>


    @FormUrlEncoded
    @POST("register_user.php")
    suspend fun registerUser(
            @Field("email") username: String,
            @Field("password") password: String,
            @Field("nama") nama: String,
            @Field("lokasi") lokasi: String
    ) : Response<Value>

    @GET("tampil_studio.php")
    suspend fun getStudio() : Response<ResponseList<Studio>>

    @GET("tampil_paket.php")
    suspend fun getPaket(
        @Query("id_studio")idStudio: String
    ): Response<ResponseList<Paket>>

    @GET("tampil_karya.php")
    suspend fun getKarya(
        @Query("id_studio") idStudio: String
    ): Response<ResponseList<Karya>>

    @GET
    suspend fun getPath(
        @Url url: String
    ): Response<String>

    @GET("tampil_item_studio.php")
    suspend fun getStudioItem(
        @Query("id_studio") idStudio: String
    ): Response<ResponseItem<Studio>>

    @POST("edit_studio.php")
    suspend fun editStudio(
        @Body studio: Studio
    ): Response<Value>

    @FormUrlEncoded
    @POST("input_paket.php")
    suspend fun inputPaket(
         @Field("id_studio") idStudio: String,
         @Field("nama_paket") namaPaket: String,
         @Field("harga") harga: String
    ): Response<Value>

    @FormUrlEncoded
    @POST("edit_paket.php")
    suspend fun editPaket(
            @Field("id_paket") idStudio: String,
            @Field("nama_paket") namaPaket: String,
            @Field("harga") harga: String
    ): Response<Value>

    @FormUrlEncoded
    @POST("hapus_paket.php")
    suspend fun hapusPaket(
            @Field("id_paket") idStudio: String
    ): Response<Value>

    @FormUrlEncoded
    @POST("hapus_karya.php")
    suspend fun hapusKarya(
            @Field("id_karya") idKarya: String
    ): Response<Value>

    @FormUrlEncoded
    @POST("input_karya.php")
    suspend fun inputKarya(
            @Field("id_studio") idStudio: String,
            @Field("gambar") gambar: String
    ): Response<Value>

}