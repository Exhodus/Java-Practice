package Joel.Matrius;

import java.util.Scanner;

public class EscriuUnaMatriu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int files = scan.nextInt();
        int columnes = scan.nextInt();
        int[][] matriu = new int[files][columnes];

        for(int i = 0; i < matriu.length; i++){
            for(int j = 0; j < matriu[0].length; j++){
                matriu[i][j] = scan.nextInt();
            }
        }

        int treureFila = scan.nextInt();
        int treureColumna = scan.nextInt();

        for(int i = 0; i < matriu.length; i++){
            for(int j = 0; j < matriu[0].length; j++){
                System.out.print(matriu[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(matriu[treureFila][treureColumna]);
    }
}
