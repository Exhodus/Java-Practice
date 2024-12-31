package Proyectos;

import java.util.Random;

public class Bingo {
    static Random rand = new Random();
    static int contVacias = 0;

    public static void main(String[] args) {

        String[][] jugador1 = new String[7][21];
        String[][] jugador2 = new String[7][21];
        llenarTablero(jugador1);
        llenarTablero(jugador2);
        vaciarCasillas(jugador1);
        vaciarCasillas(jugador2);
        llenarVacias(jugador1);
        llenarVacias(jugador2);
        imprimirTablero(jugador1);
        imprimirTablero(jugador2);
        System.out.println(contVacias);
    }

    private static void llenarVacias(String[][] tablero) {
        int contVacias = 0;
        int min = 0;
        int max = 0;
        for(int j = 1; j < tablero[0].length; j+= 2){
            //Amb el switch calculo a quina columna som per tal de ficar la desena correcte.
           switch (j){
               case 1:
                   min = 1;
                   max = 10;
                   break;
               case 3:
                   min = 11;
                   max = 20;
                   break;
               case 5:
                   min = 21;
                   max = 30;
                   break;
               case 7:
                   min = 31;
                   max = 40;
                   break;
               case 9:
                   min = 41;
                   max = 50;
                   break;
               case 11:
                   min = 51;
                   max = 60;
                   break;
               case 13:
                   min = 61;
                   max = 70;
                   break;
               case 15:
                   min = 71;
                   max = 80;
                   break;
               case 17:
                   min = 81;
                   max = 90;
                   break;
               case 19:
                   min = 91;
                   max = 100;
                   break;
           }

           int num1 = rand.nextInt(min,max+1);
           int num2 = rand.nextInt(min,max+1);

           while (num1 == num2){
               num2 = rand.nextInt(min,max+1);
           }

           //Vaig ficant els numeros en ordre ascendent
            int contadorLlenas = 0;
           for(int i = 1; i < tablero.length; i+=2){
               if(num1 > 9) {
                   if (tablero[i][j].equals("      ")) {
                       if (num1 < num2 && contadorLlenas == 0) {
                           tablero[i][j] = num1 + "    ";
                           contadorLlenas++;
                       } else if (num1 > num2 && contadorLlenas == 0) {
                           tablero[i][j] = num2 + "    ";
                           contadorLlenas++;
                       } else if (num1 > num2 && contadorLlenas != 0) {
                           tablero[i][j] = num1 + "    ";
                           contadorLlenas++;
                       } else if (num1 < num2 && contadorLlenas != 0) {
                           tablero[i][j] = num2 + "    ";
                           contadorLlenas++;
                       }
                   }
               } else {
                   if (tablero[i][j].equals("      ")) {
                       if (num1 < num2 && contadorLlenas == 0) {
                           tablero[i][j] = num1 + "     ";
                           contadorLlenas++;
                       } else if (num1 > num2 && contadorLlenas == 0) {
                           tablero[i][j] = num2 + "     ";
                           contadorLlenas++;
                       } else if (num1 > num2 && contadorLlenas != 0) {
                           tablero[i][j] = num1 + "     ";
                           contadorLlenas++;
                       } else if (num1 < num2 && contadorLlenas != 0) {
                           tablero[i][j] = num2 + "     ";
                           contadorLlenas++;
                       }
                   }
               }
           }
        }

    }

    //Buidar les caselles

    private static void vaciarCasillas(String[][] tablero) {
        int contX = 0;
        //fila 1
        for(int i = 1; i < tablero[0].length; i+=2){
            int siNo = rand.nextInt(0,2);
            if(i % 2 == 1 && siNo == 1 && contX < 5){
                tablero[1][i] = "X     ";
                contX++;
            }
        }
        while (contX < 5){
            int colRand = rand.nextInt(0,11);
            if(!tablero[1][colRand].equals("X     ")){
                tablero[1][colRand] = "X     ";
            }
        }
        //fila 2
        contX = 0;
        for(int i = 1; i < tablero[0].length; i+=2){
            int siNo = rand.nextInt(0,2);
            if(i % 2 == 1 && siNo == 1 && contX < 5){
                tablero[3][i] = "X     ";
                contX++;
            }
        }
        while (contX < 5){
            int colRand = rand.nextInt(0,11);
            if(!tablero[3][colRand].equals("X     ") && colRand%2 == 1){
                tablero[3][colRand] = "X     ";
                contX++;
            }
        }
        //Contar las X de les columnes per saber si s'ha d'aplicar l'algoritme o no.
        contX = 0;
        for(int j = 1; j < tablero[0].length; j+=2){
            if(contarX(tablero, j) == 1){
                int siNo = rand.nextInt(0, 2);
                if (siNo == 1 && contX < 5) {
                    tablero[5][j] = "X     ";
                    contX++;
                }
            } else if (contarX(tablero,j) == 0){
                tablero[5][j] = "X     ";
                contX++;
            }
        }
        while (contX < 5){
            int colRand = rand.nextInt(0,11);
            if(colRand % 2 == 1) {
                if (!tablero[5][colRand].equals("X     ") && contarX(tablero, colRand) == 1) {
                    tablero[5][colRand] = "X     ";
                    contX++;
                }
            }
        }
    }

    private static int contarX(String[][] tablero, int j) {
        int contColumnas = 0;
        for(int i = 1; i < tablero.length; i+=2){
            if(tablero[i][j].equals("X     ")){
                contColumnas++;
            }
        }

       return contColumnas;
    }

    //Imprimeix el tablero.

    private static void imprimirTablero(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    //Aquesta funció només ompla la matriu amb els marcs del cartró.

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
