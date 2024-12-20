package Proyectos;

import java.util.Random;

public class Bingo {
    static Random rand = new Random();
    static int contVacias = 0;

    public static void main(String[] args) {

        String[][] tablero = new String[7][21];
        llenarTablero(tablero);
        vaciarCasillas(tablero);
        llenarVacias(tablero);
        imprimirTablero(tablero);
        System.out.println(contVacias);
    }

    private static void llenarVacias(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(tablero[i][j].equals("      ")){
                    contVacias++;
                }
            }
        }

    }

    private static void vaciarCasillas(String[][] tablero) {
        int cont = 0;
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                int siNo = rand.nextInt(1,3);

                if(siNo == 1) {
                    if (j% 2 != 0 && (i == 1 || i == 3 || i == 5)) {
                        tablero[i][j] = "X     ";

                    }
                }

            }
        }
    }

    private static void imprimirTablero(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    private static void llenarTablero(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(j % 2 != 0){
                    if(i% 2 == 1 && j % 2 == 1){
                        tablero[i][j] = "      ";
                    } else {
                        tablero[i][j] = "------";
                    }
                } else {
                    if(i% 2 == 1 && j % 2 == 1){
                        tablero[i][j] = " ";
                    } else if (j%2 == 0 && i % 2 == 1 ){
                        tablero[i][j] = "|";
                    } else {
                        tablero[i][j] = "·";
                    }
                }
            }
        }

    }
}
