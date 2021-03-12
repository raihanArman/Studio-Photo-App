package id.co.dhanapps.data

import com.google.gson.annotations.SerializedName

data class Karya (
    @SerializedName("id_studio")
    var idStudio: String ?= "",

    @SerializedName("id_karya")
    var idKarya: String ?= "",

    @SerializedName("gambar")
    var gambar: String ?= ""
)