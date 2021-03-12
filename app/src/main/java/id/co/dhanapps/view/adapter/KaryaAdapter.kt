package id.co.dhanapps.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.co.dhanapps.BuildConfig
import id.co.dhanapps.R
import id.co.dhanapps.data.Karya
import id.co.dhanapps.databinding.ItemKaryaBinding
import id.co.dhanapps.utils.OnClickKarya

class KaryaAdapter(val context: Context, val type: Int, val onClickKarya: OnClickKarya): RecyclerView.Adapter<KaryaAdapter.ViewHolder>() {
    private val listKarya = mutableListOf<Karya>()

    fun setListKarya(listKarya: List<Karya>){
        this.listKarya.clear()
        this.listKarya.addAll(listKarya)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val binding: ItemKaryaBinding = DataBindingUtil.inflate(inflater, R.layout.item_karya, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listKarya.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val karya = listKarya[position]
        Glide.with(context)
            .load(BuildConfig.BASE_URL_GAMBAR+karya.gambar)
            .into(holder.binding.ivKarya)

        if (type == 1){
            holder.itemView.setOnClickListener {

                karya?.idKarya?.let { onClickKarya.onClickKarya(it) }
            }
        }

    }


    inner class ViewHolder(val binding: ItemKaryaBinding): RecyclerView.ViewHolder(binding.root)

}