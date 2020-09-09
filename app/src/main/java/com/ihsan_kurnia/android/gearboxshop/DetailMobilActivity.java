package com.ihsan_kurnia.android.gearboxshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.RequestOptions;

public class DetailMobilActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //full mode
        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        setContentView(R.layout.activity_detail);

        String nameCars = getIntent().getStringExtra("nameCars");
        int photoCars = getIntent().getIntExtra("photoCars", 0);
        String TextDetail = getIntent().getStringExtra("textDetail");

        ImageView ivgambar = findViewById(R.id.iv_gambar_mobil);
        TextView tvnamaMobil = findViewById(R.id.tv_nama_mobil);
        TextView tvDetail = findViewById(R.id.tv_detail);


        //fungsi Tombol back
        ImageView back = findViewById(R.id.back_detail);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoListMobilActivity();
            }
        });

        //Fungsi Tombol about
        Button btn_next = findViewById(R.id.btn_ab);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goAboutActivity();
            }
        });

        tvnamaMobil.setText(nameCars);
        tvDetail.setText(TextDetail);
        ivgambar.setImageResource(photoCars);
        RequestBuilder<Drawable>
                apply = Glide.with(this.getApplicationContext())
                .load(nameCars)
                .apply(new RequestOptions().override(360, 237).circleCrop());

    }

    private void goAboutActivity() {
        Intent intent = new Intent(this.getApplicationContext(), AboutActivity.class);
        startActivity(intent);
    }

    private void gotoListMobilActivity() {
        Intent intent = new Intent(this.getApplicationContext(), ListMobilActivity.class);
        startActivity(intent);
    }
}