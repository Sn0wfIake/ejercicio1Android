package com.example.ejerciciobotonesylayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonalizacionPantalla extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personalizacionpantalla);



        //Volver al main
        Button volver=(Button) findViewById(R.id.button7);
        volver.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent comunication = new Intent(v.getContext(), MainActivity.class);
                startActivity(comunication);

            }
        });
    }
}
