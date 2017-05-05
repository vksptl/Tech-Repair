package com.vikas.gadgetsrepair2;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeleteData extends AppCompatActivity {
    EditText prt_type1,part1;
    Button delete;
    DatabaseHelpher helpher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletedata);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        part1= (EditText)findViewById(R.id.etBranch1);
        prt_type1 = (EditText)findViewById(R.id.etAddress1);
        delete= (Button) findViewById(R.id.btnDelete);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String part=part1.getText().toString();
                String prt_type=prt_type1.getText().toString();

                if(part.equals("") || prt_type.equals("")){
                    Toast.makeText(DeleteData.this,"Please fill all the fields",Toast.LENGTH_LONG).show();
                }else {
                    helpher = new DatabaseHelpher(DeleteData.this);
                    helpher.deleteARow(part);
                    insertToDatabase(part);
                }
                part1.setText("");
                prt_type1.setText("");

                Toast.makeText(DeleteData.this, "Part has been deleted", Toast.LENGTH_LONG).show();

            }
        });



    }
    static String responseq;
    private void insertToDatabase(final String part ){
        class SendPostReqAsyncTask extends AsyncTask<String, Void, String> {
            @Override
            protected String doInBackground(String... params) {

                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
                nameValuePairs.add(new BasicNameValuePair("part", part));

                try {
                    HttpClient httpClient = new DefaultHttpClient();
                    HttpPost httpPost = new HttpPost("https://vetsforpets.000webhostapp.com/deleteapp.php");
                    httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

                    HttpResponse response = httpClient.execute(httpPost);
                    HttpEntity entity = response.getEntity();
                    responseq=entity.toString();


                } catch (ClientProtocolException e) {

                } catch (IOException e) {

                }
                return "success";
            }

            @Override
            protected void onPostExecute(String result) {
                super.onPostExecute(result);
                Toast.makeText(getApplicationContext(),"Your Part Has Been Deleted"+responseq, Toast.LENGTH_LONG).show();

            }
        }
        SendPostReqAsyncTask sendPostReqAsyncTask = new SendPostReqAsyncTask();
        sendPostReqAsyncTask.execute(part);
    }
}
