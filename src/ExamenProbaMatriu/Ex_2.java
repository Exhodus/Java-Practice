package ExamenProbaMatriu;

import java.util.Scanner;

public class Ex_2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int filas = scan.nextInt();
        int columnas = scan.nextInt();

        String[][] tablero = new String[filas][columnas];

        ompleMatriu(tablero);

        imprimMatriu(tablero);
    }

    private static void imprimMatriu(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void ompleMatriu(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(i == tablero.length/2 || j == tablero[0].length/3){
                    tablero[i][j] = "X";
                } else {
                    tablero[i][j] = ".";
                }
            }
        }
    }
}
