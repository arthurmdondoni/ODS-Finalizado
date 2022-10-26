package com.example.appteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//atributos

 public class Tela5Activity extends AppCompatActivity {
     Button btnvoltar4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);
        btnvoltar4= findViewById(R.id.btnVoltar4);
        btnvoltar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(main);
            }
        });

    }



 }