package id.co.dhanapps.data.response

import com.google.gson.annotations.SerializedName

// Response API berbentuk List
data class ResponseList<T> (
    @SerializedName("status")
    val status: String,

    @SerializedName("message")
    val message: String,

    @SerializedName("data")
    val data: List<T>
)