package com.vikas.gadgetsrepair2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity1 extends AppCompatActivity {
    DatabaseHelpher helpher;
    List<DatabaseModel> dbList;
    int position;
    TextView tvname,tvemail,tvroll,tvaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_details1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        // 5. get status value from bundle
        position = bundle.getInt("position");

        tvname =(TextView)findViewById(R.id.name1);
        tvemail =(TextView)findViewById(R.id.email1);
        tvroll =(TextView)findViewById(R.id.roll1);
        tvaddress =(TextView)findViewById(R.id.address1);
        helpher = new DatabaseHelpher(this);
        dbList= new ArrayList<DatabaseModel>();
        dbList = helpher.getDataFromDBB();

        if(dbList.size()>0){
            String name= dbList.get(position).getDevice();
            String email=dbList.get(position).getBrand();
            String roll=dbList.get(position).getType();
            String address=dbList.get(position).getPart();
            tvname.setText(name);
            tvemail.setText(address);
            tvroll.setText(email);
            tvaddress.setText(roll);
        }

        Toast.makeText(DetailsActivity1.this, dbList.toString(), Toast.LENGTH_LONG);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
