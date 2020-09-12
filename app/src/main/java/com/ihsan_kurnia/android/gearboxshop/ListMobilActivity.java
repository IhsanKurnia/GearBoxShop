package com.ihsan_kurnia.android.gearboxshop;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListMobilActivity extends AppCompatActivity {
    private RecyclerView rvMobil;
    private ArrayList<Mobil> list = modelData.getListData();
    private ArrayList<Mobil> listDisplay = new ArrayList<>();
    private MobilListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mobil);

        //full mode
        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        listDisplay.addAll(list);


        //fungsi icon menuju halaman about
        ImageView personIcon = findViewById(R.id.iv_icon_person);

        //RecylerView xml
        rvMobil = findViewById(R.id.rv_mobil_list);
        rvMobil.setHasFixedSize(true);
        adapter = new MobilListAdapter(listDisplay);
        rvMobil.setLayoutManager(new LinearLayoutManager(this));
        rvMobil.setAdapter(adapter);




        //Search
        final EditText etSearch = findViewById(R.id.et_serach_mobil);
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                /*Tidak terpakai*/
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                /*Tidak Terpakai*/
            }

            @Override
            public void afterTextChanged(Editable editable) {
                String searchkey = editable.toString();
                if (!searchkey.isEmpty()) {
                    listDisplay.clear();
                    for (Mobil mobil : list) {
                        String nameCars = mobil.getNameCars().toLowerCase();
                        if (nameCars.toLowerCase().contains(searchkey.toLowerCase())) {
                            listDisplay.add(mobil);

                        }
                    }
                    adapter.notifyDataSetChanged();
                }
            }
        });
        /*New Code*/
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
        MobilListAdapter mobilListAdapter = new MobilListAdapter(listDisplay);
        rvMobil.setAdapter(mobilListAdapter);
    }

    private void gotoAboutActivity() {
        Intent intent = new Intent(this.getApplicationContext(), AboutActivity.class);
        startActivity(intent);
    }

}