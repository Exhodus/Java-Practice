package Damas;

import java.util.ArrayList;

public class Jugador {
    String nombre;
    int puntos;
    Fichas fichas;

    public Jugador(){
        nombre = "Jugador";
        puntos = 0;
        fichas = Fichas.BLANCAS;
    }
    //El constructor de arriba me dará problemas a la larga. Voy a utilizar uno nuevo que te obligue a hacerlo.
    //Fichas no hace falta, podemos hacer un setter al empezar la partida.
    public Jugador (String nombre, int puntos){
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public Fichas getFichas(){
        return this.fichas;
    }

    public void setFichas(Fichas fichas){
        this.fichas = fichas;
    }

}
