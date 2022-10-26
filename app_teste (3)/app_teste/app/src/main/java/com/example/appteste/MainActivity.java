package com.example.appteste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//Atributo tipo botao ID dos elementos
    //no arquivo JAVA atual
    Button btnTela2,btnTela3,btnTela4,btnTela5, btnTela6, btnTela7,btnTela8,
        btnTela9, btnTela10,btnTela11,btnTela12,btnTela13,btnTela14,btntela15,
        btnTela16,btnTela17,btnTela18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*TROCA DE TELA-Tela2-ods1*/
        //localizar o elemento pelo ID e atribuir os valores ao atributo
        btnTela2=findViewById(R.id.btnTela2);
        // configurando o botão com a opcao de click
        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciando a tela/activity-tela arquivo java ex: Tela 2.class
                Intent tela2 = new Intent(getApplicationContext(), Tela2Activity.class);
                //Inicia o intent = tela2 = aativity
                startActivity( tela2);
            }
        });

        //tela3-0ds2
        btnTela3= findViewById(R.id.btnTela3);
        btnTela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                     Intent tela3= new Intent(getApplicationContext(), Tela3Activity.class);
                     startActivity(tela3);
            }
        });
       //tela4-ods3
        btnTela4=findViewById(R.id.btnTela4);
        btnTela4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela4= new Intent(getApplicationContext(),Tela4Activity.class);
                startActivity(tela4);
            }
        });
        //tela5-ods4
        btnTela5=findViewById(R.id.btnTela5);
        btnTela5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela5= new Intent(getApplicationContext(),Tela5Activity.class);
                startActivity(tela5);
            }
        });
       //tela 6- ods5
        btnTela6= findViewById(R.id.btnTela6);
        btnTela6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela6= new Intent(getApplicationContext(),Tela6Activity.class);
                startActivity(tela6);
            }
        });
            //tela 7 - ods6
        btnTela7= findViewById(R.id.btnTela7);
        btnTela7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela7= new Intent(getApplicationContext(),Tela7Activity.class);
                startActivity(tela7);
            }
        });
           //Tela8-ods 7
        btnTela8= findViewById(R.id.btnTela8);
        btnTela8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela8 = new Intent(getApplicationContext(),Tela8Activity.class);
                startActivity(tela8);
            }
        });
           //Tela 9-ods 8
        btnTela9=findViewById(R.id.btnTela9);
        btnTela9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela9= new Intent(getApplicationContext(),Tela9Activity.class);
                startActivity(tela9);
            }
        });
    //Tela10-ods9
        btnTela10=findViewById(R.id.btnTela10);
        btnTela10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela10= new Intent( getApplicationContext(),Tela10Activity.class);
                startActivity(tela10);
            }
        });
        //Tela 11- ods10
         btnTela11=findViewById(R.id.btnTela11);
         btnTela11.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent tela11=new Intent(getApplicationContext(),Tela11Activity.class);
                 startActivity(tela11);
             }
         });
         // Tela 12-ods11
        btnTela12=findViewById(R.id.btnTela12);
        btnTela12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela12 = new Intent(getApplicationContext(),Tela12Activity.class);
                startActivity(tela12);
            }
        });
        //tela 13 - ods12
        btnTela13=findViewById(R.id.btnTela13);
        btnTela13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela13 = new Intent(getApplicationContext(),Tela13Activity.class);
                startActivity(tela13);
            }
        });
        //Tela14-ods13
        btnTela14=findViewById(R.id.btnTela14);
        btnTela14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela14= new Intent(getApplicationContext(),Tela14Activity.class);
                startActivity(tela14);
            }
        });
           //tela 15 - ods14
        btntela15=findViewById(R.id.btnTela15);
        btntela15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela15= new Intent(getApplicationContext(),Tela15Activity.class);
                startActivity(tela15);
            }
        });
        //Tela16-ods15
        btnTela16=findViewById(R.id.btnTela16);
        btnTela16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela16= new Intent(getApplicationContext(),Tela16Activity.class);
                startActivity(tela16);
            }
        });
        //tela 17-ods16
        btnTela17=findViewById(R.id.btnTela17);
        btnTela17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela17= new Intent(getApplicationContext(),Tela17Activity.class);
                startActivity(tela17);
            }
        });
        //tela 18-ods17
        btnTela18=findViewById(R.id.btnTela18);
        btnTela18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent tela18=  new Intent(getApplicationContext(),Tela18Activity.class);
               startActivity(tela18);
            }
        });

    }
};