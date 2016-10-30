package com.example.santiagopellegrino.tictacpong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.view.*;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    int Golpe;
    int Destino;
    int GolpeAnterior;
    int DestinoAnterior;
    boolean PrimerGolpe;

    public int CalcularDestino(int D) { //Recalcula el destino si se golpea dos veces
        if (D == 1) {
            return 2;
        }
        if (D == 2) {
            return 1;
        }
        if (D == 3) {
            return 4;
        }
        if (D == 4) {
            return 3;
        }
        return 0;
    }


    public void Juego(int GolpeJuego, int DestinoJuego) {

        if (PrimerGolpe == true) {
            PrimerGolpe = false;
            GolpeAnterior = GolpeJuego;
            DestinoAnterior = DestinoJuego;
            Log.d("JUEGO", "PRIMER GOLPE");
        } else {
            if (GolpeJuego == GolpeAnterior) { //SI GOLPEA DOS VECES...
                DestinoJuego = CalcularDestino(DestinoJuego);
                DestinoAnterior = DestinoJuego;
                GolpeAnterior = GolpeJuego;
                Log.d("JUEGO","DOS VECES");
            } else {
                if (Golpe != DestinoAnterior) {
                    //PIERDE
                    Log.d("JUEGO", "PERDIO");
                    setContentView(R.layout.perdio);
                } else {
                    if (GolpeJuego == DestinoAnterior) {
                        Log.d("JUEGO", "GOLPE ACERTADO");
                        GolpeAnterior = GolpeJuego;
                        DestinoAnterior = DestinoJuego;
                    }
                }
            }
        }
    }



    public void clickBoton1(View v) {
        Golpe=1;
        Destino=3;
        Log.d("CLICK", "Click Boton 1");
        Juego(Golpe, Destino);
    }

    public void clickBoton2(View v) {
        Golpe=2;
        Destino=4;
        Log.d("CLICK", "Click Boton 2");
        Juego(Golpe, Destino);
    }

    public void clickBoton3(View v) {
        Golpe=3;
        Destino=1;
        Log.d("CLICK", "Click Boton 3");
        Juego(Golpe, Destino);
    }

    public void clickBoton4(View v) {
        Golpe=4;
        Destino=2;
        Log.d("CLICK", "Click Boton 4");
        Juego(Golpe, Destino);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PrimerGolpe = true;
 }
}