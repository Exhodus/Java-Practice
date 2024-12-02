package Joel.Matrius;

import java.util.Scanner;

public class MatriuTransposada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int files = scan.nextInt();
        int col = scan.nextInt();

        int[][] mat = new int[files][col];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i < mat[0].length; i++){
            for(int j = 0; j < mat.length; j++){
                System.out.print(mat[j][i]+" ");
            }
            System.out.println();
        }
    }
}
