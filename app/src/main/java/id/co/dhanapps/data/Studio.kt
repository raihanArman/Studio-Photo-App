package id.co.dhanapps.data

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class Studio (
    @SerializedName("id_studio")
    var idStudio: String? = "",
    @SerializedName("nama_studio")
    var namaStudio: String ?= "",
    @SerializedName("deskripsi")
    var desrkripsi: String ?= "",
    @SerializedName("kontak")
    var kontak: String ?= "",
    @SerializedName("gambar")
    var gambar: String ?= "",
    @SerializedName("lokasi")
    var lokasi: String ?= "",
    var listPaket : List<Paket> ?= null,

    @SerializedName("username")
    var username: String ?= "",
    @SerializedName("email")
    var email: String ?= ""
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.createTypedArrayList(Paket)
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(idStudio)
        parcel.writeString(namaStudio)
        parcel.writeString(desrkripsi)
        parcel.writeString(kontak)
        parcel.writeString(gambar)
        parcel.writeString(lokasi)
        parcel.writeTypedList(listPaket)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Studio> {
        override fun createFromParcel(parcel: Parcel): Studio {
            return Studio(parcel)
        }

        override fun newArray(size: Int): Array<Studio?> {
            return arrayOfNulls(size)
        }
    }
}