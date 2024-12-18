package Proyectos;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {
    static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        String p1, p2;
        String[][] tablero = new String[7][7];
        Random rand = new Random();
        int casilla = 0;
        int contTorns = 0;
        boolean raya = false;
        HashMap<Integer,String> casillas = new HashMap<>();

        numerarCasillas(casillas);

        System.out.println("Bienvenido al 3 en raya! ");
        System.out.println("Jugador 1: Escoje Ficha! X/O");
        p1 = scan.next();
        System.out.println("Perfecto! juegas con: "+p1);
        int salida = rand.nextInt(1,3);
        System.out.println("Empieza el jugador: "+salida);

        if(p1.equals("X")){
            p1 = " X ";
            p2 = " O ";
        } else {
            p2 = " X ";
            p1 = " O ";
        }

        llenarTablero(tablero);

        while (!raya){
            System.out.println("Jugador: "+salida);
            System.out.println("Qué posición ficha quieres poner? ");
            if(salida == 1){
                actualizarTablero(tablero,casilla,casillas,p1);
                imprimirTablero(tablero);
                raya = mirarRaya(tablero,p1,raya);
                if(raya){
                    System.out.println("Enhorabuena! GANADOR JUGADOR "+salida);
                }
                salida = 2;
                contTorns++;
                if(contTorns == 9){
                    System.out.println("EMPAT");
                    raya = true;
                }
            } else {
                actualizarTablero(tablero,casilla,casillas,p2);
                imprimirTablero(tablero);
                raya = mirarRaya(tablero,p1,raya);
                if(raya){
                    System.out.println("Enhorabuena! GANADOR JUGADOR "+salida);
                }
                salida = 1;
                contTorns++;
                if(contTorns == 9){
                    System.out.println("EMPAT");
                    raya = true;
                }
            }
        }

    }

    private static boolean mirarRaya(String[][] tablero, String p,boolean raya) {
        //Recta horizontal
        if(tablero[1][1].equals(p) && tablero[1][3].equals(p) && tablero[1][5].equals(p)){
            raya = true;
        } else if (tablero[1][1].equals(p) && tablero[3][1].equals(p) && tablero[5][1].equals(p)){
            raya = true;
        } else if (tablero[1][1].equals(p) && tablero[3][3].equals(p) && tablero[5][5].equals(p)){
            raya = true;
        } else if (tablero[1][5].equals(p) && tablero[3][3].equals(p) && tablero[5][1].equals(p)) {
            raya = true;
        } else if(tablero[1][5].equals(p) && tablero[3][5].equals(p) && tablero[5][5].equals(p)) {
            raya = true;
        } else if(tablero[5][1].equals(p) && tablero[5][3].equals(p) && tablero[5][5].equals(p)){
            raya = true;
        } else if (tablero[1][3].equals(p) && tablero[3][3].equals(p) && tablero[5][3].equals(p)){
            raya = true;
        }else {
            raya = false;
        }
        return raya;
    }

    private static void actualizarTablero(String[][] tablero, int casilla, HashMap<Integer, String> casillas, String p) {
        casilla = scan.nextInt();
        boolean llena = false;
        String[] separats = casillas.get(casilla).split(" ");
        int filas = Integer.parseInt(separats[0]);
        int columnas = Integer.parseInt(separats[1]);

        if(tablero[filas][columnas].equals("   ")) {
            tablero[filas][columnas] = p;
        } else {
            System.out.println("Esta casilla ya está ocupada, escoje otra: ");
            actualizarTablero(tablero,casilla,casillas,p);
        }
    }

    private static void numerarCasillas(HashMap<Integer, String> casillas) {
        casillas.put(1, "1 1");
        casillas.put(2, "1 3");
        casillas.put(3, "1 5");
        casillas.put(4, "3 1");
        casillas.put(5, "3 3");
        casillas.put(6, "3 5");
        casillas.put(7, "5 1");
        casillas.put(8, "5 3");
        casillas.put(9, "5 5");
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
                        tablero[i][j] = "   ";
                    } else {
                        tablero[i][j] = "---";
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
