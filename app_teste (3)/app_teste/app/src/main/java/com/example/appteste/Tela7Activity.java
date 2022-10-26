package com.example.appteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela7Activity extends AppCompatActivity {
Button btnVoltar6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela7);
        btnVoltar6=findViewById(R.id.btnVoltar6);
        btnVoltar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(main);
            }
        });
    }
}