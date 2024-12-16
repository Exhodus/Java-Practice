package ExamenProbaMatriu;

import java.util.Scanner;

public class Ex_3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int filas = scan.nextInt();
        int columnas = scan.nextInt();
        int[][] tablero = new int[filas][columnas];

        implirMatriu(tablero);
        int indexFila = scan.nextInt();
        int indexCol = scan.nextInt();

        if(tablero[indexFila][indexCol] == 1) {
            int salida = buscarX(tablero, indexFila, indexCol);

            if (salida == 4) {
                System.out.println("X");
            } else if (salida > 0 && salida < 4) {
                System.out.println("PARTIAL X");
            } else {
                System.out.println("ALONE");
            }
        } else {
            System.out.println("DOWN");
        }
    }

    private static int buscarX(int[][] tablero,int fila, int columna) {
        int cont = 0;
        for(int i = fila-1; i < fila+2; i++){
            for(int j = columna-1; j < columna+2; j++){
                boolean estoyFuerisima = ohno(tablero,i,j);
                if(!estoyFuerisima && i != fila && j != columna && tablero[i][j] == 1){
                    cont++;
                }
            }
        }

        return cont;
    }

    private static boolean ohno(int[][] tablero, int i, int j) {
        if(i < 0 || i > tablero.length-1|| j < 0 || j > tablero[0].length-1){
            return true;
        } else {
            return false;
        }
    }

    private static void implirMatriu(int[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                tablero[i][j] = scan.nextInt();
            }
        }
    }
}
