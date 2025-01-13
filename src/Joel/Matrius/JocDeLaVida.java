package Joel.Matrius;

import java.util.Scanner;

public class JocDeLaVida {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];
        scan.nextLine();

        llenarMatriz(mat1);
        gen2(mat1,mat2);
        printMat(mat2);

    }

    private static void printMat(int[][] mat2) {
        for(int i = 0; i < mat2.length;i++){
            for(int j = 0; j < mat2[0].length; j++){
                System.out.print(mat2[i][j]);
            }
            System.out.println();
        }
    }

    private static void llenarMatriz(int[][] mat1) {
        for(int i = 0; i < mat1.length;i++){
            String[] entrada = scan.nextLine().split("");
            for(int j = 0; j < mat1[0].length; j++){
                mat1[i][j] = Integer.parseInt(entrada[j]);
            }
        }
    }
    private static void gen2(int[][] mat1, int[][] mat2) {
        for(int i = 0; i < mat1.length;i++){
            for(int j = 0; j < mat1[0].length; j++){
                int cuantos1 =mirarVecinos(mat1,mat2,i,j);
                if(cuantos1 == 2 ||cuantos1 == 3 ){
                    mat2[i][j] = 1;
                } else {
                    mat2[i][j] = 0;
                }
            }
        }
    }

    private static int mirarVecinos(int[][] mat1, int[][] mat2,int i, int j) {

        int cuantos1 = 0;
        for(int k = i-1; k <= i+1; k++){
            for(int l = j-1; l <=j+1; l++){
                boolean ohno = estoyFuerisima(mat2,k,l);
                if(!ohno){
                    if((k != i && l != j) && mat1[k][j] == 1){
                        cuantos1++;
                    }
                }
            }
        }

        return cuantos1;
    }

    private static boolean estoyFuerisima(int[][] mat2, int k, int l) {
        if(k < 0 || k > mat2.length-1|| l < 0 || l > mat2[0].length-1){
            return true;
        } else {
            return false;
        }
    }

}
