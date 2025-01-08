package Joel.Matrius;

import java.util.Scanner;

public class JocDeLaVida {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.nextLine();

        int[][] matriu = new int[rows][cols];
        int[][] matriu2 = new int[rows][cols];

        llenarMatriz(matriu);
        followingDay(matriu,matriu2);
        printMat(matriu2);

    }

    private static void printMat(int[][] matriu2) {
        for(int i = 0; i < matriu2.length; i++){
            for(int j = 0; j < matriu2[0].length; j++){
                System.out.print(matriu2[i][j]);
            }
            System.out.println();
        }
    }

    private static void followingDay(int[][] matriu, int[][] matriu2) {
        for(int i = 0; i < matriu.length; i++){
            for(int j = 0; j < matriu[0].length; j++){
               int num1;
               if(matriu[i][j] == 1){
                   num1 = chekeameEsta(matriu,i,j);
                   if(num1 < 2){
                       matriu2[i][j] = 0;
                   } else {
                       matriu2[i][j] = 1;
                   }
               } else {
                   num1 = chekeameEsta(matriu,i,j);
                   if(num1 > 2){
                       matriu2[i][j] = 1;
                   } else {
                       matriu2[i][j] = 0;
                   }
               }
            }
        }
    }

    private static int chekeameEsta(int[][] matriu, int i, int j) {

        int res = 0;

        for(int k = i-1; k <= i+1; k++){
            for(int l = j-1; l < j+1; l++){
                if(!estoyFuerisima(matriu,l,k)){
                    if(matriu[l][k] == 1){
                        res++;
                    }
                }
            }
        }
        return res;
    }

    private static boolean estoyFuerisima(int[][] matriu, int i, int j) {
        if(i < 0 || i > matriu.length-1 || j < 0 || j > matriu[0].length-1){
            return true;
        } else {
            return false;
        }
    }

    private static void llenarMatriz(int[][] matriu) {

        for(int i = 0; i < matriu.length; i++){
            String[] entrada = scan.nextLine().split("");
            for(int j = 0; j < matriu[0].length; j++){
                matriu[i][j] = Integer.parseInt(entrada[j]);
            }
        }
    }
}
