package com.example.provamaps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pantalla_more extends AppCompatActivity {
    Button btn_torna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_more);
        btn_torna = findViewById(R.id.btn_tornar);

        btn_torna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MapsActivity.class);
                startActivity(intent);
            }
        });
    }

}
