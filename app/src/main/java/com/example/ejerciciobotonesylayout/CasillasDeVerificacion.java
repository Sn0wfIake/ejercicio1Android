package com.example.ejerciciobotonesylayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CasillasDeVerificacion extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.casillasdeverificacion);
        final TextView txt= (TextView) findViewById(R.id.textView4);
        //Declaro variables checkbox
        final CheckBox lunes = (CheckBox) findViewById(R.id.checkBox);
        final CheckBox martes = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox miercoles = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox jueves = (CheckBox) findViewById(R.id.checkBox4);
        final CheckBox viernes = (CheckBox) findViewById(R.id.checkBox5);
        final CheckBox sabado = (CheckBox) findViewById(R.id.checkBox6);
        final CheckBox domingo = (CheckBox) findViewById(R.id.checkBox7);

        lunes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(getApplicationContext(), "Alarma para el: lunes", Toast.LENGTH_SHORT).show();
                }


            }
        });
        martes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(getApplicationContext(), "Alarma para el: martes", Toast.LENGTH_SHORT).show();
                }


            }
        });
        miercoles.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(getApplicationContext(), "Alarma para el: miercoles", Toast.LENGTH_SHORT).show();
                }


            }
        });
        jueves.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(getApplicationContext(), "Alarma para el: jueves", Toast.LENGTH_SHORT).show();
                }


            }
        });
        viernes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(getApplicationContext(), "Alarma para el: viernes", Toast.LENGTH_SHORT).show();
                }


            }
        });
        sabado.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(getApplicationContext(), "Alarma para el: sabado", Toast.LENGTH_SHORT).show();
                }


            }
        });
        domingo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (((CheckBox) v).isChecked()) {
                    Toast.makeText(getApplicationContext(), "Alarma para el: Domingo", Toast.LENGTH_SHORT).show();
                    txt.setText("Vas a madrugar el domingo?!?!");
                    txt.setVisibility(View.VISIBLE);
                }else {
                    txt.setVisibility(View.INVISIBLE);
                }


            }
        });


        //Volver al main
        Button volver = (Button) findViewById(R.id.button10);
        volver.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent comunication = new Intent(v.getContext(), MainActivity.class);
                startActivity(comunication);

            }
        });
    }
}
