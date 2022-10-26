package com.example.appteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela6Activity extends AppCompatActivity {
Button btnVoltar5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela6);
        btnVoltar5=findViewById(R.id.btnVoltar5);
        btnVoltar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(main);
            }
        });
    }
}