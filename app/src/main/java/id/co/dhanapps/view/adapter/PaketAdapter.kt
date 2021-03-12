package id.co.dhanapps.view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import id.co.dhanapps.R
import id.co.dhanapps.data.Paket
import id.co.dhanapps.databinding.ItemPaketBinding
import id.co.dhanapps.view.InputPaketActivity

class PaketAdapter(val context: Context, val type: Int): RecyclerView.Adapter<PaketAdapter.ViewHolder>() {

    private val listPaket = mutableListOf<Paket>()


    public fun setListPaket(paket: List<Paket>){
        this.listPaket.clear()
        this.listPaket.addAll(paket)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ItemPaketBinding = DataBindingUtil.inflate(inflater, R.layout.item_paket, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val paket = listPaket[position]
        holder.binding.paket = paket

        if(type == 1){
            holder.itemView.setOnClickListener {
                val intent = Intent(context, InputPaketActivity::class.java)
                intent.putExtra("paket", paket)
                intent.putExtra("type", "edit")
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return listPaket.size
    }

    inner class ViewHolder(val binding: ItemPaketBinding): RecyclerView.ViewHolder(binding.root)

}