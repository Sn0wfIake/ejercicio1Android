package com.example.ejerciciobotonesylayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int rand = (int) (Math.random() * 100);

        //Adivinar numero
        Button botoncito = (Button) findViewById(R.id.button);
        botoncito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comunication = new Intent(v.getContext(), AdivinaNumero.class);
                startActivity(comunication);
            }


        });
        //personalizacion de pantalla
        Button boton2 = (Button) findViewById(R.id.button2);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comunication = new Intent(v.getContext(), PersonalizacionPantalla.class);
                startActivity(comunication);
            }


        });
        //Radio buttons
        Button boton3 = (Button) findViewById(R.id.button3);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comunication = new Intent(v.getContext(), RadioButton.class);
                startActivity(comunication);
            }


        });
        //Casillas de verificacion
        Button boton4 = (Button) findViewById(R.id.button4);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comunication = new Intent(v.getContext(), CasillasDeVerificacion.class);
                startActivity(comunication);
            }


        });
        //Mensajes de alerta
        Button boton5 = (Button) findViewById(R.id.button5);
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comunication = new Intent(v.getContext(), MensajesDeAlerta.class);
                startActivity(comunication);
            }


        });

    }

}
