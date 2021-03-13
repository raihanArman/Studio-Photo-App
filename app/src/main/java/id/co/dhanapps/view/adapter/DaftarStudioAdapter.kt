package id.co.dhanapps.view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.co.dhanapps.BuildConfig
import id.co.dhanapps.R
import id.co.dhanapps.data.Studio
import id.co.dhanapps.databinding.ItemDaftarStudioBinding
import id.co.dhanapps.view.DetailStudioActivity

// menampilkan daftar list studio
class DaftarStudioAdapter(val context: Context): RecyclerView.Adapter<DaftarStudioAdapter.ViewHolder>() {

    val listStudio = mutableListOf<Studio>()

    fun setStudioList(listStudio: List<Studio>){
        this.listStudio.clear()
        this.listStudio.addAll(listStudio)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ItemDaftarStudioBinding = DataBindingUtil.inflate(inflater, R.layout.item_daftar_studio, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = listStudio.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val studio = listStudio[position]

        Glide.with(context)
            .load(BuildConfig.BASE_URL_GAMBAR+studio?.gambar)
            .into(holder.binding.ivStudio)

        holder.binding.tvStudio.text = studio?.namaStudio

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailStudioActivity::class.java)
            intent.putExtra("id_studio", studio?.idStudio)
            context.startActivity(intent)
        }
    }


    inner class ViewHolder(val binding: ItemDaftarStudioBinding): RecyclerView.ViewHolder(binding.root)

}