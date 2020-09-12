package com.ihsan_kurnia.android.gearboxshop;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //full mode acticity
        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        //fungsi splashScreen
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                gotoListMobilActivity();
            }
        }, 3000);

    }

    private void gotoListMobilActivity() {
        Intent intent = new Intent(this.getApplicationContext(), ListMobilActivity.class);
        startActivity(intent);
        finish();
    }
}