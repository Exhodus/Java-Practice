package Lliga2425;

import java.util.Scanner;

public class BuscaminasII {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int lineas,filas,columnas;
        int casos = scan.nextInt();
        lineas = scan.nextInt();
        filas = scan.nextInt();
        columnas = scan.nextInt();

        int[][] tablero = new int[filas][columnas];

        llenarTablero(tablero);
        printarTablero(tablero);

    }

    private static void printarTablero(int[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    private static void llenarTablero(int[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                tablero[i][j] = scan.nextInt();
            }
        }
    }
}
