package com.example.estrutura_de_deciso;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Caso2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_caso2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void responder2 (View view){
        EditText resposta = findViewById(R.id.TextResposta);
        String respostaSim = "Sim";

        if (respostaSim.equalsIgnoreCase(resposta.getText().toString())) {
            Toast.makeText(this, "Você é incrivel", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Você é um bosta", Toast.LENGTH_SHORT).show();
        }


    }
    public void caso3 (View view) {
        Intent caso3 = new Intent(this, Caso3.class);
        startActivity(caso3);
    }

    public void voltar (View view){
        finish();
    }
}