package com.example.appteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela14Activity extends AppCompatActivity {
Button btnVoltar13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela14);
        btnVoltar13=findViewById(R.id.btnVoltar13);
        btnVoltar13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(main);
            }
        });
    }
}