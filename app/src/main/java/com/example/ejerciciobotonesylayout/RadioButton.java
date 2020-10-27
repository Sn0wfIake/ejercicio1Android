package com.example.ejerciciobotonesylayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RadioButton extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton);


        Button comprobar = (Button) findViewById(R.id.button8);
        final RadioGroup radio = findViewById(R.id.radioGroup);

        comprobar.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                int selectedID = radio.getCheckedRadioButtonId();
                if (selectedID == R.id.radioButton) {
                    Toast.makeText(getApplicationContext(), "Grande neo ", Toast.LENGTH_LONG).show();
                } else if (selectedID == R.id.radioButton2) {
                    Toast.makeText(getApplicationContext(), "ALL IN! ", Toast.LENGTH_LONG).show();
                } else if (selectedID == R.id.radioButton3) {
                    Toast.makeText(getApplicationContext(), "Un crack Matt: ", Toast.LENGTH_LONG).show();
                } else if (selectedID == R.id.radioButton4) {
                    Toast.makeText(getApplicationContext(), "Pobre harrison ", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Error, selecciona un personaje ", Toast.LENGTH_LONG).show();
                }

            }
        });


        //Volver al main
        Button volver = (Button) findViewById(R.id.button9);
        volver.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent comunication = new Intent(v.getContext(), MainActivity.class);
                startActivity(comunication);

            }
        });
    }


}
