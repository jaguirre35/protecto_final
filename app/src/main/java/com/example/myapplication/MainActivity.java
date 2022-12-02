package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //asociar objetos xml con java y eliminar barra de titulo por defecto
        getSupportActionBar().hide();

    }
    public void Comprar(View view){
        Intent intent=new Intent(this,ComprarActivity.class);
        startActivity(intent);
    }
}