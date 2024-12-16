package Joel.Matrius;

import java.util.Scanner;

public class BomberMan {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int files = scan.nextInt();
        int columnes = scan.nextInt();
        int[][] tablero = new int[files][columnes];

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                tablero[i][j] = scan.nextInt();
            }
        }

        int indiceFila = scan.nextInt();
        int indiceColumna = scan.nextInt();

        int suma = sumasio(tablero,indiceFila,indiceColumna);

        System.out.println(suma);
    }

    private static int sumasio(int[][] tablero, int indiceFila, int indiceColumna) {
        int suma = 0;

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(i == indiceFila || j == indiceColumna){
                    suma += tablero[i][j];
                }
            }
        }

        return suma;
    }
}
