package com.example.guide;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class city_activity extends AppCompatActivity {

    private TextView tv;
    private ImageView img;
    private TextView ds;
   private ImageButton button;
    private ImageView i1;
    private ImageView i2;
    private ImageView i3;
    private ImageView i4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_activity);
        tv = (TextView) findViewById(R.id.cname);
        img = (ImageView) findViewById(R.id.places);
        ds = (TextView) findViewById(R.id.desc);
        button=(ImageButton) findViewById(R.id.maps) ;
        i1=(ImageView) findViewById(R.id.img_one);
        i2=(ImageView) findViewById(R.id.img_two);
        i3=(ImageView) findViewById(R.id.img_three);
        i4=(ImageView) findViewById(R.id.img_four);
        Intent intent = getIntent();
        String name = intent.getExtras().getString("city name");
        int image = intent.getExtras().getInt("thumbnail");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(city_activity.this,MapsActivity.class);

                startActivity(intent);
            }
        });

        tv.setText(name);
        img.setImageResource(image);
        if (name.equals("Udaipur")) {
            ds.setText(R.string.udp);
        }
        if (name.equals("Jaipur")) {
            ds.setText(R.string.jaipur);
        }
        if (name.equals("Kota")) {
            ds.setText(R.string.kota);
        }
        if (name.equals("Ajmer")) {
            ds.setText(R.string.ajmer);
        }
        if (name.equals("Jodhpur")) {
            ds.setText(R.string.jodhpur);
        }
        if (name.equals("Jaisalmer")) {
            ds.setText(R.string.jaisalmer);
        }
        if (name.equals("Bikaner")) {
            ds.setText(R.string.bikaner);
        }
        if (name.equals("Chittorgarh")) {
            ds.setText(R.string.chittorgarh);
        }
        if (name.equals("Sirohi")) {
            ds.setText(R.string.sirohi);
        }
        if (name.equals("Alwar")) {
            ds.setText(R.string.alwar);
        }
    }}
