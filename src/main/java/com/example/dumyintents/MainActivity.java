package com.example.dumyintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView entrada_texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrada_texto = (TextView) findViewById(R.id.nombre);
    }

    public void levantarActivity(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
        Persona p = new Persona(entrada_texto.getText().toString());
        intent.putExtra("persona", p);
        startActivity(intent);
    }
}