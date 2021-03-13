package id.co.dhanapps.data.response

import com.google.gson.annotations.SerializedName

// Response API berbentuk Objek
data class ResponseItem<T> (
    @SerializedName("status")
    val status: String,

    @SerializedName("message")
    val message: String,

    @SerializedName("data")
    val data: T
)