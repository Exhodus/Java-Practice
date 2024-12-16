package Joel.Matrius;

import java.util.Scanner;

public class ElJocDeLaVida {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int filas = scan.nextInt();
        int columnas = scan.nextInt();
        int[][] tablero = new int[filas][columnas];
        int[][] fin = new int[filas][columnas];
        scan.nextLine();

        llenarMatriz(tablero,fin);

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                boolean cambio = cambiarNumero(fin,tablero,i,j);
                if(cambio){
                    fin[i][j] = 1;
                }
            }
        }

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                System.out.print(fin[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean cambiarNumero(int[][] fin, int[][] tablero, int i, int j) {
        int cont = 0;
        for(int k = i-1; k <= i+1; k++){
            for(int l = j-1; l <= j+1; l++){
                boolean estoyFuerisima = ohno(tablero,k,l);
                if(!estoyFuerisima && tablero[k][l] == 1 && tablero[k][l] != tablero[i][j]){
                    cont++;
                }
            }
        }

        if (cont == 2 || cont == 3){
            return true;
        } else {
            return false;
        }
    }

    private static boolean ohno(int[][] tablero, int k, int l) {
        if(k < 0 || k > tablero.length-1 || l < 0 || l > tablero[0].length-1){
            return true;
        } else {
            return false;
        }
    }

    private static void llenarMatriz(int[][] tablero, int[][] fin) {
        for(int i = 0; i < tablero.length; i++){
            String[] entrada = scan.nextLine().split("");
            for(int j = 0; j < tablero[0].length; j++){
                tablero[i][j] = Integer.parseInt(entrada[j]);
                fin[i][j] = 0;
            }
        }
    }
}
