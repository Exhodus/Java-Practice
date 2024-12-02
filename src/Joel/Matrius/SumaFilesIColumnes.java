package Joel.Matrius;

import java.util.Scanner;

public class SumaFilesIColumnes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int files = scan.nextInt();
        int columnes = scan.nextInt();
        int sumaFila = 0, sumaColumna = 0;

        int[][] mat = new int[files][columnes];

        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        int num = scan.nextInt();

        for(int i = 0; i < mat[num].length; i++){
            sumaFila += mat[num][i];
        }

        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if( j == num ){
                    sumaColumna += mat[i][j];
                }
            }
        }

        System.out.println(sumaFila+" "+sumaColumna);
    }
}
