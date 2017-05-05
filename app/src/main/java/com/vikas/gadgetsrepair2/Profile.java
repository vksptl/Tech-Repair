package com.vikas.gadgetsrepair2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Profile extends AppCompatActivity {
    TextView name1,email1;
    public static final String MyPREFERENCES = "MyPrefs" ;
    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        name1= (TextView) findViewById(R.id.name1);
        email1= (TextView) findViewById(R.id.email1);
        SharedPreferences shared = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
        String email = (shared.getString("Email", ""));
        String name=(shared.getString("Name", ""));
        name1.setText(name);
        email1.setText(email);
        Toast.makeText(Profile.this, "Val "+name , Toast.LENGTH_SHORT).show();
    }
}
