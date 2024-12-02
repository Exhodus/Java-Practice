package EjerciciosGPT;

import java.util.Scanner;

public class SumarFilas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] mat = new int[3][3];
        int suma = 0;

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                suma += mat[i][j];
            }

            System.out.println(suma);
            suma = 0;
        }


    }


}
