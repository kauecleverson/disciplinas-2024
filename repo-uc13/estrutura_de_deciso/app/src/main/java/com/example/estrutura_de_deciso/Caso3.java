package com.example.estrutura_de_deciso;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Caso3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_caso3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void showTemp (View view){

        EditText temperatura = findViewById(R.id.editTextNumber);
        int temp = Integer.parseInt(temperatura.getText().toString());

        if (temp < 15) {
            Toast.makeText(this, "Está frio!", Toast.LENGTH_SHORT).show();
        } else if (temp <= 25) {
            Toast.makeText(this, "Está agradavel!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Está calor!", Toast.LENGTH_SHORT).show();
        }

    }


    public void voltar (View view){
        finish();
    }


}