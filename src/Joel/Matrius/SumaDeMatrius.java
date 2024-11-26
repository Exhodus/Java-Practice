package Joel.Matrius;

import java.util.Scanner;

public class SumaDeMatrius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numMat = scan.nextInt();
        int[][] matriu1 = new int[numMat][numMat];
        int[][] matriu2 = new int[numMat][numMat];

        for(int i = 0; i < matriu1.length; i++){
            for(int j = 0; j< matriu1[0].length; j++){
                matriu1[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < matriu2.length; i++){
            for(int j = 0; j< matriu2[0].length; j++){
                matriu2[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < matriu1.length; i++){
            for(int j = 0; j< matriu1[0].length; j++){
                matriu1[i][j] += matriu2[i][j];
            }
        }

        for(int i = 0; i < matriu1.length; i++){
            for(int j = 0; j< matriu1[0].length; j++){
                System.out.print(matriu1[i][j]+" ");
            }
            System.out.println();
        }
    }

}
