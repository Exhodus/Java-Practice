package Buscaminas;

import java.util.Random;
import java.util.Scanner;


public class BuscaminasMain {

    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    static  String blank = "\u2588";
    //
    //implementar tiempo de partida.

    public static void main(String[] args) {

        String[][] tablero = new String[10][10];


        int opcion = 0;

        System.out.println("Bienvenido al Buscaminas!");
        System.out.println("Menu: ");
        System.out.println("      1. Jugar.");
        System.out.println("      1. Configuración.");
        System.out.println("      1. Estadísticas.");
        System.out.println("      1. Salir.");

        while (opcion!= 4){
            opcion = scan.nextInt();
            switch (opcion){

                case 1:
                    initTablero(tablero);
                    plantarMinas(tablero);
                    ponerNumeros(tablero);
                    printTablero(tablero);
                    jugar(tablero);
                    printTablero(tablero);
                    break;
                case 2:
                    //configuracion(tablero);
                    break;
                case 3:
                   // estadisticas();
                    break;
                case 4:
                    System.out.println("Que vaya bien! Adiós!");
                    break;

            }
        }




    }

    private static void jugar(String[][] tablero) {
        int filas = scan.nextInt();
        int columnas = scan.nextInt();

        if(tablero[filas][columnas].equals(" ")){
            vaciarCasillas(tablero,filas,columnas);
        }
    }

    private static void vaciarCasillas(String[][] tablero, int filas, int columnas) {
        for(int i = filas-1; i <= filas+1; i++){
            for(int j = columnas; j <= columnas+1; j++){
                if(!estoyFuerisima(tablero,i,j)){
                    if(tablero[i][j].equals(" ")){
                        tablero[i][j] =  blank;
                    }
                }
            }
        }
    }

    private static void ponerNumeros(String[][] tablero) {
        int cont = 0;
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(!tablero[i][j].equals("0")) {
                    cont = comprobarAlrededor(tablero, i, j);
                    if (cont != 0) {
                        tablero[i][j] = "" + cont;
                    }
                }
            }
        }

    }

    private static int comprobarAlrededor(String[][] tablero, int i, int j) {
        int numMinas = 0;
        for(int k = i-1; k <= i+1; k++){
            for(int l = j-1; l <= j+1; l++){
                if(!estoyFuerisima(tablero,k,l) && tablero[k][l].equals("0")){
                    numMinas++;
                }
            }
        }
        return numMinas;
    }

    private static boolean estoyFuerisima(String[][] tablero, int k, int l) {

        if(k < 0 || k > tablero.length-1 || l < 0 || l > tablero[0].length-1){
            return true;
        } else {
            return false;
        }
    }

    private static void printTablero(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                System.out.print(tablero[i][j]+"  ");
            }
            System.out.println();
        }
    }

    private static void initTablero(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                tablero[i][j] = " ";
            }
        }
    }

    private static void plantarMinas(String[][] tablero) {
        /* \033 +
        NEGRO:      [30m
        ROJO:       [31m
        VERDE:      [32m
        AMARILLO    [33m
        AZUL:       [34m
        MAGENTA:    [35m
        CIAN:       [36m
        BLANCO:     [37m
         */

        int minas = 15;
        while (minas > 0) {
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[0].length; j++) {
                    int probabilidad = rand.nextInt(0, 101);
                    if (probabilidad < 2 && minas > 0) {
                        tablero[i][j] = "0";
                        minas--;
                    }
                }
            }

        }
    }
}
