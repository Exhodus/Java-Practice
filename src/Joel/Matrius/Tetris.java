package Joel.Matrius;

import java.util.Scanner;

public class Tetris {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int filas = scan.nextInt();
        int columnas = scan.nextInt();
        int[][] tablero = new int[filas][columnas];
        int cont = 0;
        boolean eliminada = true;

        entradaMatriz(tablero);

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(tablero[i][j] == 0){
                    eliminada = false;
                }
            }
            if(eliminada){
                cont++;
            }
            eliminada = true;
        }

        if(cont >= 4){
            System.out.println("TETRIS");
        } else{
            System.out.println(cont);
        }

    }

    private static void entradaMatriz(int[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                tablero[i][j] = scan.nextInt();
            }
        }
    }
}
