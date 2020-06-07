package com.example.desawisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView ivmap,ivabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivmap = findViewById(R.id.iv_map);
        ivabout = findViewById(R.id.iv_about);
        ivmap.setOnClickListener(this);
        ivabout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == ivmap){
            Intent menumap = new Intent(MainActivity.this,MapsActivity.class);
            startActivity(menumap);
        }
        if (v == ivabout){
            Intent menuabout = new Intent(MainActivity.this,AboutActivity.class);
            startActivity(menuabout);
        }
    }
}