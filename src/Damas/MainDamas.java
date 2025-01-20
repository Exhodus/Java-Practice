package Damas;

import java.util.HashMap;

public class MainDamas {

    static HashMap<String, String> coords = new HashMap<>();

    public static void main(String[] args) {

        String[][] tablero = new String[18][18];
        jugador player1 = new jugador();
        jugador player2 = new jugador();
        player1.nombre = "player1";
        player2.nombre = "player2";


        /**
         * TODO
         * En un random hacer escojer fichas a un jugador. Ya sean blancas o negras.
         */


        llenarTablero(tablero);
        guiasTablero(tablero);
        fichasTablero(tablero);
        llenarCoords();
        printarTablero(tablero);
        System.out.println(coords);
    }

    private static void llenarCoords() {
        //A
        coords.put("A1","15.2");
        coords.put("A2","15.4");
        coords.put("A3","15.6");
        coords.put("A4","15.8");
        coords.put("A5","15.10");
        coords.put("A6","15.12");
        coords.put("A7","15.14");
        coords.put("A8","15.16");
        //B
        coords.put("B1","13.2");
        coords.put("B2","13.4");
        coords.put("B3","13.6");
        coords.put("B4","13.8");
        coords.put("B5","13.10");
        coords.put("B6","13.12");
        coords.put("B7","13.14");
        coords.put("B8","13.16");
        //C
        coords.put("C1","11.2");
        coords.put("C2","11.4");
        coords.put("C3","11.6");
        coords.put("C4","11.8");
        coords.put("C5","11.10");
        coords.put("C6","11.12");
        coords.put("C7","11.14");
        coords.put("C8","11.16");
        //D
        coords.put("D1","9.2");
        coords.put("D2","9.4");
        coords.put("D3","9.6");
        coords.put("D4","9.8");
        coords.put("D5","9.10");
        coords.put("D6","9.12");
        coords.put("D7","9.14");
        coords.put("D8","9.16");
        //E
        coords.put("E1","7.2");
        coords.put("E2","7.4");
        coords.put("E3","7.6");
        coords.put("E4","7.8");
        coords.put("E5","7.10");
        coords.put("E6","7.12");
        coords.put("E7","7.14");
        coords.put("E8","7.16");
        //F
        coords.put("F1","5.2");
        coords.put("F2","5.4");
        coords.put("F3","5.6");
        coords.put("F4","5.8");
        coords.put("F5","5.10");
        coords.put("F6","5.12");
        coords.put("F7","5.14");
        coords.put("F8","5.16");
        //G
        coords.put("G1","3.2");
        coords.put("G2","3.4");
        coords.put("G3","3.6");
        coords.put("G4","3.8");
        coords.put("G5","3.10");
        coords.put("G6","3.12");
        coords.put("G7","3.14");
        coords.put("G8","3.16");
        //H
        coords.put("H1","1.2");
        coords.put("H2","1.4");
        coords.put("H3","1.6");
        coords.put("H4","1.8");
        coords.put("H5","1.10");
        coords.put("H6","1.12");
        coords.put("H7","1.14");
        coords.put("H8","1.16");

    }

    private static void fichasTablero(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(i != tablero.length-1 && j != 0){
                   if(i == 1 || i == 5){
                       if(j == 2 || j == 6 || j == 10 || j == 14){
                           tablero[i][j] = " B ";
                       }
                   } else if (i == 3){
                       if(j == 4 || j == 8 || j == 12 || j == 16){
                           tablero[i][j] = " B ";
                       }
                   }

                   if( i == 11 || i == 15){
                       if(j == 4 || j == 8 || j == 12 || j == 16){
                           tablero[i][j] = " N ";
                       }
                   } else if( i == 13){
                       if(j == 2 || j == 6 || j == 10 || j == 14){
                           tablero[i][j] = " N ";
                       }
                   }
                }
            }
        }
    }

    private static void guiasTablero(String[][] tablero) {
        String[] letras = {"A","B","C","D","E","F","G","H"};
        int cont = 7;

        for(int i = 1; i < tablero.length-2; i+=2){
            if(i == 0){
                tablero[i][0] = "   ";
            } else if(i%2 == 1 ){
                tablero[i][0] = " "+letras[cont]+" ";
                cont--;
            }
        }

        cont = 1;
        for(int j = 0; j < tablero[0].length; j+=2){
            if(j != 0 && j%2 == 0) {
                tablero[tablero.length - 1][j] = " "+cont+" ";
                cont++;
            }
        }
    }

    private static void printarTablero(String[][] tablero) {
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
                if(i %2 == 1 ){
                    if(j % 2 == 0) {
                        tablero[i][j] = "   ";
                    }else {
                        tablero[i][j] = " | ";
                    }
                } else {
                    tablero[i][j] = "---";
                }
            }
        }
    }
}
