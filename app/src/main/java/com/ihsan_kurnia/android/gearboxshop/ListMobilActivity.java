package com.ihsan_kurnia.android.gearboxshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListMobilActivity extends AppCompatActivity {
    private RecyclerView rvMobil;
    private ArrayList<Mobil> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mobil);

        //full mode
        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);


        //fungsi icon menuju halaman about
        ImageView personIcon = findViewById(R.id.iv_icon_person);

        //RecylerView xml
        rvMobil = findViewById(R.id.rv_mobil_list);
        rvMobil.setHasFixedSize(true);

        // menampilakan list
        list.addAll(modelData.getListData());
        showRecylerView();

        CardView cardView = findViewById(R.id.layout);


        //fungsi tombol person
        personIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoAboutActivity();
            }
        });


    }


    private void showRecylerView() {
        rvMobil.setLayoutManager(new LinearLayoutManager(this));
        MobilListAdapter mobilListAdapter = new MobilListAdapter(list);
        rvMobil.setAdapter(mobilListAdapter);
    }

    private void gotoAboutActivity() {
        Intent intent = new Intent(this.getApplicationContext(), AboutActivity.class);
        startActivity(intent);
    }
}