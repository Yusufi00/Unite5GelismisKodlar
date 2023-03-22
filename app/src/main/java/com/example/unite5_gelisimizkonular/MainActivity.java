package com.example.unite5_gelisimizkonular;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.content.Intent;

import com.example.unite5_gelisimizkonular.Uyg10.Uyg10;
import com.example.unite5_gelisimizkonular.Uyg8.Uyg8;
import com.example.unite5_gelisimizkonular.Uyg9.Uyg9;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uyg1Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg1.class);
        startActivity(i);
    }

    public void uyg2Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2.class);
        startActivity(i);
    }

    public void uyg3Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg3.class);
        startActivity(i);
    }

    public void uyg6Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg6.class);
        startActivity(i);
    }

    public void uyg4Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg4.class);
        startActivity(i);
    }

    public void uyg7Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg7.class);
        startActivity(i);
    }
    public void uyg8Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg8.class);
        startActivity(i);
    }

    public void uyg9Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg9.class);
        startActivity(i);
    }


    public void uyg10Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg10.class);
        startActivity(i);
    }
}