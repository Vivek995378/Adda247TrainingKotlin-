package com.example.studymaterialadda247samplescreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.studymaterialadda247samplescreen.adapters.RoomDatabaseAdapter
import com.example.studymaterialadda247samplescreen.adapters.StudyMaterialAdapter
import com.example.studymaterialadda247samplescreen.database.Contact
import com.example.studymaterialadda247samplescreen.database.ContactDatabase
import com.example.studymaterialadda247samplescreen.model.StudyMaterialData
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var database: ContactDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerview.layoutManager = LinearLayoutManager(this)

//        var data: ArrayList<StudyMaterialData> = ArrayList()
       // val data = ArrayList<StudyMaterialData>()

//        data.add(StudyMaterialData(R.drawable.ic_shop, "Premium Study Material "))
//        data.add(StudyMaterialData(R.drawable.ic_paper, "Current Affairs "))
//        data.add(StudyMaterialData(R.drawable.ic_bag, "Job Alerts "))
//        data.add(StudyMaterialData(R.drawable.ic_notes, "Daily Quizzes "))
//        data.add(StudyMaterialData(R.drawable.ic_paper, "Subject-wise Quizzes "))
//        data.add(StudyMaterialData(R.drawable.ic_notes, "Notes and Articles "))
//        data.add(StudyMaterialData(R.drawable.ic_video, "Videos "))
//        data.add(StudyMaterialData(R.drawable.ic_shop, "Premium Study Material "))
//        data.add(StudyMaterialData(R.drawable.ic_paper, "Current Affairs "))
//        data.add(StudyMaterialData(R.drawable.ic_bag, "Job Alerts "))
//        data.add(StudyMaterialData(R.drawable.ic_notes, "Daily Quizzes "))
//        data.add(StudyMaterialData(R.drawable.ic_paper, "Subject-wise Quizzes "))
//        data.add(StudyMaterialData(R.drawable.ic_notes, "Notes and Articles "))
//        data.add(StudyMaterialData(R.drawable.ic_video, "Videos "))
//        data.add(StudyMaterialData(R.drawable.ic_shop, "Premium Study Material "))
//        data.add(StudyMaterialData(R.drawable.ic_paper, "Current Affairs "))
//        data.add(StudyMaterialData(R.drawable.ic_bag, "Job Alerts "))
//        data.add(StudyMaterialData(R.drawable.ic_notes, "Daily Quizzes "))
//        data.add(StudyMaterialData(R.drawable.ic_paper, "Subject-wise Quizzes "))
//        data.add(StudyMaterialData(R.drawable.ic_notes, "Notes and Articles "))
//        data.add(StudyMaterialData(R.drawable.ic_video, "Videos "))
//        data.add(StudyMaterialData(R.drawable.ic_shop, "Premium Study Material "))
//        data.add(StudyMaterialData(R.drawable.ic_paper, "Current Affairs "))
//        data.add(StudyMaterialData(R.drawable.ic_bag, "Job Alerts "))
//        data.add(StudyMaterialData(R.drawable.ic_notes, "Daily Quizzes "))
//        data.add(StudyMaterialData(R.drawable.ic_paper, "Subject-wise Quizzes "))
//        data.add(StudyMaterialData(R.drawable.ic_notes, "Notes and Articles "))
//        data.add(StudyMaterialData(R.drawable.ic_video, "Videos "))

//        val adapter = StudyMaterialAdapter(data)
        //List Adapter
//        val adapter = StudyMaterialAdapter()
//        adapter.submitList(data)

//        recyclerview.adapter = adapter

        /* Room Database */

        database = ContactDatabase.getDatabase(this)

        GlobalScope.launch {
            database.contactDao().insertContact(Contact(0 , "Vivek" , "0001"))
            database.contactDao().insertContact(Contact(0 , "Rahul" , "1323"))
            database.contactDao().insertContact(Contact(0 , "Sahil" , "3213"))
            database.contactDao().insertContact(Contact(0 , "Rohit" , "3345"))
            database.contactDao().insertContact(Contact(0 , "Aakash" , "2222"))
            database.contactDao().insertContact(Contact(0 , "Satyarth" , "5432"))
            database.contactDao().insertContact(Contact(0 , "Sonu" , "4567"))
            database.contactDao().insertContact(Contact(0 , "Siddhant" , "7653"))
            database.contactDao().insertContact(Contact(0 , "Prakhar" , "2542"))
            database.contactDao().insertContact(Contact(0 , "Altmas" , "9806"))
            database.contactDao().insertContact(Contact(0 , "Vivek" , "0001"))
            database.contactDao().insertContact(Contact(0 , "Rahul" , "1323"))
            database.contactDao().insertContact(Contact(0 , "Sahil" , "3213"))
            database.contactDao().insertContact(Contact(0 , "Rohit" , "3345"))
            database.contactDao().insertContact(Contact(0 , "Aakash" , "2222"))
            database.contactDao().insertContact(Contact(0 , "Satyarth" , "5432"))
            database.contactDao().insertContact(Contact(0 , "Sonu" , "4567"))
            database.contactDao().insertContact(Contact(0 , "Siddhant" , "7653"))
            database.contactDao().insertContact(Contact(0 , "Prakhar" , "2542"))
            database.contactDao().insertContact(Contact(0 , "Altmas" , "9806"))
            database.contactDao().insertContact(Contact(0 , "Vivek" , "0001"))
            database.contactDao().insertContact(Contact(0 , "Rahul" , "1323"))
            database.contactDao().insertContact(Contact(0 , "Sahil" , "3213"))
            database.contactDao().insertContact(Contact(0 , "Rohit" , "3345"))
            database.contactDao().insertContact(Contact(0 , "Aakash" , "2222"))
            database.contactDao().insertContact(Contact(0 , "Satyarth" , "5432"))
            database.contactDao().insertContact(Contact(0 , "Sonu" , "4567"))
            database.contactDao().insertContact(Contact(0 , "Siddhant" , "7653"))
            database.contactDao().insertContact(Contact(0 , "Prakhar" , "2542"))
            database.contactDao().insertContact(Contact(0 , "Altmas" , "9806"))

        }

        database.contactDao().getContact().observe(this , Observer {
            val adapter = RoomDatabaseAdapter(it)
            recyclerview.adapter = adapter
        })

    }

}