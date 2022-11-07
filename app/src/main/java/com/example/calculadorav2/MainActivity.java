package com.example.calculadorav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Variable acceso sirve para saber donde trabajar y hacer las operaciones correspondientes
    static int acceso = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Fraciones que vienen del usuario
        final EditText numUno = findViewById(R.id.num1);
        final EditText numDos = findViewById(R.id.num2);
        final EditText denUno = findViewById(R.id.den1);
        final EditText denDos = findViewById(R.id.den2);

        //Botones de operaciones
        final RadioButton btnSum = findViewById(R.id.radBtnSum);
        final RadioButton btnRes = findViewById(R.id.radBtnRes);
        final RadioButton btnMul = findViewById(R.id.radBtnMult);
        final RadioButton btnDiv = findViewById(R.id.radBtnDiv);

        //Resultado que se muestra en pantalla
        final TextView numFinal = findViewById(R.id.viewNum);
        final TextView denFinal = findViewById(R.id.viewDen);

        //Variable acceso sirve para saber donde trabajar y hacer las operaciones correspondientes

        //RadioButton Sumar
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    acceso = 1;
                    int nume1 = Integer.parseInt(String.valueOf(numUno.getText()));
                    int nume2 = Integer.parseInt(String.valueOf(numDos.getText()));
                    int deno1 = Integer.parseInt(String.valueOf(denUno.getText()));
                    int deno2 = Integer.parseInt(String.valueOf(denDos.getText()));
                    operaciones(nume1, nume2, deno1, deno2);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Algun campo vacio", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //RadioButton Restar
        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    acceso = 2;
                    int nume1 = Integer.parseInt(String.valueOf(numUno.getText()));
                    int nume2 = Integer.parseInt(String.valueOf(numDos.getText()));
                    int deno1 = Integer.parseInt(String.valueOf(denUno.getText()));
                    int deno2 = Integer.parseInt(String.valueOf(denDos.getText()));
                    operaciones(nume1, nume2, deno1, deno2);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Algun campo vacio", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //RadioButton multiplicar
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    acceso = 3;
                    int nume1 = Integer.parseInt(String.valueOf(numUno.getText()));
                    int nume2 = Integer.parseInt(String.valueOf(numDos.getText()));
                    int deno1 = Integer.parseInt(String.valueOf(denUno.getText()));
                    int deno2 = Integer.parseInt(String.valueOf(denDos.getText()));
                    operaciones(nume1, nume2, deno1, deno2);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Algun campo vacio", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //RadioButton dividir
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    acceso = 4;
                    int nume1 = Integer.parseInt(String.valueOf(numUno.getText()));
                    int nume2 = Integer.parseInt(String.valueOf(numDos.getText()));
                    int deno1 = Integer.parseInt(String.valueOf(denUno.getText()));
                    int deno2 = Integer.parseInt(String.valueOf(denDos.getText()));
                    operaciones(nume1, nume2, deno1, deno2);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Algun campo vacio", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //EVENTOS CUANTO SE ESCRIBE EN EL EDITTEXT
        numUno.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                numFinal.setText(" ");
                denFinal.setText(" ");
            }

            @Override
            public void afterTextChanged(Editable editable) {

                try {
                    int num1 = Integer.parseInt(String.valueOf(numUno.getText()));
                    int num2 = Integer.parseInt(String.valueOf(numDos.getText()));
                    int den1 = Integer.parseInt(String.valueOf(denUno.getText()));
                    int den2 = Integer.parseInt(String.valueOf(denDos.getText()));

                    if(btnSum.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }else if(btnRes.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }else if(btnMul.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }else if(btnDiv.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Algun campo vacio", Toast.LENGTH_SHORT).show();
                }

            }
        });

        numDos.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                numFinal.setText(" ");
                denFinal.setText(" ");
            }

            @Override
            public void afterTextChanged(Editable editable) {

                try {
                    int num1 = Integer.parseInt(String.valueOf(numUno.getText()));
                    int num2 = Integer.parseInt(String.valueOf(numDos.getText()));
                    int den1 = Integer.parseInt(String.valueOf(denUno.getText()));
                    int den2 = Integer.parseInt(String.valueOf(denDos.getText()));

                    if(btnSum.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }else if(btnRes.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }else if(btnMul.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }else if(btnDiv.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Algun campo vacio", Toast.LENGTH_SHORT).show();
                }

            }
        });

        denUno.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                numFinal.setText(" ");
                denFinal.setText(" ");
            }

            @Override
            public void afterTextChanged(Editable editable) {

                try {
                    int num1 = Integer.parseInt(String.valueOf(numUno.getText()));
                    int num2 = Integer.parseInt(String.valueOf(numDos.getText()));
                    int den1 = Integer.parseInt(String.valueOf(denUno.getText()));
                    int den2 = Integer.parseInt(String.valueOf(denDos.getText()));

                    if(btnSum.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }else if(btnRes.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }else if(btnMul.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }else if(btnDiv.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Algun campo vacio", Toast.LENGTH_SHORT).show();
                }

            }
        });

        denDos.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                numFinal.setText(" ");
                denFinal.setText(" ");
            }

            @Override
            public void afterTextChanged(Editable editable) {

                try {
                    int num1 = Integer.parseInt(String.valueOf(numUno.getText()));
                    int num2 = Integer.parseInt(String.valueOf(numDos.getText()));
                    int den1 = Integer.parseInt(String.valueOf(denUno.getText()));
                    int den2 = Integer.parseInt(String.valueOf(denDos.getText()));

                    if(btnSum.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }else if(btnRes.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }else if(btnMul.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }else if(btnDiv.isChecked()){
                        operaciones(num1, num2, den1, den2);
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Algun campo vacio", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    private void operaciones(int n1, int n2, int d1, int d2){
        int nume = 0;
        int deno = 0;

        if(acceso == 1){
            if(d1 == 0){
                Toast.makeText(MainActivity.this, "Sin definir " + n1 + " sobre cero", Toast.LENGTH_SHORT).show();
            }else if(d2 == 0){
                Toast.makeText(MainActivity.this, "Sin definir " + n2 + " sobre cero", Toast.LENGTH_SHORT).show();
            }else{
                nume = (n1*d2) + (n2*d1);
                deno = d1 * d2;
                mostrar(nume, deno);
            }
        }else if(acceso == 2){
            if(d1 == 0){
                Toast.makeText(MainActivity.this, "Sin definir " + n1 + " sobre cero", Toast.LENGTH_SHORT).show();
            }else if(d2 == 0){
                Toast.makeText(MainActivity.this, "Sin definir " + n2 + " sobre cero", Toast.LENGTH_SHORT).show();
            }else{
                nume = (n1*d2) - (n2*d1);
                deno = d1 * d2;
                mostrar(nume, deno);
            }

        }else if(acceso == 3){
            if(d1 == 0){
                Toast.makeText(MainActivity.this, "Sin definir " + n1 + " sobre cero", Toast.LENGTH_SHORT).show();
            }else if(d2 == 0){
                Toast.makeText(MainActivity.this, "Sin definir " + n2 + " sobre cero", Toast.LENGTH_SHORT).show();
            }else{
                nume = n1 * n2;
                deno = d1 * d2;
                mostrar(nume, deno);
            }
        }else if(acceso == 4){
            if(d1 == 0){
                Toast.makeText(MainActivity.this, "Sin definir " + n1 + " sobre cero", Toast.LENGTH_SHORT).show();
            }else if(d2 == 0){
                Toast.makeText(MainActivity.this, "Sin definir " + n2 + " sobre cero", Toast.LENGTH_SHORT).show();
            }else{
                nume = n1 * d2;
                deno = n2 * d1;
                mostrar(nume, deno);
            }
        }

    }

    private void mostrar(int n, int d){
        final TextView numFinal = findViewById(R.id.viewNum);
        final TextView denFinal = findViewById(R.id.viewDen);
        int mcd = MCD(n, d);

        if((d/mcd) == 1){
            numFinal.setText("" + (n/mcd));
            denFinal.setText(" ");
        }else{
            numFinal.setText("" + (n/mcd));
            denFinal.setText("" + (d/mcd));
        }
    }

    public int MCD(int a, int b){
        while(b>0){
            if(a>b){
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }
}