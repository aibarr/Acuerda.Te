package com.wakaru.acuerdate.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Alfredo on 02-07-2015.
 */
public class taskReader extends SQLiteOpenHelper {

    public taskReader(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context,
                name="acuerdate",
                factory=null,
                version=1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
