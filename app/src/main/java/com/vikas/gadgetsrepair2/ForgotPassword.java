package com.vikas.gadgetsrepair2;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ForgotPassword extends AppCompatActivity {
Button b1;
    EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
        b1=(Button)findViewById(R.id.buttonf);
        e1=(EditText) findViewById(R.id.emailf);
        final String eml=e1.getText().toString();
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                fp(eml);
            }
        });
    }
    public void fp(String eml) {
        //Log.d(TAG, "Login");

        if (!validate()) {
            onLoginFailed();
            return;
        }

         b1.setEnabled(false);


        final ProgressDialog progressDialog = new ProgressDialog(ForgotPassword.this,
                R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating...");
        progressDialog.show();

        final String email = e1.getText().toString();
        Toast.makeText(ForgotPassword.this, "hahahah"+ email, Toast.LENGTH_LONG).show();

        //final String password = _passwordText.getText().toString();

        StringRequest request = new StringRequest(Request.Method.POST,"https://vetsforpets.000webhostapp.com/ForgotPasswordT.php", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                if(response.equals("success")){
                    Toast.makeText(ForgotPassword.this, "Check Email for New Password", Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();
                    Intent intent=new Intent(ForgotPassword.this,LoginActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(ForgotPassword.this, response, Toast.LENGTH_LONG).show();
                    progressDialog.dismiss();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ForgotPassword.this, error.getMessage(), Toast.LENGTH_LONG).show();
                progressDialog.dismiss();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map=new HashMap<String, String>();
                map.put("F_eml",email);
                return map;
            }
        };

        RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(request);

    }

    public void onLoginSuccess() {
        b1.setEnabled(true);
        finish();
    }

    public void onLoginFailed() {
        Toast.makeText(getBaseContext(), "Enter a valid Email", Toast.LENGTH_LONG).show();

        b1.setEnabled(true);
    }

    public boolean validate() {
        boolean valid = true;

        String email = e1.getText().toString();
        //String password = _passwordText.getText().toString();

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            e1.setError("enter a valid email address");
            valid = false;
        } else {
            e1.setError(null);
        }
        return valid;
    }
}
