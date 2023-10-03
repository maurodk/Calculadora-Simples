package com.example.calculadorasimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText PrimeiroValor;
    private EditText SegundoValor;
    private TextView textResultado;
    private EditText Operacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrimeiroValor = findViewById(R.id.editPrimeiroValor);
        SegundoValor = findViewById(R.id.editSegundoValor);
        textResultado = findViewById(R.id.editResultado);
        Operacao = findViewById(R.id.editOperacao);

    }
    public void calcularOperacao(View view){
        double Pvalor = Double.parseDouble(PrimeiroValor.getText().toString());
        double Svalor = Double.parseDouble(SegundoValor.getText().toString());
        String operacao = Operacao.getText().toString();

        if(operacao.equals("+")){
        Double resultado = Pvalor + Svalor;
        textResultado.setText("RESULTADO: " + resultado);
        } else if(operacao.equals("-")){
            Double resultado = Pvalor - Svalor;
            textResultado.setText("RESULTADO: " + resultado);
        } else if(operacao.equals("/")){
            Double resultado = Pvalor / Svalor;
            textResultado.setText("RESULTADO: " + resultado);
        } else if(operacao.equals("*")){
            Double resultado = Pvalor * Svalor;
            textResultado.setText("RESULTADO: " + resultado);
        }
    }

}