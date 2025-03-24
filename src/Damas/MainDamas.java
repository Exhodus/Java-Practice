package Damas;

/*

2 Jugadores
4 fichas por fila (3 filas por jugador)
Las ficas serán 'o'/'O' para Jugador1 y 'x'/'X' para jugador 2
Hacer el tablero
colocar las fichas
Mecánicas de juego:
    - Las fichas pueden avanzar en diagonal solo 1 posición,
    - Si hay una ficha contraria en la posición que se va a mover y la siguiente
    en la misma dirección está vacía, puede comersela. Sinó, no podrá efectuar el movimiento.
    - Si un jugador lleva su ficha hasta la ultima fila del tablero desde su posición:
    es decir: Si el jugador de abajo lleva la ficha a i = 0 o el jugador de arriba lleva la ficha a i = 8
    se transforma en un Rey.
    - el Rey se puede mover tantos cuadros como quiera, del mismo color, y puede moverse de atrás a alante.
    -Gana el que se haya comido todas las fichas del rival.
 */

import Damas.Core.Board;
import Damas.Core.Window;

public class MainDamas {

    public static void main(String[] args) {
        Board panel = new Board();
        Window ventana = new Window(panel);
        String[][] tablero = new String[8][8];

        ventana.setSize(1800,1000);
        ventana.setResizable(false);

        menu(tablero, panel, ventana);
    }

    private static void menu(String[][] tablero, Board panel, Window ventana) {
        int opcion = -1;
        while (opcion != 5){
            String[] mainMenu = {"","Damas!","Jugar","Opciones","Salir"};
            panel.setText(mainMenu);
            panel.setColorbackground(0x6B789A);
            int[] palette = {0x6b789a, 0xFFFBF7, 0xFFFBF7,0xFFFBF7,0xFFFBF7};
            panel.setColortext(palette);
            int[][] matMainMenu = {{0,1,0,0},{0,0,0,0},{0,0,0,0},{0,2,0,0},{0,3,0,0},{0,4,0,0}};
            panel.setActborder(false);
            panel.draw(matMainMenu, 't');
        }
    }
}

















