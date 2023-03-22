package com.example.gelismiskomutlari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5 extends AppCompatActivity {
    EditText CihazAdi,CihazGucu,GunlukSaat;
    Button btnHesapla;
    TextView hesap;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5);
        btnHesapla = findViewById (R.id.btnHesapla);
        btnHesapla.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                EditText editTextCihazAdi = findViewById(R.id.CihazAdi);
                EditText editTextKW = findViewById(R.id.CihazGucu);
                EditText editTextGunlukKullanimSaat = findViewById(R.id.GunlukSaat);
                TextView textViewSonuc = findViewById(R.id.sonuc);
                String cihazAdi = editTextCihazAdi.getText().toString();
                int kw = Integer.parseInt(editTextKW.getText().toString());
                int saat = Integer.parseInt(editTextGunlukKullanimSaat.getText().toString());
                ElektirikliCihaz cihaz1 = new ElektirikliCihaz();
                cihaz1.CihazAdi = cihazAdi;
                cihaz1.CihazGucu = kw;
                cihaz1.GunlukSaat = saat;
                int sonuc = cihaz1.aylikTuketim();
                textViewSonuc.setText(Integer.toString(sonuc));
            }
        });

    }
}
