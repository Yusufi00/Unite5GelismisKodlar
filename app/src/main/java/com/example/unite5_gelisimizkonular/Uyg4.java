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

public class Uyg4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4);
        Button btn1 = findViewById(R.id.btnc1);
        EditText editText1 = findViewById(R.id.etextc1);
        EditText editText2 = findViewById(R.id.etextc2);
        EditText editText3 = findViewById(R.id.etextc3);
        TextView textView = findViewById(R.id.textView);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1;
                sayi1 = Integer.parseInt(editText1.getText().toString());
                int sayi2;
                sayi2 = Integer.parseInt(editText2.getText().toString());
                int sonuc = topla(sayi1, sayi2);
                textView.setText(Integer.toString(sonuc));
            }
        });
        Button btn2 = findViewById(R.id.btnc2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1;
                sayi1 = Integer.parseInt(editText1.getText().toString());
                int sayi2;
                sayi2 = Integer.parseInt(editText2.getText().toString());
                int sayi3;
                sayi3 = Integer.parseInt(editText1.getText().toString());
                int sonuc = topla(sayi1,sayi2,sayi3);
                textView.setText(Integer.toString(sonuc));
            }
        });
    }
    private int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    private int topla(int sayi1, int sayi2,int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }
}