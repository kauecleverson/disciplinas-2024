package com.example.dao2;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private SQLiteDatabase database;
    private DatabaseHelper dbHelper;

    public UserDAO(Context context){
        dbHelper = new DatabaseHelper(context);
    }

    public void open(){
        database = dbHelper.getWritableDatabase();
    }

    public void close(){
        dbHelper.close();
    }

    public void addUser(User user){
        ContentValues values = new ContentValues();
        values.put("name", user.getName());
        values.put("email", user.getEmail());
        values.put("sobrenome", user.getSobrenome());
        database.insert("users", null, values);
    }

    @SuppressLint("Range")
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        Cursor cursor = database.query("users", null,  null, null, null, null, null);
        if (cursor.moveToFirst()){
            do {
                User user = new User();
                user.setId(cursor.getInt(cursor.getColumnIndex("id")));
                user.setName(cursor.getString(cursor.getColumnIndex("name")));
                user.setEmail(cursor.getString(cursor.getColumnIndex("email")));
                user.setSobrenome(cursor.getString(cursor.getColumnIndex("sobrenome")));
                user.setTelefone(cursor.getInt(cursor.getColumnIndex("telefone")));
                users.add(user);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return users;
    }
    public void deleteUser(int userId){
        database.delete("users", "id = ?", new String[]{String.valueOf(userId)});
    }
}