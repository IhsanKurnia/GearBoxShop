package com.ihsan_kurnia.android.gearboxshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        //full mode
        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        //Fungsi Back Ke Halaman List Mobil
        ImageView btn_back = findViewById(R.id.back_detail);


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goListMobilActivity();
            }
        });
    }

    private void goListMobilActivity() {
        Intent intent = new Intent(this.getApplicationContext(), ListMobilActivity.class);
        startActivity(intent);
    }


}