package dev.rehema.assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NumberRecyclerViewAdapter (var  numberList:List<Int>): RecyclerView.Adapter<NamesViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
            var itemView= LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclernumberviewadapter,parent,false)
            return NamesViewHolder(itemView)

        }

        override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
            holder.tvNumbers.text = numberList.get(position).toString()
        }

        override fun getItemCount(): Int {
            return numberList.size
        }
    }
    class NamesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var  tvNumbers=itemView.findViewById<TextView>(R.id.tvNumbers)
    }

