package com.example.dumyintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    //Bundle datosRecibidos;

    TextView nombre_recibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //datosRecibidos = getIntent().getExtras();
        nombre_recibido = (TextView) findViewById(R.id.nombre_recibido);
        //Persona p_recibida = (Persona) datosRecibidos.getSerializable("persona");
        Persona p_recibida = (Persona) getIntent().getSerializableExtra("persona");

        getIntent().hasExtra("nombre_extra");


        nombre_recibido.setText(p_recibida.getRut());


    }
}