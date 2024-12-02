package Joel.Matrius;

import java.util.Scanner;

public class MatriuIdentat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int[][] matriu = new int[num][num];

        for(int i = 0; i < matriu.length; i++){
            for (int j = 0; j < matriu[0].length; j++){
                if(i == j){
                    matriu[i][j] = 1;
                } else {
                    matriu[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < matriu.length; i++){
            for (int j = 0; j < matriu[0].length; j++){
                System.out.print(matriu[i][j]+" ");
            }
            System.out.println();
        }
    }
}
