package com.example.santiagopellegrino.tictacpong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.view.*;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public class Boton {
        public int uno;
        public int dos;
        public int cont;

        public Boton(int uno, int dos) {
            this.uno = uno;
            this.dos = dos;
            this.cont = 0;
        }

        public int getUno() {
            return this.uno;
        }

        public int getDos() {
            return this.dos;
        }

        public int getCont() {
            return this.cont;
        }

        public void setCont() {
            this.cont = this.cont++;
        }

        public void resetCont() {
            this.cont = 0;
        }
    }


    Boton Boton1 = new Boton(3, 4);
    Boton Boton2 = new Boton(4, 3);
    Boton Boton3 = new Boton(1, 2);
    Boton Boton4 = new Boton(2, 1);

    public void clickBoton1(View v) {
        Boton1.setCont();
        Log.d("CLICK", "Click Boton 1");
    }

    public void clickBoton2(View v) {
        Boton2.setCont();
        Log.d("CLICK", "Click Boton 2");
    }

    public void clickBoton3(View v) {
        Boton3.setCont();
        Log.d("CLICK", "Click Boton 3");
    }

    public void clickBoton4(View v) {
        Boton4.setCont();
        Log.d("CLICK", "Click Boton 4");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



 }
}