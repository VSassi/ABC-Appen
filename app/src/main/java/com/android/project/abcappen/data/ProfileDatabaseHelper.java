package com.android.project.abcappen.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ProfileDatabaseHelper extends SQLiteOpenHelper {

    public ProfileDatabaseHelper(Context context) {
        super(context, ProfileContract.DATABASE_NAME, null, ProfileContract.DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ProfileContract.Profile.CREATE_TABLE);
       // db.execSQL(ProfileContract.AlphabetProgress.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(ProfileContract.Profile.DROP_TABLE);
       // db.execSQL(ProfileContract.AlphabetProgress.DROP_TABLE);
        onCreate(db);
    }
}
