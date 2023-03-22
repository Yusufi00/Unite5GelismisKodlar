package com.example.unite5_gelisimizkonular;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Uyg1 extends AppCompatActivity {

    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selamVer();


            }});
        btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    selamVer();
                }

            });
        }

            private void selamVer() {
                Toast.makeText(this, "Selamın Aleyküm", Toast.LENGTH_SHORT).show();
            }


        }