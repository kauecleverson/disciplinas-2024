package com.example.variaveis;

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

    public void ver1 (View view) {


        EditText txtint = findViewById(R.id.editTextInt);
        int inteiro = 0;

        inteiro = Integer.parseInt(txtint.getText().toString());

        Toast.makeText(this, "Seu inteiro é:"+ inteiro, Toast.LENGTH_SHORT).show();
    }

    public void ver2 (View view){

        EditText txtDouble =  findViewById(R.id.editTextDouble);

        double decimal = 0;

        decimal = Double.parseDouble(txtDouble.getText().toString());

        Toast.makeText(this, "Seu double é:"+ decimal, Toast.LENGTH_SHORT).show();
    }

    public void ver3 (View view){

        EditText txtString = findViewById(R.id.editTextString);

        String texto;
        
        texto = String.valueOf(txtString.getText());
        Toast.makeText(this, "Sua string é:"+texto, Toast.LENGTH_SHORT).show();
    }
}