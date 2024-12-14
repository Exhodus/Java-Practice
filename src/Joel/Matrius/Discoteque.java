package Joel.Matrius;

import java.util.Scanner;

public class Discoteque {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int casos = scan.nextInt();
        int filas, columnas, charcos;

        for(int k = 0; k < casos; k++){

            filas = scan.nextInt();
            columnas = scan.nextInt();
            int[][] tablero = new int[filas][columnas];
            boolean discoteque = false;

            llenarMatriz(tablero);

            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[0].length; j++){
                   for(int l = i-1; l < i+2; l++){
                       for(int m = j-1; m < j+2; m++){
                           boolean estoyFuerisima = ohno(tablero,l,m);
                           if(!estoyFuerisima && tablero[l][m] != 1){
                               discoteque = true;
                           }
                       }
                   }

                }
            }

            if(!discoteque){
                System.out.println("OK");
            } else {
                System.out.println("DISCOTHEQUE, DISCOTHEQUE");
            }
        }
    }

    private static boolean ohno(int[][] tablero, int i, int j) {
        if(i < 0 || i >tablero.length-1 || j < 0 || j > tablero[0].length-1){
            return true;
        } else {
            return false;
        }
    }

    private static void llenarMatriz(int[][] tablero) {

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                tablero[i][j] = scan.nextInt();
            }
        }
    }
}
