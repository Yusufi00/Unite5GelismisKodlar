package com.example.unite5_gelisimizkonular;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Uyg3 extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3);
        Button btn1 = findViewById(R.id.btna1);
        EditText editText1 = findViewById(R.id.etexta1);
        EditText editText2 = findViewById(R.id.etexta2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1;
                sayi1 = Integer.parseInt(editText1.getText().toString());
                int sayi2;
                sayi2 = Integer.parseInt(editText2.getText().toString());
                int sonuc = topla(sayi1,sayi2);
                Toast.makeText(getApplicationContext(),
                        Integer.toString(sonuc),Toast.LENGTH_LONG).show();
            }
        });
    }
    private int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
}