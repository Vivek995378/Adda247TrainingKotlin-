package com.example.studymaterialadda247samplescreen.adapters

import androidx.paging.PagedListAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
//import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.RecyclerView
import com.example.studymaterialadda247samplescreen.R
import com.example.studymaterialadda247samplescreen.adapters.StudyMaterialAdapter.*
import com.example.studymaterialadda247samplescreen.model.StudyMaterialData

//class StudyMaterialAdapter (private val mList: List<StudyMaterialData>) : RecyclerView.Adapter<StudyMaterialAdapter.SmViewHolder>(){
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmViewHolder {
//
//        val view = LayoutInflater.from(parent.context)
//            .inflate(R.layout.item_studymaterial, parent, false)
//
//        return SmViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: SmViewHolder, position: Int) {
//
//        val StudyMaterialData = mList[position]
//
//        holder.imageView.setImageResource(StudyMaterialData.image)
//
//        holder.textView.text = StudyMaterialData.text
//    }
//
//    override fun getItemCount(): Int {
//        return mList.size
//    }
//
//    class SmViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
//        val imageView: ImageView = itemView.findViewById(R.id.imageView)
//        val textView: TextView = itemView.findViewById(R.id.textView)
//    }
//
//}

//      List Adapter

//class StudyMaterialAdapter : ListAdapter<StudyMaterialData, ItemViewholder>(DiffCallback())  {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewholder {
//        return ItemViewholder(
//            LayoutInflater.from(parent.context)
//                .inflate(R.layout.item_studymaterial, parent, false)
//        )
//    }
//
//    override fun onBindViewHolder(holder: ItemViewholder, position: Int) {
//        holder.bind(getItem(position))
//    }
//
//    class ItemViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val imageView: ImageView = itemView.findViewById(R.id.imageView)
//        val textView: TextView = itemView.findViewById(R.id.textView)
//        fun bind(item: StudyMaterialData) = with(itemView) {
//
//            imageView.setImageResource(item.image)
//            textView.text = item.text
//
//        }
//    }
//}
//
//class DiffCallback : DiffUtil.ItemCallback<StudyMaterialData>() {
//
//    override fun areItemsTheSame(oldItem: StudyMaterialData, newItem: StudyMaterialData): Boolean {
//        return oldItem.text == newItem.text
//    }
//
//    override fun areContentsTheSame(oldItem: StudyMaterialData, newItem: StudyMaterialData): Boolean {
//        return oldItem == newItem
//    }
//}

//      PagedListAdapter

class StudyMaterialAdapter(private val mList: List<StudyMaterialData>) : PagedListAdapter<StudyMaterialData, ItemViewholder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewholder {
        return ItemViewholder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_studymaterial, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewholder, position: Int) {
        val studyMaterialData = getItem(position)
        if(studyMaterialData != null) {
            holder.bind(studyMaterialData)
        }
    }

    companion object {
        private val DIFF_CALLBACK = object :
            DiffUtil.ItemCallback<StudyMaterialData>() {
            override fun areItemsTheSame(oldConcert: StudyMaterialData,
                                         newConcert: StudyMaterialData) = oldConcert == newConcert

            override fun areContentsTheSame(oldConcert: StudyMaterialData,
                                            newConcert: StudyMaterialData) = oldConcert == newConcert
        }
    }

    class ItemViewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
        fun bind(item: StudyMaterialData) = with(itemView) {

            imageView.setImageResource(item.image)
            textView.text = item.text

        }
    }

}