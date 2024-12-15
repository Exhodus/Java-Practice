package Joel.Matrius;

import java.awt.*;
import java.util.Scanner;

public class SopaDeLletres {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int filas = scan.nextInt();
        int columnas = scan.nextInt();
        String[][] tablero = new String[filas][columnas];

        scan.nextLine();
        entradaMatriz(tablero);

        int entradas = scan.nextInt();
        scan.nextLine();
        String palabra;
        boolean encontrada = false;
        for(int i = 0; i < entradas; i++){
            palabra = scan.nextLine();
            String[] sepPal = palabra.split("");
            encontrada = buscarPalabra(tablero,sepPal);
            System.out.println(encontrada);
        }
    }

    private static boolean buscarPalabra(String[][] tablero, String[] sepPal) {
        boolean found = false;

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(tablero[i][j] == sepPal[0]){
                    for(int k = i-sepPal.length-1; k < i+ sepPal.length-1; k++){
                        int cont = 0;
                        for(int l = j-sepPal.length-1; l < sepPal.length-1; l++){
                            boolean estoyFuerisima = ohno(tablero,k,l);
                            if(!estoyFuerisima && sepPal[l] == tablero[k][l]){
                                cont ++;
                            }

                            if(cont == sepPal.length-1){
                                found = true;
                            }
                        }
                    }
                }
            }
        }

        return  found;
    }

    private static boolean ohno(String[][] tablero, int k, int l) {
        if(k < 0 || k > tablero.length-1 || l < 0 || l > tablero[0].length-1){
            return true;
        } else {
            return false;
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
