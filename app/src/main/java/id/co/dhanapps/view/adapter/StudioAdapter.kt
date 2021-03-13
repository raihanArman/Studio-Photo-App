package id.co.dhanapps.view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.co.dhanapps.BuildConfig
import id.co.dhanapps.R
import id.co.dhanapps.data.Studio
import id.co.dhanapps.databinding.ItemStudioBinding
import id.co.dhanapps.view.DetailStudioActivity

// menampilkan daftar list studio
class StudioAdapter(val context: Context): RecyclerView.Adapter<StudioAdapter.ViewHolder>() {

    private val listStudio = mutableListOf<Studio>()

    public fun setListStudio(studioList: List<Studio>){
        this.listStudio.clear()
        this.listStudio.addAll(studioList)
        notifyDataSetChanged()
    }

    inner class ViewHolder(val binding: ItemStudioBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ItemStudioBinding = DataBindingUtil.inflate(inflater, R.layout.item_studio, parent, false);
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val studio = listStudio[position]
        holder.binding.tvStudio.text = studio.namaStudio
        Glide.with(context)
            .load(BuildConfig.BASE_URL_GAMBAR+studio.gambar)
            .into(holder.binding.ivStudio)

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailStudioActivity::class.java)
            intent.putExtra("id_studio", studio?.idStudio)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int = listStudio.size

}