package com.ruddymiranda.helpmywoof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class AuthActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
    }


    public void iriniciar(View view){
        Intent i = new Intent(this, IniciarSesionActivity.class);
        startActivity(i);


    }

    public void registrar(View view){
        Intent i = new Intent(this, RegistrarseActivity.class);
        startActivity(i);

    }
}