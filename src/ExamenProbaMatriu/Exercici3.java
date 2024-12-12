package ExamenProbaMatriu;

import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int filas = scan.nextInt();
        int columnas = scan.nextInt();
        int cont = 0;

        int[][] tablero = new int[filas][columnas];

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                tablero[i][j] = scan.nextInt();
            }
        }

        int naveFila = scan.nextInt();
        int naveCol = scan.nextInt();

        if(tablero[naveFila][naveCol] == 1) {
            for (int i = naveFila - 1; i < naveFila + 2; i++) {
                for (int j = naveCol - 1; j < naveCol + 2; j++) {
                    boolean estoyFuerisima = ohno(tablero, i, j);
                    if (!estoyFuerisima && i != naveFila && j != naveCol) {
                        if (tablero[i][j] == 1) {
                            cont++;
                        }
                    }
                }
            }

            switch (cont) {
                case 4:
                    System.out.println("X");
                    break;
                case 3:
                case 2:
                case 1:
                    System.out.println("PARTIAL X");
                    break;
                case 0:
                    System.out.println("ALONE");
            }
        } else {
            System.out.println("DOWN");
        }

    }

    private static boolean ohno(int[][] cielo, int i, int j) {
        if(i < 0 || i > cielo.length-1 || j < 0 || j > cielo[0].length-1){
            return true;
        } else {
            return false;
        }
    }
}
