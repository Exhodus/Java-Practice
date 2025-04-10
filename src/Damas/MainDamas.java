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

import java.awt.*;

public class MainDamas {
    static String[][] tablero = new String[8][8];

    public static void main(String[] args) {
        Board panel = new Board();
        Window ventana = new Window(panel);


        ventana.setSize(1800,900);
        ventana.setResizable(false);

        menu(panel, ventana);
    }

    private static void menu(Board panel, Window ventana) {
        int opcion = -1;
        Font f = new Font("consolas", Font.PLAIN, 50);
        Jugador jug1 = new Jugador("Jugador1",0);
        Jugador jug2 = new Jugador("Jugador2", 0);
        do{
            String[] mainMenu = {"","Damas!","Jugar","Opciones","Salir"};
            panel.setText(mainMenu);
            panel.setColorbackground(0x223344);
            int[] palette = {0x223344, 0xFFFBF7, 0xFFFBF7,0xFFFBF7,0xFFFBF7};
            panel.setColortext(palette);
            int[][] matMainMenu = {{0,1,0,0},{0,0,0,0},{0,0,0,0},{0,2,0,0},{0,3,0,0},{0,4,0,0}};
            panel.setActborder(false);
            panel.setFont(f);
            panel.draw(matMainMenu, 't');

            try {
                Thread.sleep(50);  ///donem una mica de retard per no colapsar el buffer del mouse.
            } catch (InterruptedException e) {}

            int leftCol = panel.getCurrentMouseCol();
            int leftRow = panel.getCurrentMouseRow();
            if (leftCol != -1 && leftRow != -1) {
                if(leftCol == 1){
                    switch (leftRow){
                        case 3:
                            //jugar(panel); eso lo dejaremos para el final. De momento preparamos todo lo demás.
                            break;
                        case 4:
                            opciones(panel,jug1,jug2);
                            break;

                        case 5:
                            opcion = 5;
                    }
                }
            }

        } while (opcion != 5);

        ventana.close();
    }

    private static void opciones(Board panel, Jugador jug1, Jugador jug2) {
        Font f = new Font("consolas", Font.PLAIN, 50);
        do{
            //Vamos a suponer que siempre jugaran 2 jugadores y que por lo tanto siempre que se cambie un nombre
            //Se cambiará el otro.
            //Mas adelante podemos mantener un ranking o algo con un fichero y un hashmap
            String[] mainMenu = {"","Damas!","Cambiar Nombres","Ranking","Menú Principal"};
            panel.setText(mainMenu);
            panel.setColorbackground(0x223344);
            int[] palette = {0x223344, 0xFFFBF7, 0xFFFBF7,0xFFFBF7,0xFFFBF7};
            panel.setColortext(palette);
            int[][] matMainMenu = {{0,1,0,0},{0,0,0,0},{0,0,0,0},{0,2,0,0},{0,3,0,0},{0,4,0,0}};
            panel.setActborder(false);
            panel.setFont(f);
            panel.draw(matMainMenu, 't');

            try {
                Thread.sleep(50);  ///donem una mica de retard per no colapsar el buffer del mouse.
            } catch (InterruptedException e) {}

            int leftCol = panel.getCurrentMouseCol();
            int leftRow = panel.getCurrentMouseRow();
            if (leftCol != -1 && leftRow != -1) {
                if(leftCol == 1){
                    switch (leftRow){
                        case 3:
                            cambiarNombres(jug1, jug2);
                            break;
                        case 4:
                            //mostrarRanking();
                            break;
                        case 5:
                            return;
                    }
                }
            }

        } while (true);
    }

    private static void cambiarNombres(Jugador jug1, Jugador jug2) {

    }
}


















