package Joel.Matrius;

import java.util.Scanner;

public class IndexOfMatriu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int files = scan.nextInt();
        int columnes = scan.nextInt();
        int trobaFila = -1, trobaColumna = -1;

        int[][] mat = new int[files][columnes];

        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = scan.nextInt();
            }
        }

        int num = scan.nextInt();

        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(num == mat[i][j]){
                    trobaFila = i;
                    trobaColumna = j;
                }
            }
        }

        System.out.println(trobaFila +" "+ trobaColumna);
    }
}
