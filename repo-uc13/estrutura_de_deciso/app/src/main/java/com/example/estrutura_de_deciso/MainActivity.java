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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void responder1 (View view){

        EditText resposta = findViewById(R.id.TextAnswer);
        String respostaCorreta = "Mexicana";

        if (respostaCorreta.equalsIgnoreCase(resposta.getText().toString())){
            Toast.makeText(this, "Resposta Correta", Toast.LENGTH_SHORT).show();
        }

    }

    public void caso2 (View view){
        Intent caso2 = new Intent(this, Caso2.class);
        startActivity(caso2);
    }












}