package com.example.sigmotoa.ejercicio02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Actividad1 extends AppCompatActivity {

    private EditText datoa,datob;
    private RadioButton suma,resta,multiplica,divide;
    private Button resultado;
    private TextView salida;
    private double operado=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        //Aqui se castean los objetos de la interfaz, para que sean tomados por el código en JAVA
        datoa=(EditText) findViewById(R.id.numa);
        datob=(EditText)findViewById(R.id.numb);
        suma=(RadioButton)findViewById(R.id.suma);
        resta=(RadioButton)findViewById(R.id.resta);
        multiplica=(RadioButton)findViewById(R.id.multiplica);
        divide=(RadioButton)findViewById(R.id.divide);
        resultado=(Button)findViewById(R.id.calc);
        salida=(TextView)findViewById(R.id.textsalida);

        //Se usa el metodo del boton para evaluar la operación.


        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (suma.isChecked())
                {
                    operado=Double.parseDouble(datoa.getText().toString())+Double.parseDouble(datob.getText().toString());
                }
                salida.setText(String.valueOf(operado));
                if (resta.isChecked())
                {
                    operado=Double.parseDouble(datoa.getText().toString())-Double.parseDouble(datob.getText().toString());
                }
                salida.setText(String.valueOf(operado));
                if (multiplica.isChecked())
                {
                    operado=Double.parseDouble(datoa.getText().toString())*Double.parseDouble(datob.getText().toString());
                }
                salida.setText(String.valueOf(operado));
                if (divide.isChecked())
                {
                    if(Double.parseDouble(datob.getText().toString())==0.0)
                    {
                        operado=0;
                    }
                    else {
                        operado=Double.parseDouble(datoa.getText().toString())/Double.parseDouble(datob.getText().toString());
                    }
                }
                salida.setText(String.valueOf(operado));
            }
        });







    }
}
