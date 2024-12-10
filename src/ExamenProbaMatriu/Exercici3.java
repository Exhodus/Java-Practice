package ExamenProbaMatriu;

import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int filas = scan.nextInt();
        int columnas = scan.nextInt();
        int cont = 0;

        int[][] cielo = new int[filas][columnas];

        for(int i = 0; i < cielo.length; i++){
            for(int j = 0; j < cielo[0].length; j++){
                cielo[i][j] = scan.nextInt();
            }
        }

        int indiceFila = scan.nextInt();
        int indiceColumna = scan.nextInt();

        if(cielo[indiceColumna][indiceFila] == 1) {
            for (int i = indiceFila - 1; i <= indiceFila + 1; i++) {
                for (int j = indiceColumna - 1; j <= indiceColumna + 1; j++) {
                    boolean estoyFuerisima = ohno(cielo, i, j);
                    if (!estoyFuerisima && i != indiceFila && j != indiceColumna && cielo[i][j] == 1) {
                        cont++;
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
        System.out.println(cont);

    }

    private static boolean ohno(int[][] cielo, int i, int j) {
        if(i < 0 || i > cielo.length-1 || j < 0 || j > cielo[0].length){
            return true;
        } else {
            return false;
        }
    }
}
