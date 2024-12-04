package Joel.Matrius;

import java.util.Scanner;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int filas = scan.nextInt();
        int columnes = scan.nextInt();

        int[][] mat = new int[filas][columnes];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        int num = scan.nextInt();

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] *= num;
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
