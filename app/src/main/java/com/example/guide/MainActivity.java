package com.example.guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<city> lstcity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstcity=new ArrayList<>();
        lstcity.add(new city("Udaipur",R.drawable.udp));
        lstcity.add(new city("Jaipur",R.drawable.jaipur));
        lstcity.add(new city("Jodhpur",R.drawable.jodhpur));
        lstcity.add(new city("Bikaner",R.drawable.bikaner));
        lstcity.add(new city("Alwar",R.drawable.alwar));
        lstcity.add(new city("Chittorgarh",R.drawable.chitto));
        lstcity.add(new city("Sirohi",R.drawable.sirohi));
        lstcity.add(new city("Jaisalmer",R.drawable.jais));
        lstcity.add(new city("Ajmer",R.drawable.ajmer));
        lstcity.add(new city("Kota",R.drawable.kota ));



        RecyclerView myrv=(RecyclerView) findViewById(R.id.recyclerview_id);
        Recyclerviewadapter myadapter = new Recyclerviewadapter(this,lstcity);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myadapter);

    }

}
