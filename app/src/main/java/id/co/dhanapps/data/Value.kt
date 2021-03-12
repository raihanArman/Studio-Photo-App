package id.co.dhanapps.data

import com.google.gson.annotations.SerializedName

data class Value (
    @SerializedName("value")
    val value: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data_studio")
    val studio: Studio

)