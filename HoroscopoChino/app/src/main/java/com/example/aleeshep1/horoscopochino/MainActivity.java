package com.example.aleeshep1.horoscopochino;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton rbAño1;
    RadioButton rbAño2;
    RadioButton rbAño3;
    RadioButton rbAño4;
    RadioButton rbAño5;
    RadioButton rbAño6;
    RadioButton rbAño7;
    RadioButton rbAño8;
    RadioButton rbAño9;
    RadioButton rbAño10;
    RadioButton rbAño11;
    RadioButton rbAño12;

    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbAño1 = (RadioButton) findViewById(R.id.rbAño1);
        rbAño2 = (RadioButton) findViewById(R.id.rbAño2);
        rbAño3 = (RadioButton) findViewById(R.id.rbAño3);
        rbAño4 = (RadioButton) findViewById(R.id.rbAño4);
        rbAño5 = (RadioButton) findViewById(R.id.rbAño5);
        rbAño6 = (RadioButton) findViewById(R.id.rbAño6);
        rbAño7 = (RadioButton) findViewById(R.id.rbAño7);
        rbAño8 = (RadioButton) findViewById(R.id.rbAño8);
        rbAño9 = (RadioButton) findViewById(R.id.rbAño9);
        rbAño10 = (RadioButton) findViewById(R.id.rbAño10);
        rbAño11 = (RadioButton) findViewById(R.id.rbAño11);
        rbAño12 = (RadioButton) findViewById(R.id.rbAño12);
        siguiente = (Button) findViewById(R.id.tvResultado);
    }

    public void obtenerDatos(View v) {
        String siguiente;
        if (rbAño1.isChecked()) {
            siguiente = "año1";
            Intent i = new Intent(this, Rata.class);
            i.putExtra("siguiente", siguiente);
            startActivity(i);

        } else if (rbAño2.isChecked()) {
            siguiente = "año2";
            Intent i = new Intent(this, Bufalo.class);
            i.putExtra("siguiente", siguiente);
            startActivity(i);
        } else if (rbAño3.isChecked()) {
            siguiente = "año3";
            Intent i = new Intent(this, Tigre.class);
            i.putExtra("siguiente", siguiente);
            startActivity(i);
        } else if (rbAño4.isChecked()) {
            siguiente = "año4";
            Intent i = new Intent(this, Conejo.class);
            i.putExtra("siguiente", siguiente);
            startActivity(i);
        } else if (rbAño5.isChecked()) {
            siguiente = "año5";
            Intent i = new Intent(this, Dragon.class);
            i.putExtra("siguiente", siguiente);
            startActivity(i);


        } else if (rbAño6.isChecked()) {
            siguiente = "año6";
            Intent i = new Intent(this, Serpiente.class);
            i.putExtra("siguiente", siguiente);
            startActivity(i);


        } else if (rbAño7.isChecked()) {
            siguiente = "año7";
            Intent i = new Intent(this, Caballo.class);
            i.putExtra("siguiente", siguiente);
            startActivity(i);


        } else if (rbAño8.isChecked()) {
            siguiente = "año8";
            Intent i = new Intent(this, Cabra.class);
            i.putExtra("siguiente", siguiente);
            startActivity(i);


        } else if (rbAño9.isChecked()) {
            siguiente = "año9";
            Intent i = new Intent(this, Mono.class);
            i.putExtra("siguiente", siguiente);
            startActivity(i);


        } else if (rbAño10.isChecked()) {
            siguiente = "año10";
            Intent i = new Intent(this, Gallo.class);
            i.putExtra("siguiente", siguiente);
            startActivity(i);


        } else if (rbAño11.isChecked()) {
            siguiente = "año11";
            Intent i = new Intent(this, Perro.class);
            i.putExtra("siguiente", siguiente);
            startActivity(i);


        } else {
            siguiente = "año7";
            Intent i = new Intent(this, Jabali.class);
            i.putExtra("siguiente", siguiente);
            startActivity(i);


        }
    }
}