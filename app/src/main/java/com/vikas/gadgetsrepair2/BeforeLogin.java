package com.vikas.gadgetsrepair2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BeforeLogin extends AppCompatActivity {
    ImageView ii,ij,ik,il,im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_before_login);
        ii= (ImageView) findViewById(R.id.imageView2);
        ij= (ImageView) findViewById(R.id.imageView6);
        ik= (ImageView) findViewById(R.id.imageView7);
        il=(ImageView) findViewById(R.id.imageView3);
        im=(ImageView) findViewById(R.id.imageView4);

        il.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent in = new Intent(BeforeLogin.this,LoginActivity.class);
                startActivity(in);

            }
        });
        im.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent in = new Intent(BeforeLogin.this,LoginActivity.class);
                startActivity(in);

            }
        });


        ij.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent in = new Intent(BeforeLogin.this,LoginActivity.class);
                startActivity(in);

            }
        });

        ik.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent in = new Intent(BeforeLogin.this,SignupActivity.class);
                startActivity(in);

            }
        });

    }


}
