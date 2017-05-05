package com.vikas.gadgetsrepair2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;


public class SplashScreen extends AppCompatActivity {

    TextView textview;

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_POWER) {
            // Do something here...
            Intent i = new Intent(this, SplashScreen.class);
            startActivity(i);
            return true;
        }
        return super.onKeyLongPress(keyCode, event);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);




        textview = (TextView) findViewById(R.id.textView1);


        AlphaAnimation anim = new AlphaAnimation(0.1f, 1.0f);
        anim.setDuration(2500);
        textview.startAnimation(anim);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this,
                        BeforeLogin.class);
                startActivity(i);
                SplashScreen.this.finish();
            }
        },3000);
    }
}
