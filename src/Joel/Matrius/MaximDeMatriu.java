package Joel.Matrius;

import java.util.Scanner;

public class MaximDeMatriu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int files;
        int columnes;

        for(int k = 0; k < casos; k++) {

            files = scan.nextInt();
            columnes = scan.nextInt();
            int granfila = 0, granColumn=0, gran = 0;

            int[][] mat = new int[files][columnes];

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    mat[i][j] = scan.nextInt();
                    if(mat[i][j] > gran){
                        gran = mat[i][j];
                        granfila = i+1;
                        granColumn = j+1;
                    }
                }
            }

            System.out.println(granfila+" "+granColumn);
        }
    }
}
