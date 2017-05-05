package com.vikas.gadgetsrepair2;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.vikas.gadgetsrepair2.DatabaseModel2;
import com.vikas.gadgetsrepair2.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetShops extends AppCompatActivity {
    EditText etName,etRoll,etAddress,etBranch,etAgent;
    Button btnSubmit;
    DBHelper helpher;
    List<DatabaseModel2> dbList;
    private static final String TAG = "SET Shops";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_shops);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dbList= new ArrayList<DatabaseModel2>();
        etName = (EditText)findViewById(R.id.etName1);
        etRoll = (EditText)findViewById(R.id.etRoll1);
        etAddress =(EditText)findViewById(R.id.etAddress1);
        etBranch = (EditText)findViewById(R.id.etBranch1);
        etAgent = (EditText)findViewById(R.id.etAgent);
        btnSubmit  =(Button)findViewById(R.id.btnSubmit1);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=etName.getText().toString();
                String address=etRoll.getText().toString();
                String phone=etAddress.getText().toString();
                String rating=etBranch.getText().toString();
                String agent=etAgent.getText().toString();

                if(name.equals("") || address.equals("") || phone.equals("") || rating.equals("")|| agent.equals("")){
                    Toast.makeText(SetShops.this,"Please fill all the fields",Toast.LENGTH_LONG).show();
                    onAppointFailed();
                    return;
                }else {
                    helpher = new DBHelper(SetShops.this);
                    helpher.insertIntoDB(name,address,phone,rating,agent);
                    appoint();
                }
                etName.setText("");
                etRoll.setText("");
                etAddress.setText("");
                etBranch.setText("");
                etAgent.setText("");
                Toast.makeText(SetShops.this, "insert value", Toast.LENGTH_LONG).show();

            }
        });

    }

    public void appoint() {
        Log.v(TAG, "Set Data");

        //_signupButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(SetShops.this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Setting up your Data...");
        progressDialog.show();
        final String name = etName.getText().toString();
        final String address = etRoll.getText().toString();
        final String phone = etAddress.getText().toString();
        final String rating = etBranch.getText().toString();
        final String agent = etAgent.getText().toString();
        //final String action1=addListenerOnButton();
        // TODO: Implement your own signup logic here.
        StringRequest request = new StringRequest(Request.Method.POST,"https://vetsforpets.000webhostapp.com/setshops.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.equals("suuc app")){
                    Toast.makeText(SetShops.this, "Your Data Has Been Entered", Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();
                    Intent intent=new Intent(SetShops.this,Settings.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(SetShops.this, response, Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(SetShops.this, error.getMessage(), Toast.LENGTH_LONG).show();
                progressDialog.dismiss();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map=new HashMap<String, String>();
                map.put("name",name);
                map.put("address",address);
                map.put("phone",phone);
                map.put("rating",rating);
                map.put("agent",agent);
                return map;
            }
        };

        RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(request);
        /*new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onSignupSuccess or onSignupFailed
                        // depending on success
                        onSignupSuccess();
                        // onSignupFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);*/
    }


    public void onAppointSuccess() {
        btnSubmit.setEnabled(true);
        setResult(RESULT_OK, null);
        finish();
    }

    public void onAppointFailed() {
        Toast.makeText(getBaseContext(), "Set Shops Failed ", Toast.LENGTH_LONG).show();
        btnSubmit.setEnabled(true);
    }


}
