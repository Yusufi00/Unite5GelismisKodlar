package com.example.unite5_gelisimizkonular;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Uyg6 extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6);
        EditText editTextKisaKenar = findViewById(R.id.editTextKisaKenar);
        EditText editTextUzunKenar = findViewById(R.id.editTextUzunKenar);
        Button buttonKareAlani = findViewById(R.id.buttonKareAlani);
        Button buttonDikdortgenAlani = findViewById(R.id.buttonDikdortgenAlani);
        TextView textViewAlan = findViewById(R.id.textViewAlan);
        buttonKareAlani.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Integer kenar;
                Integer alan;
                kenar = Integer.parseInt(editTextKisaKenar.getText().toString());
                Dortgen kare = new Dortgen(kenar);
                alan = kare.alanBul();
                textViewAlan.setText(alan.toString());
            }
        });
        buttonDikdortgenAlani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer kisaKenar;
                Integer uzunKenar;
                Integer alan;
                kisaKenar = Integer.parseInt(editTextKisaKenar.getText().toString());
                uzunKenar = Integer.parseInt(editTextUzunKenar.getText().toString());
                Dortgen dikdortgen = new Dortgen(kisaKenar,uzunKenar);
                alan = dikdortgen.alanBul();
                textViewAlan.setText(alan.toString());
            }
        });
    }
}
