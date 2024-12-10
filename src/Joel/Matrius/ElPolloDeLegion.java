package Joel.Matrius;

import java.util.Scanner;

public class ElPolloDeLegion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int filas,columnas;
        int indiceFilas = 0, indiceColumnas = 0;
        int cont = 0;

        for(int k = 0; k < casos; k++){
            filas = scan.nextInt();
            columnas = scan.nextInt();

            String[][] tablero = new String[filas][columnas];

            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[0].length; j++){
                    tablero[i][j] = scan.next();

                    if(tablero[i][j].equals("2")){
                        indiceFilas = i;
                        indiceColumnas = j;
                    }
                }
            }


            for(int i = indiceFilas-2; i <= indiceFilas+2; i++){
                for(int j = indiceColumnas-2; j <= indiceColumnas+2; j++){
                    boolean estoyFuerisima = ohno(tablero,i,j);
                    if(!estoyFuerisima && tablero[i][j].equals("1")){
                        cont++;
                    }
                }
            }

            if(cont > 3){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            cont = 0;
        }
    }

    private static boolean ohno(String[][] tablero, int i, int j) {
        if(i < 0 || i > tablero.length-1 || j < 0 || j > tablero[0].length-1){
            return true;
        } else {
            return false;
        }
    }
}
