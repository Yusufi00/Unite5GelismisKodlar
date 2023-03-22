package com.example.gelismiskomutlari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6 extends AppCompatActivity {
    Button dikdortgenAlan,kareAlan;
    EditText uzunkenarAlan,kisakenarAlan;
    TextView Alan;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6);
        uzunkenarAlan = findViewById(R.id.uznluk);
        kisakenarAlan = findViewById(R.id.kisakenar);
        dikdortgenAlan = findViewById(R.id.dikdortgenAlan);
        kareAlan = findViewById(R.id.kareAlan);
        Alan = findViewById(R.id.Alan);


        kareAlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kenar;
                Integer alan;
                kenar = Integer.parseInt(kisakenarAlan.getText().toString());
                Dortgen kare = new Dortgen(kenar);
                alan = kare.alanBul();
                Alan.setText(alan.toString());
            }
        });
        dikdortgenAlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kisakenar;
                Integer uzunkenar;
                Integer alan;
                kisakenar = Integer.parseInt(kisakenarAlan.getText().toString());
                uzunkenar = Integer.parseInt(uzunkenarAlan.getText().toString());
                Dortgen dikdortgen = new Dortgen(kisakenar,uzunkenar);
                alan = dikdortgen.alanBul();
                Alan.setText(alan.toString());
            }
        });
    }
}
