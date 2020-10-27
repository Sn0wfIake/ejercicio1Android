package com.example.ejerciciobotonesylayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class AdivinaNumero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adivinanumero);
        final int rand = (int)(Math.random()*100);
        Button botoncito=(Button) findViewById(R.id.button6);
        botoncito.setOnClickListener(new View.OnClickListener() {
            TextView txt= (TextView) findViewById(R.id.textView2);
            EditText numero1 = (EditText) findViewById(R.id.resultado);
            public void onClick(View v) {

                Integer num1= Integer.parseInt((numero1.getText().toString()));
                if (num1>rand){
                    txt.setText("");

                    txt.setText("Te pasaste por arriba");

                    txt.setVisibility(View.VISIBLE);

                }else if(num1==rand){
                    txt.setText("Acertaste");
                    txt.setVisibility(View.VISIBLE);
                }else {
                    txt.setText("Te pasaste por abajo.");
                    txt.setVisibility(View.VISIBLE);
                }
            }
        });
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
