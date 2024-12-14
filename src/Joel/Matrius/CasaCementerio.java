package Joel.Matrius;

import java.util.Scanner;

public class CasaCementerio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int filas = scan.nextInt();
        int columnas = scan.nextInt();
        int indiceFilas, indiceCol;
        boolean susto = false;

        int[][] tablero = new int[filas][columnas];

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                tablero[i][j] = scan.nextInt();
            }
        }

        indiceFilas = scan.nextInt();
        indiceCol = scan.nextInt();

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                boolean estoyFuerisima = ohno(tablero,i,j);

                if(!estoyFuerisima && i == indiceFilas || j == indiceCol){
                    if(tablero[i][j] == 4){
                        susto = true;
                    }
                }
            }
        }

        if(susto){
            System.out.println("NO");
        } else {
            System.out.println("SI");
        }
    }

    private static boolean ohno(int[][] tablero, int i, int j) {
        if(i < 0 || i >tablero.length-1 || j < 0 || j > tablero[0].length-1){
            return true;
        } else {
            return false;
        }
    }
}
