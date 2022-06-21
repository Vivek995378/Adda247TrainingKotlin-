package com.example.studymaterialadda247samplescreen.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.studymaterialadda247samplescreen.R
import com.example.studymaterialadda247samplescreen.database.Contact

class RoomDatabaseAdapter (private val mList: List<Contact>) : RecyclerView.Adapter<RoomDatabaseAdapter.DbViewHolder>(){

    class DbViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView)  {
        val serialNumber: TextView = itemView.findViewById(R.id.tvSerialNumber)
        val name: TextView = itemView.findViewById(R.id.tvName)
        val phoneNumber: TextView = itemView.findViewById(R.id.tvPhone)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DbViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_room_database, parent, false)

        return DbViewHolder(view)
    }

    override fun onBindViewHolder(holder: DbViewHolder, position: Int) {

        val Contact = mList[position]

        holder.serialNumber.text = Contact.id.toString()
        holder.name.text = Contact.name
        holder.phoneNumber.text = Contact.phone
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}