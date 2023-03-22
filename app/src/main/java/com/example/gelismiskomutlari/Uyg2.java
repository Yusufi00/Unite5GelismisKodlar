package com.example.gelismiskomutlari;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2);

        Button btn1 = findViewById(R.id.button1);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sonuc = topla();
                Toast.makeText(getApplicationContext(),
                        Integer.toString(sonuc),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    private int topla() {
        return 5 + 10;
    }
}


