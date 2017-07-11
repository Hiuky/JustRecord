package com.dsc.justrecord.dataservice.helper;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by eric on 2017/7/11.
 */

public class DSCSQLiteHelper extends SQLiteOpenHelper {

    private final String TAG = "DSCSQLIteHelper";

    public DSCSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DSCSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.beginTransaction();
        try {
            String sqlCreate_Account = "create table account (id varchar )";
            String sqlCreate_EarnOrPayCategory = "";
            String sqlCreate_Member = "";
            db.execSQL(sqlCreate_Account);
            db.execSQL(sqlCreate_EarnOrPayCategory);
            db.execSQL(sqlCreate_Member);
            db.setTransactionSuccessful();
        } catch (Exception e) {
            Log.i(TAG, "执行数据库创建失败");
        } finally {
            db.endTransaction();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
