package Joel.Matrius;

import java.util.Scanner;

public class EscriuUnaMatriu2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int files = scan.nextInt();
        int columnes = scan.nextInt();

        int[][] mat = new int[files][columnes];

        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        int num = scan.nextInt();
        int canvi = scan.nextInt();

        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == num){
                    mat[i][j] = canvi;
                }
            }
        }

        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
