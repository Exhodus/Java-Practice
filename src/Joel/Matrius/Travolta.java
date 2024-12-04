package Joel.Matrius;

import java.util.Scanner;

public class Travolta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int filas = scan.nextInt();
        int columnas = scan.nextInt();
        int num = scan.nextInt();
        int resultado = -1;

        int[][] mat = new int[filas][columnas];

        for(int i = 0; i < mat.length; i++){
            for( int j = 0; j < mat[0].length; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < mat.length; i++){
            for( int j = 1; j < mat[0].length-1; j++){
                if(mat[i][j-1] == num && mat[i][j+1] == num){
                    resultado = mat[i][j];
                }
            }
        }

        if(resultado != -1){
            System.out.println(resultado);
        } else {
            System.out.println("NO");
        }
    }
}
