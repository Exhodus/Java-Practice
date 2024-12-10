package Joel.Matrius;

import java.util.Scanner;

public class BestAthenaEUW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int filas, columnas;
        int indiceFilas, indiceColumnas;
        int cont = 0;

        for(int k =0 ; k < casos; k++){

            filas = scan.nextInt();
            columnas = scan.nextInt();

            int[][] tablero = new int[filas][columnas];

            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[0].length; j++){
                    tablero[i][j] = scan.nextInt();
                }
            }

            indiceFilas = scan.nextInt();
            indiceColumnas = scan.nextInt();

            if(tablero[indiceFilas][indiceColumnas] == 1) {

                for (int i = indiceFilas - 1; i <= indiceFilas + 1; i++) {
                    for (int j = indiceColumnas - 1; j <= indiceColumnas + 1; j++) {
                        boolean fora = estoyFuerisima(tablero, i, j);
                        if (!fora && tablero[i][j] == 2) {
                            cont++;
                        }
                    }
                }
            } else {
                cont = -1;
            }

            System.out.println(cont);

            cont = 0;
        }
    }

    private static boolean estoyFuerisima(int[][] tablero, int i, int j) {
        if(i < 0 || i > tablero.length || j < 0 || j > tablero[0].length){
            return true;
        } else {
            return false;
        }
    }
}
