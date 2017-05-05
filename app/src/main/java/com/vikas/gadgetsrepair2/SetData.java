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
import com.vikas.gadgetsrepair2.DatabaseHelpher;
import com.vikas.gadgetsrepair2.DatabaseModel;
import com.vikas.gadgetsrepair2.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetData extends AppCompatActivity {
    EditText etName,etRoll,etAddress,etBranch;
    Button btnSubmit;
    DatabaseHelpher helpher;
    List<DatabaseModel> dbList;
    private static final String TAG = "SET DATA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_data);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dbList= new ArrayList<DatabaseModel>();
        etName = (EditText)findViewById(R.id.etName);
        etRoll = (EditText)findViewById(R.id.etRoll);
        etAddress =(EditText)findViewById(R.id.etAddress);
        etBranch = (EditText)findViewById(R.id.etBranch);
        btnSubmit  =(Button)findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String device=etName.getText().toString();
                String brand=etRoll.getText().toString();
                String type=etAddress.getText().toString();
                String part=etBranch.getText().toString();

                if(device.equals("") || brand.equals("") || type.equals("") ||part.equals("")){
                    Toast.makeText(SetData.this,"Please fill all the fields",Toast.LENGTH_LONG).show();
                    onAppointFailed();
                    return;
                }else {
                    helpher = new DatabaseHelpher(SetData.this);
                    helpher.insertIntoDB(device, brand, type, part);
                    appoint();
                }
                etName.setText("");
                etRoll.setText("");
                etAddress.setText("");
                etBranch.setText("");
                Toast.makeText(SetData.this, "insert value", Toast.LENGTH_LONG).show();

            }
        });

    }

    public void appoint() {
        Log.v(TAG, "Set Data");

        //_signupButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(SetData.this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Setting up your Data...");
        progressDialog.show();
        final String device = etName.getText().toString();
        final String brand = etRoll.getText().toString();
        final String type = etAddress.getText().toString();
        final String part = etBranch.getText().toString();
        //final String action1=addListenerOnButton();
        // TODO: Implement your own signup logic here.
        StringRequest request = new StringRequest(Request.Method.POST,"https://vetsforpets.000webhostapp.com/setdata.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.equals("suuc app")){
                    Toast.makeText(SetData.this, "Your Data Has Been Entered", Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();
                    Intent intent=new Intent(SetData.this,Settings.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(SetData.this, response, Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(SetData.this, error.getMessage(), Toast.LENGTH_LONG).show();
                progressDialog.dismiss();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map=new HashMap<String, String>();
                map.put("device",device);
                map.put("brand",brand);
                map.put("type",type);
                map.put("part",part);
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
        Toast.makeText(getBaseContext(), "Set Data Failed ", Toast.LENGTH_LONG).show();
        btnSubmit.setEnabled(true);
    }


}
