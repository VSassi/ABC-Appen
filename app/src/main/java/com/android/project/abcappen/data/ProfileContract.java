package com.android.project.abcappen.data;

import android.provider.BaseColumns;

public final class ProfileContract {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Profile.db";

    private ProfileContract() {}

    public static abstract class Profile implements BaseColumns {
        public static final String TABLE_NAME = "profiles";
        public static final String _ID = "profile_id";
        public static final String COL_NAME = "name";

        public static final String CREATE_TABLE =
                "CREATE TABLE " + Profile.TABLE_NAME + " (" +
                        Profile._ID + " INTEGER PRIMARY KEY," +
                        Profile.COL_NAME + " TEXT)";
        public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    }

    // Todo Structure for progress in both writing and reading

//    public static abstract class AlphabetProgress implements BaseColumns {
//        public static final String TABLE_NAME = "alphabet_progress";
//        public static final String COL_PROFILE_ID = "profile_id";
//        public static final String COL_LETTERS_COMPLETED = "letters_completed";
//
//        public static final String CREATE_TABLE =
//                "CREATE TABLE " + AlphabetProgress.TABLE_NAME + " (" +
//                        AlphabetProgress.COL_PROFILE_ID + " INTEGER," +
//                        AlphabetProgress.COL_LETTERS_COMPLETED + " INTEGER)";
//        public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
//    }
}
