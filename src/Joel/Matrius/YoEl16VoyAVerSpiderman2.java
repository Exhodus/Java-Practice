package Joel.Matrius;

import java.util.Scanner;

public class YoEl16VoyAVerSpiderman2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int filas = scan.nextInt();
        int columnas = scan.nextInt();
        scan.nextLine();
        String salidaArriba = "NO";
        String salidaAbajo = "NO";

        String[][] tablero = new String[filas][columnas];

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                tablero[i][j] = scan.next();
            }
        }

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(tablero[i][j].equals("SPIDERMAN")){
                    boolean estoyFuerisima = ohno(tablero,i-1,j);
                    if(!estoyFuerisima){
                        salidaArriba = tablero[i-1][j];
                    }

                    estoyFuerisima = ohno(tablero,i+1,j);
                    if(!estoyFuerisima){
                        salidaAbajo = tablero[i+1][j];
                    }
                }
            }
        }

        System.out.println(salidaArriba);
        System.out.println(salidaAbajo);
    }

    private static boolean ohno(String[][] tablero, int i, int j) {
        if(i < 0 || i >tablero.length-1 || j < 0 || j > tablero[0].length-1){
            return true;
        } else {
            return false;
        }
    }
}
