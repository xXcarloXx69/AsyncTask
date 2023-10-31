package com.example.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Resultado = findViewById(R.id.txt_bienvenido);
        String nombreUsuario = getIntent().getStringExtra("Usuario");
        Resultado.setText("Bienvenido: "+ nombreUsuario);

    }
}