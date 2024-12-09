package Joel.Matrius;

import java.util.Scanner;

public class CebraBeatles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int filas = scan.nextInt();
        int columnas = scan.nextInt();

        int[][] cebra = new int[filas][columnas];

        int inicio = scan.nextInt();
        boolean flag = false;
        int[] blanc = new int[columnas];

        for(int i = 0; i < blanc.length; i++){
            blanc[i] = 1;
        }

        for(int i = 0; i < cebra.length; i++){
            for(int j = 0; j < cebra[0].length; j++){
                cebra[i][j] = 0;
            }
        }

        for(int i = inicio; i < cebra.length; i++){
            if(!flag){
                cebra[i] = blanc;
                flag = true;
            } else {
                flag = false;
            }
        }

        for(int i = 0; i < cebra.length; i++){
            for(int j = 0; j < cebra[0].length; j++){
                System.out.print(cebra[i][j]+" ");
            }
            System.out.println();
        }
    }
}
