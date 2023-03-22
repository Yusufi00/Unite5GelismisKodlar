package com.example.gelismiskomutlari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7 extends AppCompatActivity {

    Button btnyas;
    EditText txtyas;
    TextView sonuc;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7);
        btnyas = findViewById(R.id.btnyas);
        txtyas = findViewById(R.id.txtyas);
        sonuc = findViewById(R.id.sonuc);
        btnyas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int yas = Integer.parseInt(txtyas.getText().toString());
                personel personel = new personel();
                personel.setYas(yas);
                sonuc.setText(Integer.toString(personel.getYas()));
            }
        });
    }
}
