package com.example.unite5_gelisimizkonular;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Uyg7 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7);
        EditText editTextYas = findViewById(R.id.editTextYas);
        Button buttonKaydet = findViewById(R.id.buttonKaydet);
        TextView textViewSonuc = findViewById(R.id.textViewSonuc);
        buttonKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int yas = Integer.parseInt(editTextYas.getText().toString());
                Personel Personel = new Personel();
                Personel.setYas(yas);
                textViewSonuc.setText(Integer.toString(Personel.getYas()));
            }
        });
    }
}





