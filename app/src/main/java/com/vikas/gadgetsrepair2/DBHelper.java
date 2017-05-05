package com.vikas.gadgetsrepair2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "repairnow";
    private static final int DATABASE_VERSION = 1;
    private static final String STUDENT_TABLE = "shops";
    private static final String STU_TABLE = "create table " +STUDENT_TABLE +"(name TEXT primary key,address TEXT,phone TEXT,rating TEXT,agent TEXT)";

    Context context;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(STU_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + STUDENT_TABLE);

        // Create tables again
        onCreate(db);
    }

    /* Insert into database*/
    public void insertIntoDB(String name, String address, String phone, String rating,String agent) {
        Log.d("insert", "before insert");

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. create ContentValues to add key "column"/value
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("address", address);
        values.put("phone", phone);
        values.put("rating", rating);
        values.put("agent", agent);

        // 3. insert
        db.insert(STUDENT_TABLE, null, values);
        // 4. close
        db.close();
        Toast.makeText(context, "insert value", Toast.LENGTH_LONG);
        Log.i("insert into DB", "After insert");
    }

    /* Retrive  data from database */
    public List<DatabaseModel2> getDataFromDB() {
        List<DatabaseModel2> modelList = new ArrayList<DatabaseModel2>();
        String query = "select * from " + STUDENT_TABLE;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        //Cursor cursor = db.rawQuery("SELECT * FROM " +STUDENT_TABLE+
        // " WHERE device = 'Desktop' COLLATE NOCASE AND brand = 'Apple' COLLATE NOCASE AND type = 'Keyboard' COLLATE NOCASE", null);

        if (cursor.moveToFirst()) {
            do {
                DatabaseModel2 model = new DatabaseModel2();
                model.setName(cursor.getString(0));
                model.setAddress(cursor.getString(1));
                model.setPhone(cursor.getString(2));
                model.setRating(cursor.getString(3));
                model.setAgent(cursor.getString(4));

                modelList.add(model);
            } while (cursor.moveToNext());
        }


        Log.d("shops data", modelList.toString());


        return modelList;
    }

    public void deleteARow(String name){
        SQLiteDatabase db= this.getWritableDatabase();
        db.delete(STUDENT_TABLE,"name=?", new String[]{ name });
        db.close();
    }

}