package EjerciciosGPT;

import java.util.Scanner;

public class TransponerUnaMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3];



        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = scan.nextInt();
            }
        }


    }
}
