package Joel.Matrius;

import java.util.Scanner;

public class Alfil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        String posicion;
        int fila, columna;
        int[][] tablero = new int[8][8];

        scan.nextLine();
        for(int i = 0; i < casos; i++){
            posicion = scan.nextLine();

            String[] sep = posicion.split("");

            switch (sep[0]){
                case "a":
                    fila = 0;
                    break;
                case "b":
                    fila = 1
                    break;
                case "c":
                    fila = 2;
                    break;
                case "d":
                    fila = 3;
                    break;
                case "e":
                    fila = 4;
                    break;
                case "f":
                    fila = 5;
                    break;
                case "g":
                    fila = 6;
                    break;
                case "h":
                    fila = 7;
                    break;
            }

            columna = Integer.parseInt(sep[1]);
        }
    }
}
