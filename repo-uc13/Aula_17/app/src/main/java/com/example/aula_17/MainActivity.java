package com.example.aula_17;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
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
    public void calcular (View view) {

        EditText primeiro = findViewById(R.id.valor1);
        EditText segundo = findViewById(R.id.valor2);

        double soma = 0;
        double subtracao = 0;
        double multiplicacao = 0;
        double divisao = 0;
        double resto = 0;

        double valor1 = 0;
        double valor2 = 0;
        if ((primeiro.getText().toString().isEmpty()) || (segundo.getText().toString().isEmpty())) {

            Toast.makeText(this, "Insira os valores", Toast.LENGTH_SHORT).show();
        } else {
            valor1 = 0;
            valor1 = Double.parseDouble(primeiro.getText().toString());

            valor2 = 0;
            valor2 = Double.parseDouble(segundo.getText().toString());
        }

        if (valor1 == 0 && valor2 == 0) {

            Toast.makeText(this, "insira valores diferentes de 0", Toast.LENGTH_SHORT).show();

        }
        else {

            soma = soma(valor1,valor2);
            subtracao = subtracao(valor1,valor2);
            multiplicacao = multiplicacao(valor1,valor2);
            divisao = divisao(valor1,valor2);
            resto = resto(valor1,valor2);

        }
        if (Double.isNaN(soma) || (Double.isNaN(subtracao)) || (Double.isNaN(multiplicacao)) || (Double.isNaN(divisao)) || (Double.isNaN(resto))){
            soma = 0;
            subtracao = 0;
            multiplicacao = 0;
            divisao = 0;
            resto = 0;
        }

        String resultSoma = String.valueOf(soma);
        String resultSub = String.valueOf(subtracao);
        String resultMult = String.valueOf(multiplicacao);
        String resultDiv = String.valueOf(divisao);
        String resultRest = String.valueOf(resto);

        TextView txtSoma = findViewById(R.id.textView2);
        TextView txtSub = findViewById(R.id.textView3);
        TextView txtMult = findViewById(R.id.textView4);
        TextView txtDiv = findViewById(R.id.textView5);
        TextView txtRest = findViewById(R.id.textView6);

        txtSoma.setText(resultSoma);
        txtSub.setText(resultSub);
        txtMult.setText(resultMult);
        txtDiv.setText(resultDiv);
        txtRest.setText(resultRest);
    }

    public double soma(double x, double y){
        double resultado = x + y;
        return resultado;
    }

    public double subtracao(double x, double y){
        double resultado = x - y;
        return resultado;
    }

    public double multiplicacao(double x, double y){
        double resultado = x * y;
        return resultado;
    }

    public double divisao(double x, double y){
        double resultado = x / y;
        return resultado;
    }

    public double resto(double x, double y){
        double resultado= x % y;
        return resultado;
    }










}



