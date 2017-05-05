package com.vikas.gadgetsrepair2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Shops extends AppCompatActivity {
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
    DBHelper helpher;
    List<DatabaseModel2> dbList;
    RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops);
        c1= (CardView) findViewById(R.id.card_view);
        c2= (CardView) findViewById(R.id.card_view1);
        c3= (CardView) findViewById(R.id.card_view2);
        c4= (CardView) findViewById(R.id.card_view3);
        c5= (CardView) findViewById(R.id.card_view4);
        c6= (CardView) findViewById(R.id.card_view5);
        c7= (CardView) findViewById(R.id.card_view6);
        c8= (CardView) findViewById(R.id.card_view7);
        c9= (CardView) findViewById(R.id.card_view8);
        c10= (CardView) findViewById(R.id.card_view9);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        helpher = new DBHelper(this);
        dbList= new ArrayList<DatabaseModel2>();
        dbList = helpher.getDataFromDB();

        mRecyclerView = (RecyclerView)findViewById(R.id.recycleviewsh);

        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new RecyclerAdapterTwo(this,dbList);
        mRecyclerView.setAdapter(mAdapter);



        c1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name="Diwakar Kumar Mishra";
                Intent intent = new Intent(getApplicationContext(),Appointment.class);
                intent.putExtra("name",name);
              //  intent.putExtra("part",partName);
                startActivity(intent);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name="Praveen Datt Sharma";
                Intent intent = new Intent(getApplicationContext(),Appointment.class);
                intent.putExtra("name",name);
               // intent.putExtra("part",partName);
                startActivity(intent);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name="Girish Kumar";
                Intent intent = new Intent(getApplicationContext(),Appointment.class);
                intent.putExtra("name",name);
               // intent.putExtra("part",partName);
                startActivity(intent);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name="Alka Kalia";
                Intent intent = new Intent(getApplicationContext(),Appointment.class);
                intent.putExtra("name",name);
              //  intent.putExtra("part",partName);
                startActivity(intent);
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name="Pankaj Bhardwaj";
                Intent intent = new Intent(getApplicationContext(),Appointment.class);
                intent.putExtra("name",name);
              //  intent.putExtra("part",partName);
                startActivity(intent);
            }
        });
        c6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name="Nikhil";
                Intent intent = new Intent(getApplicationContext(),Appointment.class);
                intent.putExtra("name",name);
               // intent.putExtra("part",partName);
                startActivity(intent);
            }
        });
        c7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name="Nitin Srivastava";
                Intent intent = new Intent(getApplicationContext(),Appointment.class);
                intent.putExtra("name",name);
             //   intent.putExtra("part",partName);
                startActivity(intent);
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name="Vikas Patel";
                Intent intent = new Intent(getApplicationContext(),Appointment.class);
                intent.putExtra("name",name);
                //intent.putExtra("part",partName);
                startActivity(intent);
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name="Hamza Shakeel";
                Intent intent = new Intent(getApplicationContext(),Appointment.class);
                intent.putExtra("name",name);
               // intent.putExtra("part",partName);
                startActivity(intent);
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name="Harshit Shrivastava";
                Intent intent = new Intent(getApplicationContext(),Appointment.class);
                intent.putExtra("name",name);
                //intent.putExtra("part",partName);
                startActivity(intent);
            }
        });

    }
}
