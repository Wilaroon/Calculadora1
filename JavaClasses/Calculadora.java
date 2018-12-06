package com.example.wilar.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    private EditText Num1;
    private EditText Num2;
    //private Button Suma , Resta , Multiplicacion, Division;
    TextView   Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        Num1 = (EditText)findViewById(R.id.txtN1);
        Num2 = (EditText)findViewById(R.id.txtN2);
        Resultado = (TextView) findViewById(R.id.txtResul);
        Button Suma = (Button) findViewById(R.id.txtSumar);
        Suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String NumB;
                String NumA;
                NumA = Num1.getText().toString();
                NumB = Num2.getText().toString();

                int ent1 =Integer.parseInt(NumA);
                int ent2 = Integer.parseInt(NumB);
                int resu = 0;

                resu = ent1 + ent2 ;


                Resultado.setText(" "+ resu);
            }






        });

        Button Resta = (Button) findViewById(R.id.txtRestar);
        Resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NumB;
                String NumA;
                NumA = Num1.getText().toString();
                NumB = Num2.getText().toString();

                int ent1 =Integer.parseInt(NumA);
                int ent2 = Integer.parseInt(NumB);
                int resu = 0;

                resu = ent1 - ent2 ;
                Resultado.setText(" "+ resu);
            }
        });
        Button Multiplicacion = (Button) findViewById(R.id.txMultiplicar);
        Multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NumB;
                String NumA;
                NumA = Num1.getText().toString();
                NumB = Num2.getText().toString();

                int ent1 =Integer.parseInt(NumA);
                int ent2 = Integer.parseInt(NumB);
                int resu = 0;

                resu = ent1 * ent2 ;
                Resultado.setText(" "+ resu);
            }
        });
        Button Division = (Button) findViewById(R.id.txtDividir);
        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NumB;
                String NumA;
                NumA = Num1.getText().toString();
                NumB = Num2.getText().toString();

               double ent1 =Integer.parseInt(NumA);
               double ent2 = Integer.parseInt(NumB);
                int resu = 0;


                    resu = (int) (ent1 / ent2);
                Resultado.setText(" "+ resu);




            }
        });




    }
}

