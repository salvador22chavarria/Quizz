package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<question>questiones=new ArrayList<>();
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private ImageView start;
    private ImageView bandera;
    private ImageView logo;
    private TextView orden;
    private TextView puntaje;
    private ImageView correctas;
    private ImageButton fin;

    int contador=0,puntos=0;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1=(Button) findViewById(R.id.btn_q1);
        boton2=(Button) findViewById(R.id.btnq2);
        boton3=(Button) findViewById(R.id.btnq3);
        start=(ImageView) findViewById(R.id.image_start);
        bandera=(ImageView) findViewById(R.id.image_bandera);
        correctas=(ImageView) findViewById(R.id.image_correcta);
        fin=(ImageButton) findViewById(R.id.imagebtn_salida);
        logo=(ImageView) findViewById(R.id.image_logo);
        orden=(TextView) findViewById(R.id.txt_orden);
        puntaje=(TextView) findViewById(R.id.txt_puntaje);
        questiones.add(new question("adivina la bandera","Alemania","españa","Alemania","ucrania"));
        questiones.add(new question("adivina la bandera","España","panama","mexico","España"));
        questiones.add(new question("adivina la bandera","Corea del sur","Corea del sur","corea del norte","mongolia"));
        questiones.add(new question("adivina la bandera","China","peru","republica dominicana","China"));





        bandera.setVisibility(View.GONE);
        boton1.setVisibility(View.GONE);
        boton2.setVisibility(View.GONE);
        boton3.setVisibility(View.GONE);
        orden.setVisibility(View.GONE);
        puntaje.setVisibility(View.GONE);
        fin.setVisibility(View.GONE);
        correctas.setVisibility(View.GONE);

        contador=0;
        update(contador);

    }
    public void update(int a ){
        final question e= (question)questiones.get(a);
        orden.setText(""+(a+1)+ " "+e.getPregunta());
        boton1.setText(""+e.getBtn1());
        boton2.setText(""+e.getBtn2());
        boton3.setText(""+e.getBtn3());
        if(contador == 0){
            bandera.setImageResource(R.drawable.alemania);
        }
        if(contador == 1){
            bandera.setImageResource(R.drawable.auron);
        }
        if(contador == 2){
            bandera.setImageResource(R.drawable.bts);
        }
        if(contador == 3){
            bandera.setImageResource(R.drawable.chinawok);
        }
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bandera.setVisibility(View.VISIBLE);
                boton1.setVisibility(View.VISIBLE);
                boton2.setVisibility(View.VISIBLE);
                boton3.setVisibility(View.VISIBLE);
                orden.setVisibility(View.VISIBLE);
                puntaje.setVisibility(View.VISIBLE);
                logo.setVisibility(View.GONE);
                start.setVisibility(View.GONE);
            }
        });

        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boton1.getText().equals(e.getRespuesta())){
                    puntaje.setText("tu puntaje es: "+(puntos=puntos+1));
                    if(contador<(questiones.size()-1)){
                        contador++;
                        update(contador);

                    }

                    else{

                        bandera.setVisibility(View.GONE);
                        boton1.setVisibility(View.GONE);
                        boton2.setVisibility(View.GONE);
                        boton3.setVisibility(View.GONE);
                        orden.setVisibility(View.GONE);
                        puntaje.setVisibility(View.GONE);
                        logo.setVisibility(View.GONE);
                        start.setVisibility(View.GONE);
                        fin.setVisibility(View.VISIBLE);
                        correctas.setVisibility(View.VISIBLE);
                    }

                }
                else{
                    puntaje.setText("tu puntaje es: "+(puntos=puntos-2));
                }

            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boton2.getText().equals(e.getRespuesta())){
                    puntaje.setText("tu puntaje es: "+(puntos=puntos+1));
                    if(contador<(questiones.size()-1)){
                        contador++;
                        update(contador);

                    }

                    else{

                        bandera.setVisibility(View.GONE);
                        boton1.setVisibility(View.GONE);
                        boton2.setVisibility(View.GONE);
                        boton3.setVisibility(View.GONE);
                        orden.setVisibility(View.GONE);
                        puntaje.setVisibility(View.GONE);
                        logo.setVisibility(View.GONE);
                        start.setVisibility(View.GONE);
                        fin.setVisibility(View.VISIBLE);
                        correctas.setVisibility(View.VISIBLE);
                    }

                }
                else{
                    puntaje.setText("tu puntaje es: "+(puntos=puntos-2));
                }

            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boton3.getText().equals(e.getRespuesta())){
                    puntaje.setText("tu puntaje es: "+(puntos=puntos+1));
                    if(contador<(questiones.size()-1)){
                        contador++;
                        update(contador);

                    }

                    else{

                        bandera.setVisibility(View.GONE);
                        boton1.setVisibility(View.GONE);
                        boton2.setVisibility(View.GONE);
                        boton3.setVisibility(View.GONE);
                        orden.setVisibility(View.GONE);
                        puntaje.setVisibility(View.GONE);
                        logo.setVisibility(View.GONE);
                        start.setVisibility(View.GONE);
                        fin.setVisibility(View.VISIBLE);
                        correctas.setVisibility(View.VISIBLE);
                    }

                }
                else{
                    puntaje.setText("tu puntaje es: "+(puntos=puntos-2));
                }

            }
        });



    }
}