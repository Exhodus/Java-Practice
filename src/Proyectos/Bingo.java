package Proyectos;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    static int contVacias = 0;

    public static void main(String[] args) {

        String[][] jugador1 = new String[7][21];
        String[][] jugador2 = new String[7][21];
        String[][] salidaNumeros = new String[21][21];
        String[][] partida = new String[21][43];
        String avanzar = "";

        int ronda = 0;
        int numero = 0;

        boolean fila = false;
        boolean bingo = false;

        System.out.println("Apreta INTRO para avanzar ----->");

        //Cartel de bienvenida
        System.out.println(" ,ggggggggggg,                                                                                                                  \n" +
                "dP\"\"\"88\"\"\"\"\"\"Y8,                                                                                  8I                            \n" +
                "Yb,  88      `8b                                                                                  8I                            \n" +
                " `\"  88      ,8P  gg                                                                 gg           8I                            \n" +
                "     88aaaad8P\"   \"\"                                                                 \"\"           8I                            \n" +
                "     88\"\"\"\"Y8ba   gg    ,ggg,    ,ggg,,ggg,      ggg    gg    ,ggg,    ,ggg,,ggg,    gg     ,gggg,8I    ,ggggg,      ,g,        \n" +
                "     88      `8b  88   i8\" \"8i  ,8\" \"8P\" \"8,    d8\"Yb   88bg i8\" \"8i  ,8\" \"8P\" \"8,   88    dP\"  \"Y8I   dP\"  \"Y8ggg  ,8'8,       \n" +
                "     88      ,8P  88   I8, ,8I  I8   8I   8I   dP  I8   8I   I8, ,8I  I8   8I   8I   88   i8'    ,8I  i8'    ,8I   ,8'  Yb      \n" +
                "     88_____,d8'_,88,_ `YbadP' ,dP   8I   Yb,,dP   I8, ,8I   `YbadP' ,dP   8I   Yb,_,88,_,d8,   ,d8b,,d8,   ,d8'  ,8'_   8)     \n" +
                "    88888888P\"  8P\"\"Y8888P\"Y8888P'   8I   `Y88\"     \"Y8P\"   888P\"Y8888P'   8I   `Y88P\"\"Y8P\"Y8888P\"`Y8P\"Y8888P\"    P' \"YY8P8P    \n\n" +
                "    " );
        System.out.println(" \n" +
                "             ,dPYb,                                                                                                             \n" +
                "             IP'`Yb                                                                                                             \n" +
                "             I8  8I                                                                                                             \n" +
                "             I8  8'                                                                                                             \n" +
                "   ,gggg,gg  I8 dP                                                                                                              \n" +
                "  dP\"  \"Y8I  I8dP                                                                                                               \n" +
                " i8'    ,8I  I8P                                                                                                                \n" +
                ",d8,   ,d8b,,d8b,_                                                                                                              \n" +
                "P\"Y8888P\"`Y88P'\"Y88                                                                                                             \n\n" );

        System.out.println(" \n" +
                " ,ggggggggggg,        ,a8a,  ,ggg, ,ggggggg,      ,gg,         _,gggggg,_                                                       \n" +
                "dP\"\"\"88\"\"\"\"\"\"Y8,     ,8\" \"8,dP\"\"Y8,8P\"\"\"\"\"Y8b    i8\"\"8i      ,d8P\"\"d8P\"Y8b,                                                     \n" +
                "Yb,  88      `8b     d8   8bYb, `8dP'     `88    `8,,8'     ,d8'   Y8   \"8b,dP                                                  \n" +
                " `\"  88      ,8P     88   88 `\"  88'       88     `Y88aaad8 d8'    `Ybaaad88P'                                                  \n" +
                "     88aaaad8P\"      88   88     88        88      d8\"\"\"\"Y8,8P       `\"\"\"\"Y8                                                    \n" +
                "     88\"\"\"\"Y8ba      Y8   8P     88        88     ,8P     8b8b            d8                                                    \n" +
                "     88      `8b     `8, ,8'     88        88     dP      Y8Y8,          ,8P                                                    \n" +
                "     88      ,8P8888  \"8,8\"      88        88 _ ,dP'      I8`Y8,        ,8P'                                                    \n" +
                "     88_____,d8'`8b,  ,d8b,      88        Y8,\"888,,_____,dP `Y8b,,__,,d8P'                                                     \n" +
                "    88888888P\"    \"Y88P\" \"Y8     88        `Y8a8P\"Y888888P\"    `\"Y8888P\"'                                                       ");


        System.out.println("Apreta Intro para continuar! --->");
        avanzar = scan.nextLine();

        //cartones de los jugadores
        llenarTablero(jugador1);
        llenarTablero(jugador2);

        vaciarCasillas(jugador1);
        vaciarCasillas(jugador2);

        llenarVacias(jugador1);
        llenarVacias(jugador2);

        //tablero de bolas:
        llenarTablero(salidaNumeros);
        numerarCasillas(salidaNumeros);

        System.out.println("Tablero de juego: ");
        llenarPartida(partida,salidaNumeros,jugador1,jugador2, ronda, numero);
        tacharNumeros(partida, numero,fila,bingo);
        imprimirTablero(partida);

    }

    private static void numerarCasillas(String[][] salidaNumeros) {
        int cont = 1;
        for(int i = 1; i <salidaNumeros.length; i+=2){
            for(int j = 1; j < salidaNumeros[0].length; j+=2){
                if(cont < 101 && cont < 10){
                    salidaNumeros[i][j] = String.valueOf(cont)+"     ";
                    cont++;
                } else if(cont < 101 && cont >= 10){
                    salidaNumeros[i][j] = String.valueOf(cont)+"    ";
                    cont++;
                }
            }
        }
    }

    private static void tacharNumeros(String[][] partida, int numero, boolean fila, boolean bingo) {
        for(int i = 0; i < partida.length; i++){
            for(int j = 0; j < partida[0].length; j++){

            }
        }
    }

    private static void llenarPartida(String[][] partida, String[][] salidaNumeros, String[][] jugador1, String[][] jugador2, int ronda, int numero) {
        for(int i = 0; i < partida.length; i++){
            for(int j = 0; j < partida[0].length; j++){
                if(j < 21){
                    partida[i][j] = salidaNumeros[i][j];
                } else if (j == 21){
                    partida[i][j] = "           ";
                }else if (j == 22 && i == 0) {
                    partida[i][j] = "JUGADOR 1: ";
                }else if (j > 22 && i == 0){
                    partida[i][j] = "   ";
                }else if (j > 21 && (i > 0 && i < 8)){
                    partida[i][j] = jugador1[i - 1][j-22];
                } else if (i == 8 || i == 9 && j > 21){
                    partida[i][j] = "   ";
                } else if (i == 10 & j == 22){
                    partida[i][j] = "JUGADOR 2: ";
                }else if (j > 22 && i == 10){
                    partida[i][j] = "   ";
                }else if (j > 21 && (i > 10 && i < 18)) {
                    partida[i][j] = jugador2[i - 11][j - 22];
                }else if((i == 18 || i == 19) && j > 21) {
                    partida[i][j] = "   ";
                } else if (i == 20 && (j > 21 && j < 26)){
                    switch (j){
                        case 22:
                            partida[i][j] = "Ronda: ";
                            break;
                        case 23:
                            partida[i][j] = String.valueOf(ronda)+"    ";
                            break;
                        case 24:
                            partida[i][j] = "Numero: ";
                            break;
                        case 25:
                            partida[i][j] = String.valueOf(numero)+"    ";
                            break;
                    }
                } else if ( i == 20 && j > 25){
                    partida[i][j] = "   ";
                }
            }
        }
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
                tablero[1][i] = "\u2588\u2588\u2588\u2588\u2588\u2588";
                contX++;
            }
        }
        while (contX < 5){
            int colRand = rand.nextInt(0,11);
            if(!tablero[1][colRand].equals("\u2588\u2588\u2588\u2588\u2588\u2588") && colRand%2 == 1){
                tablero[1][colRand] = "\u2588\u2588\u2588\u2588\u2588\u2588";
                contX++;
            }
        }
        //fila 2
        contX = 0;
        for(int i = 1; i < tablero[0].length; i+=2){
            int siNo = rand.nextInt(0,2);
            if(i % 2 == 1 && siNo == 1 && contX < 5){
                tablero[3][i] = "\u2588\u2588\u2588\u2588\u2588\u2588";
                contX++;
            }
        }
        while (contX < 5){
            int colRand = rand.nextInt(0,11);
            if(!tablero[3][colRand].equals("\u2588\u2588\u2588\u2588\u2588\u2588") && colRand%2 == 1){
                tablero[3][colRand] = "\u2588\u2588\u2588\u2588\u2588\u2588";
                contX++;
            }
        }
        //Contar las X de les columnes per saber si s'ha d'aplicar l'algoritme o no.
        contX = 0;
        for(int j = 1; j < tablero[0].length; j++){
            if(contarX(tablero, j) == 1){
                int siNo = rand.nextInt(0, 2);
                if ((siNo == 1 && contX < 5) && j%2 == 1) {
                    tablero[5][j] = "\u2588\u2588\u2588\u2588\u2588\u2588";
                    contX++;
                }
            } else if (contarX(tablero,j) == 0 && j%2 == 1 && contX < 5){
                tablero[5][j] = "\u2588\u2588\u2588\u2588\u2588\u2588";
                contX++;
            }
        }
        while (contX < 5){
            int colRand = rand.nextInt(0,11);
            if(colRand % 2 == 1) {
                if (!tablero[5][colRand].equals("\u2588\u2588\u2588\u2588\u2588\u2588") && contarX(tablero, colRand) == 1) {
                    tablero[5][colRand] = "\u2588\u2588\u2588\u2588\u2588\u2588";
                    contX++;
                }
            }
        }
    }

    private static int contarX(String[][] tablero, int j) {
        int contColumnas = 0;
        for(int i = 1; i < tablero.length; i+=2){
            if(tablero[i][j].equals("\u2588\u2588\u2588\u2588\u2588\u2588")){
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
