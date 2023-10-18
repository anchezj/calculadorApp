package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private EditText valorUno, valorDos;
    private RadioButton rb_suma, rb_resta, rb_division, rb_multiplicacion;
    private TextView resultado;
    int valintUno, valintDos;
    String mostrarResultado;


    // se estructuran el oncreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // se crea el enclace entre los objetos de la clase con los ids de la interfaz

       valorUno= findViewById(R.id.et_valor1);
       valorDos=findViewById(R.id.et_valor2);
       rb_suma=findViewById(R.id.suma);
       rb_resta=findViewById(R.id.resta);
       rb_division=findViewById(R.id.division);
       rb_multiplicacion=findViewById(R.id.multiplicaion);
       resultado=findViewById(R.id.tv_resultado);

    }

    //se crea el metodo o funcion para obtener datos

    public void ObtenerDatos(){
    String valoruno=valorUno.getText().toString();
    String valordos=valorDos.getText().toString();


    valintUno=Integer.parseInt(valoruno);
    valintDos=Integer.parseInt(valordos);


    }

    public void Operaciones(View operar){

        if(rb_suma.isChecked()){
            suma();
        }if (rb_resta.isChecked()){
            resta();
        }if (rb_division.isChecked()){
            division();
        }if (rb_multiplicacion.isChecked()){
            multiplicacion();
        }

    }

    public void suma(){
        ObtenerDatos();
        int resultados=valintUno+valintDos;
        mostrarResultado=String.valueOf(resultados);
        resultado.setText("Resultado Suma = "+ mostrarResultado);
    }

    public void resta(){
         ObtenerDatos();
         int resultados=valintUno-valintDos;
         mostrarResultado=String.valueOf(resultados);
         resultado.setText("Resultado Resta = "+ mostrarResultado);
    }


    public void division(){
        ObtenerDatos();
        try {
            int resultados = valintUno / valintDos;
            mostrarResultado = String.valueOf(resultados);
            resultado.setText("Resultado Division = " + mostrarResultado);
        }catch (ArithmeticException e){
            Toast.makeText(this, "No se puede multiplicar por cero."+ e, Toast.LENGTH_LONG).show();
        }
    }

    public void multiplicacion(){
        ObtenerDatos();
        int resultados=valintUno*valintDos;
        mostrarResultado=String.valueOf(resultados);
        resultado.setText("Resultado Multiplicacion = "+mostrarResultado);
    }





}