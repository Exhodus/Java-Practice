package ExamenProbaMatriu;

import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int filas = scan.nextInt();
        int columnas = scan.nextInt();

        String[][] bandera = new String[filas][columnas];

        for(int i = 0; i < bandera.length; i++){
            for(int j = 0; j < bandera[0].length; j++){
                if( i == bandera.length/2 || j == (bandera[0].length/3)){
                    bandera[i][j] = "X";
                } else {
                    bandera[i][j] = "·";
                }
            }
        }

        for(int i = 0; i < bandera.length; i++){
            for(int j = 0; j < bandera[0].length; j++){
                System.out.print(bandera[i][j]+" ");
            }
            System.out.println();
        }
    }
}
