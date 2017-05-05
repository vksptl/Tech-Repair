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

/**
 * Created by PRABHU on 11/12/2015.
 */
public class DatabaseHelpher extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="techrepair";
    private static final int DATABASE_VERSION = 1;
    private static final String STUDENT_TABLE = "parts";
    private static final String STU_TABLE = "create table "+STUDENT_TABLE +"(device TEXT,brand TEXT,type TEXT,part TEXT primary key)";

Context context;

    public DatabaseHelpher(Context context) {
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
    public void insertIntoDB(String device, String brand, String type, String part){
        Log.d("insert", "before insert");

        // 1. get reference to writable DB
        SQLiteDatabase db = this.getWritableDatabase();

        // 2. create ContentValues to add key "column"/value
        ContentValues values = new ContentValues();
        values.put("device", device);
        values.put("brand", brand);
        values.put("type", type);
        values.put("part", part);

        // 3. insert
        db.insert(STUDENT_TABLE, null, values);
        // 4. close
        db.close();
        Toast.makeText(context, "insert value", Toast.LENGTH_LONG);
        Log.i("insert into DB", "After insert");
    }
/* Retrive  data from database */
    public List<DatabaseModel> getDataFromDB(){
        List<DatabaseModel> modelList = new ArrayList<DatabaseModel>();
      //  String query = "select * from "+STUDENT_TABLE;

        SQLiteDatabase db = this.getWritableDatabase();
            //  Cursor c = db.rawQuery(query,null);

        Cursor cursor = db.rawQuery("SELECT * FROM " +STUDENT_TABLE+
                " WHERE device = 'Desktop' COLLATE NOCASE AND brand = 'Apple' COLLATE NOCASE AND type = 'Keyboard' COLLATE NOCASE", null);

        if (cursor.moveToFirst()){
            do {
                DatabaseModel model = new DatabaseModel();
                model.setDevice(cursor.getString(0));
                model.setBrand(cursor.getString(1));
                model.setType(cursor.getString(2));
                model.setPart(cursor.getString(3));

                modelList.add(model);
            }while (cursor.moveToNext());
        }


        Log.d("parts data", modelList.toString());


        return modelList;
    }

    public List<DatabaseModel> getDataFromDBB(){
        List<DatabaseModel> modelList = new ArrayList<DatabaseModel>();
        //  String query = "select * from "+STUDENT_TABLE;

        SQLiteDatabase db = this.getWritableDatabase();
        //  Cursor c = db.rawQuery(query,null);

        Cursor cursor = db.rawQuery("SELECT * FROM " +STUDENT_TABLE+
                " WHERE device = 'Desktop' COLLATE NOCASE AND brand = 'Apple' COLLATE NOCASE AND type = 'Monitor' COLLATE NOCASE", null);

        if (cursor.moveToFirst()){
            do {
                DatabaseModel model = new DatabaseModel();
                model.setDevice(cursor.getString(0));
                model.setBrand(cursor.getString(1));
                model.setType(cursor.getString(2));
                model.setPart(cursor.getString(3));

                modelList.add(model);
            }while (cursor.moveToNext());
        }


        Log.d("parts data", modelList.toString());


        return modelList;
    }

    public List<DatabaseModel> getDataFromDBb(){
        List<DatabaseModel> modelList = new ArrayList<DatabaseModel>();
        //  String query = "select * from "+STUDENT_TABLE;

        SQLiteDatabase db = this.getWritableDatabase();
        //  Cursor c = db.rawQuery(query,null);

        Cursor cursor = db.rawQuery("SELECT * FROM " +STUDENT_TABLE+
                " WHERE device = 'Laptop' COLLATE NOCASE AND brand = 'Dell' COLLATE NOCASE AND type = 'Screen' COLLATE NOCASE", null);

        if (cursor.moveToFirst()){
            do {
                DatabaseModel model = new DatabaseModel();
                model.setDevice(cursor.getString(0));
                model.setBrand(cursor.getString(1));
                model.setType(cursor.getString(2));
                model.setPart(cursor.getString(3));

                modelList.add(model);
            }while (cursor.moveToNext());
        }


        Log.d("parts data", modelList.toString());


        return modelList;
    }

    public List<DatabaseModel> getDataFromDBm(){
        List<DatabaseModel> modelList = new ArrayList<DatabaseModel>();
        //  String query = "select * from "+STUDENT_TABLE;

        SQLiteDatabase db = this.getWritableDatabase();
        //  Cursor c = db.rawQuery(query,null);

        Cursor cursor = db.rawQuery("SELECT * FROM " +STUDENT_TABLE+
                " WHERE device = 'Laptop' COLLATE NOCASE AND brand = 'HP' COLLATE NOCASE AND type = 'Motherboard' COLLATE NOCASE", null);

        if (cursor.moveToFirst()){
            do {
                DatabaseModel model = new DatabaseModel();
                model.setDevice(cursor.getString(0));
                model.setBrand(cursor.getString(1));
                model.setType(cursor.getString(2));
                model.setPart(cursor.getString(3));

                modelList.add(model);
            }while (cursor.moveToNext());
        }


        Log.d("parts data", modelList.toString());


        return modelList;
    }

    public List<DatabaseModel> getDataFromDBs(){
        List<DatabaseModel> modelList = new ArrayList<DatabaseModel>();
        //  String query = "select * from "+STUDENT_TABLE;

        SQLiteDatabase db = this.getWritableDatabase();
        //  Cursor c = db.rawQuery(query,null);

        Cursor cursor = db.rawQuery("SELECT * FROM " +STUDENT_TABLE+
                " WHERE device = 'Mobile' COLLATE NOCASE AND brand = 'Samsung' COLLATE NOCASE AND type = 'Camera' COLLATE NOCASE", null);

        if (cursor.moveToFirst()){
            do {
                DatabaseModel model = new DatabaseModel();
                model.setDevice(cursor.getString(0));
                model.setBrand(cursor.getString(1));
                model.setType(cursor.getString(2));
                model.setPart(cursor.getString(3));

                modelList.add(model);
            }while (cursor.moveToNext());
        }


        Log.d("parts data", modelList.toString());


        return modelList;
    }

    public List<DatabaseModel> getDataFromDBsb(){
        List<DatabaseModel> modelList = new ArrayList<DatabaseModel>();
        //  String query = "select * from "+STUDENT_TABLE;

        SQLiteDatabase db = this.getWritableDatabase();
        //  Cursor c = db.rawQuery(query,null);

        Cursor cursor = db.rawQuery("SELECT * FROM " +STUDENT_TABLE+
                " WHERE device = 'Mobile' COLLATE NOCASE AND brand = 'Sony' COLLATE NOCASE AND type = 'Battery' COLLATE NOCASE", null);

        if (cursor.moveToFirst()){
            do {
                DatabaseModel model = new DatabaseModel();
                model.setDevice(cursor.getString(0));
                model.setBrand(cursor.getString(1));
                model.setType(cursor.getString(2));
                model.setPart(cursor.getString(3));

                modelList.add(model);
            }while (cursor.moveToNext());
        }


        Log.d("parts data", modelList.toString());


        return modelList;
    }

    public List<DatabaseModel> getDataFromDBts(){
        List<DatabaseModel> modelList = new ArrayList<DatabaseModel>();
        //  String query = "select * from "+STUDENT_TABLE;

        SQLiteDatabase db = this.getWritableDatabase();
        //  Cursor c = db.rawQuery(query,null);

        Cursor cursor = db.rawQuery("SELECT * FROM " +STUDENT_TABLE+
                " WHERE device = 'Tablet' COLLATE NOCASE AND brand = 'Apple' COLLATE NOCASE AND type = 'Speaker' COLLATE NOCASE", null);

        if (cursor.moveToFirst()){
            do {
                DatabaseModel model = new DatabaseModel();
                model.setDevice(cursor.getString(0));
                model.setBrand(cursor.getString(1));
                model.setType(cursor.getString(2));
                model.setPart(cursor.getString(3));

                modelList.add(model);
            }while (cursor.moveToNext());
        }


        Log.d("parts data", modelList.toString());


        return modelList;
    }

    public List<DatabaseModel> getDataFromDBcnl(){
        List<DatabaseModel> modelList = new ArrayList<DatabaseModel>();
        //  String query = "select * from "+STUDENT_TABLE;

        SQLiteDatabase db = this.getWritableDatabase();
        //  Cursor c = db.rawQuery(query,null);

        Cursor cursor = db.rawQuery("SELECT * FROM " +STUDENT_TABLE+
                " WHERE device = 'Camera' COLLATE NOCASE AND brand = 'Nikon' COLLATE NOCASE AND type = 'Lens' COLLATE NOCASE", null);

        if (cursor.moveToFirst()){
            do {
                DatabaseModel model = new DatabaseModel();
                model.setDevice(cursor.getString(0));
                model.setBrand(cursor.getString(1));
                model.setType(cursor.getString(2));
                model.setPart(cursor.getString(3));

                modelList.add(model);
            }while (cursor.moveToNext());
        }


        Log.d("parts data", modelList.toString());


        return modelList;
    }

    public List<DatabaseModel> getDataFromDBwsw(){
        List<DatabaseModel> modelList = new ArrayList<DatabaseModel>();
        //  String query = "select * from "+STUDENT_TABLE;

        SQLiteDatabase db = this.getWritableDatabase();
        //  Cursor c = db.rawQuery(query,null);

        Cursor cursor = db.rawQuery("SELECT * FROM " +STUDENT_TABLE+
                " WHERE device = 'Watch' COLLATE NOCASE AND brand = 'Samsung' COLLATE NOCASE AND type = 'Band' COLLATE NOCASE", null);

        if (cursor.moveToFirst()){
            do {
                DatabaseModel model = new DatabaseModel();
                model.setDevice(cursor.getString(0));
                model.setBrand(cursor.getString(1));
                model.setType(cursor.getString(2));
                model.setPart(cursor.getString(3));

                modelList.add(model);
            }while (cursor.moveToNext());
        }


        Log.d("parts data", modelList.toString());


        return modelList;
    }
  /*  private void openAndQueryDatabase() {
        try {
            DBHelper dbHelper = new DBHelper(this.getApplicationContext());
            newDB = dbHelper.getWritableDatabase();
            Cursor c = newDB.rawQuery("SELECT FirstName, Age FROM " +
                    tableName +
                    " where Age > 10 LIMIT 4", null);
            if (c != null ) {
                if  (c.moveToFirst()) {
                    do {
                        String firstName = c.getString(c.getColumnIndex("FirstName"));
                        int age = c.getInt(c.getColumnIndex("Age"));
                        results.add("Name: " + firstName + ",Age: " + age);
                    }while (c.moveToNext());
                }
            }
        } catch (SQLiteException se ) {
            Log.e(getClass().getSimpleName(), "Could not create or Open the database");
        } finally {
            if (newDB != null)
                newDB.execSQL("DELETE FROM " + tableName);
            newDB.close();
        }
    }*/


    /*delete a row from database*/

    public void deleteARow(String part){
        SQLiteDatabase db= this.getWritableDatabase();
        db.delete(STUDENT_TABLE,"part=?", new String[]{ part });
        db.close();
    }

}
