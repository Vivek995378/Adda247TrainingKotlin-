package com.example.studymaterialadda247samplescreen.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase : RoomDatabase(){

    abstract fun contactDao() : ContactDAO

    companion object{
        @Volatile
        private var INSTANCE : ContactDatabase? = null

        fun getDatabase(context: Context) : ContactDatabase{
            if(INSTANCE == null){
                kotlin.synchronized(this){
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        ContactDatabase::class.java,
                        "contactDB").build()
                }

            }
            return INSTANCE!!
        }
    }

}