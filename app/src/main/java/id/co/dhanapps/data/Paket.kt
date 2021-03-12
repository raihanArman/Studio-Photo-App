package id.co.dhanapps.data

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class Paket(
    @SerializedName("id_paket")
    var idPaket: String ?= "",
    @SerializedName("nama_paket")
    var namaPaket: String ?= "",
    var deskripsi: String ?= "",
    var harga: String ?= ""
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(idPaket)
        parcel.writeString(namaPaket)
        parcel.writeString(deskripsi)
        parcel.writeString(harga)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Paket> {
        override fun createFromParcel(parcel: Parcel): Paket {
            return Paket(parcel)
        }

        override fun newArray(size: Int): Array<Paket?> {
            return arrayOfNulls(size)
        }
    }
}