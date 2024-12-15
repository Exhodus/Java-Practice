package Joel.Matrius;

import java.util.HashMap;
import java.util.Scanner;

public class Simetria {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int casos = scan.nextInt();

        int filas, columnas;
        int indiceFilas, indiceColumnas;

        for(int i = 0; i < casos; i++){
            filas = scan.nextInt();
            columnas = scan.nextInt();
            scan.nextLine();
            String[][] tablero = new String[filas][columnas];

            entradaMatriz(tablero);

            boolean vertical = esSimetricaH(tablero);
            boolean horizontal = esSimetricaV(tablero);

            if(horizontal){
                if(vertical){
                    System.out.println("DOBLE");
                } else {
                    System.out.println("HORITZONTAL");
                }
            } else if (vertical){
                System.out.println("VERTICAL");
            } else {
                System.out.println("CAP");
            }
        }
    }

    private static boolean esSimetricaV(String[][] tablero) {
        boolean ohno = false;

        for(int i = 0; i < tablero.length/2; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(!tablero[i][j].equals(tablero[tablero.length-1-i][j])){
                    ohno = true;
                }
            }
        }

        if(ohno){
            return false;
        } else {
            return true;
        }
    }

    private static boolean esSimetricaH(String[][] tablero) {
        boolean ohno = false;

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length/2; j++){
                if(!tablero[i][j].equals(tablero[i][tablero[0].length-1-j])){
                    ohno = true;
                }
            }
        }

        if(ohno){
            return false;
        } else {
            return true;
        }
    }

    private static void entradaMatriz(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                tablero[i][j] = scan.next();
            }
        }
    }
}
