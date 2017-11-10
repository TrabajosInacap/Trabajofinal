package com.example.aleeshep1.horoscopochino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import static android.R.attr.button;

public class Main3Activity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button boton = (Button)findViewById(R.id.ingresar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = ((EditText)findViewById(R.id.usuario)).getText().toString();
                String clave = ((EditText)findViewById(R.id.clave)).getText().toString();

                if(usuario.equals("profesor") && clave.equals("123456")){

                    Intent nuevoform = new Intent(Main3Activity.this, MainActivity.class);
                    startActivity(nuevoform);

                }
                else{
                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
