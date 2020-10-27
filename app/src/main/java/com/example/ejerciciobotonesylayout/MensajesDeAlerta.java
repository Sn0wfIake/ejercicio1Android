package com.example.ejerciciobotonesylayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MensajesDeAlerta extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mensajealerta);
        Button boton12 = (Button) findViewById(R.id.button12);
        boton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alerta();
            }


        });

        alerta();

    }

    private void alerta() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setMessage("Texto a mostrar");
        alert.setTitle("Título de la cabecera");
        alert.setPositiveButton("Aceptar: Esto cerrara la app", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                Toast.makeText(getApplicationContext(), "Cerrando app",
                        Toast.LENGTH_SHORT).show();
            }
        });

          /*El segundo parámetro
        puede ser una función OnClickListener, para realizar alguna acción.*/
        alert.setNegativeButton("Cancelar: esto volvera a la app", null);

        //Igual que el anterior pero   para la otra opción.
        /*
        Este sirve por si queremos meter mas opciones
        alert.setNeutralButton("Opcion Cancelar", null);//Tercera opción a  realizar.
        */

        alert.show();

        //Volver al main
        Button volver = (Button) findViewById(R.id.button11);
        volver.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });
    }

}
