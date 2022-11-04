package com.devmasterteam.convidados.repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.devmasterteam.convidados.constants.DataBaseConstants

class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {

    companion object {
        private const val NAME = "guestdb"
        private const val VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        // Criação do banco
        db.execSQL("create table" +DataBaseConstants.GUEST.TABLE_NAME+ "(" +
                DataBaseConstants.GUEST.COLUMNS.ID + " integer primary key autoincrement, " +
                DataBaseConstants.GUEST.COLUMNS.NAME + " text, " +
                DataBaseConstants.GUEST.COLUMNS.PRESENCE + " integer);")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    }
}