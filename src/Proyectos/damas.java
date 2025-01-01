package Proyectos;

import java.util.Scanner;

public class damas {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String[][] tablero = new String[17][17];
        llenarTablero(tablero);
        posicionInicial(tablero);
        imprimirTablero(tablero);
    }

    private static void posicionInicial(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 1; j < tablero[0].length; j++){
                if(i == 3){
                    switch (j){
                        case 1:
                        case 5:
                        case 9:
                        case 13:
                            tablero[i][j] = " N ";
                            break;
                    }
                } else if (i == 1 || i == 5) {
                    switch (j){
                        case 3:
                        case 7:
                        case 11:
                        case 15:
                            tablero[i][j] = " N ";
                            break;
                    }
                } else if (i == 11 || i == 15){
                    switch (j){
                        case 1:
                        case 5:
                        case 9:
                        case 13:
                            tablero[i][j] = " B ";
                            break;
                    }
                } else if (i == 13){
                    switch (j){
                        case 3:
                        case 7:
                        case 11:
                        case 15:
                            tablero[i][j] = " B ";
                            break;
                    }
                }

            }
            System.out.println();
        }
    }

    private static boolean ohno(String[][] tablero, int i, int j) {
        if(i < 0 || i > tablero.length-1 || j < 0 || j > tablero[0].length){
            return true;
        } else {
            return false;
        }
    }

    private static void imprimirTablero(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }
    private static void llenarTablero(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(j % 2 != 0){
                    if(i% 2 == 1 && j % 2 == 1){
                        tablero[i][j] = "   ";
                    } else {
                        tablero[i][j] = "---";
                    }
                } else {
                    if(i% 2 == 1 && j % 2 == 1){
                        tablero[i][j] = " ";
                    } else if (j%2 == 0 && i % 2 == 1 ){
                        tablero[i][j] = "|";
                    } else {
                        tablero[i][j] = "·";
                    }
                }
            }
        }

    }
}
