package com.example.unite5_gelisimizkonular;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class Uyg2  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2);
        Button btn1 = findViewById(R.id.btnb1);
        EditText editText1 = findViewById(R.id.etext1);
        EditText editText2 = findViewById(R.id.etext2);
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
