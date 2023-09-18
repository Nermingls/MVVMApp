package com.nermingules.kampguniki.ui


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nermingules.kampguniki.databinding.ItemOgrenciBinding


class AlbumsAdapter(var albumler: ArrayList<AlbumModelItem>, var onClik: (Int) -> Unit,var onDelete:(Int) ->Unit) :
    RecyclerView.Adapter<AlbumsAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: ItemOgrenciBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemOgrenciBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            binding.apply {
                textView.text = albumler[position].title
                cardView.setOnClickListener {
                    onClik(position)
                }
                imageButtonDelete.setOnClickListener {
                    onDelete(position)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return albumler.size
    }
}