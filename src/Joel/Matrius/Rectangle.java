package Joel.Matrius;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int filas = scan.nextInt();
        int columnas = scan.nextInt();

        int puntoA1 = scan.nextInt();
        int puntoB1 = scan.nextInt();

        int puntoA2 = scan.nextInt();
        int puntoB2 = scan.nextInt();

        int[][] mat = new int[filas][columnas];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if((i >= puntoA1 && i <= puntoA2) && (j >= puntoB1 && j <= puntoB2) ){
                    System.out.print("X ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
