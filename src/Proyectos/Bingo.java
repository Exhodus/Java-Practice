package Proyectos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Bingo {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    static  String blank = "\u2588\u2588\u2588\u2588\u2588\u2588";
    static int ronda = 0;
    static boolean bingo = false;
    static boolean fila = false;
    static ArrayList<Integer> jaHaSortit = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        //Declaració de variables importants
        StringBuilder[][] jugador1 = new StringBuilder[7][21];
        StringBuilder[][] jugador2 = new StringBuilder[7][21];
        StringBuilder[][] salidaNumeros = new StringBuilder[21][21];
        StringBuilder[][] partida = new StringBuilder[21][43];
        String avanzar = "";

        //Iniciacització de les matrius.
        inicializar(jugador1);
        inicializar(jugador2);
        inicializar(salidaNumeros);
        inicializar(partida);

        int numero = 0;
        ArrayList<Integer> jaHaSortit = new ArrayList<>();

        boolean filaJ1 = false;
        boolean filaJ2 = false;

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
        imprimirTablero(partida);

        System.out.println();
        System.out.print("Empezar Partida? S/N:  ");
        avanzar = scan.next();

        if(avanzar.equals("S") || avanzar.equals("s")){

            //Miro si hi ha bingo o fila en negatiu per tal de continuar en el bucle.
            //Declaro 2 variables diferents per cada jugador per controlar en cas de empat tant en files com en bingo.
            while (!bingo || !fila) {
                avanzarPartida(partida, salidaNumeros, jugador1, jugador2, numero);
                filaJ1 = isFila(jugador1);
                filaJ2 = isFila(jugador2);

                if(!fila) {
                    if (filaJ1 && filaJ2) {
                        System.out.println("Los 2 jugadores han hecho FILA a la vez!!! Maravillosa jugada.");
                        fila = true;
                    } else if (filaJ1) {
                        System.out.println("El jugador 1 ha hecho Fila!!! espectacular.");
                        fila = true;
                    } else if (filaJ2) {
                        System.out.println("El jugador 2 ha hecho Fila!!! espectacular.");
                        fila = true;
                    }


                } else {
                    boolean bingoJ1 =  isBingo(jugador1);
                    boolean bingoJ2 = isBingo(jugador2);

                    if(bingoJ1 && bingoJ2){
                        System.out.println("LOS 2 JUGADORES HAN GANADO A LA VEZ!!! PERO QUE ESTA PASANDO MADRE MIA VAYA PARTIDAZA!!!");
                        bingo = true;
                    } else if (bingoJ1){
                        System.out.println("EL JUGADOR 1 HA GANADO CON UNA VICTORIA APLASTANTE AL JUGADOR 2!!!");
                        bingo = true;
                    } else if(bingoJ2){
                        System.out.println("EL JUGADOR 2 HA GANADO CON UNA VICTORIA APLASTANTE AL JUGADOR 1!!!");
                        bingo = true;
                    }
                }



            }
        }

    }

    //Aquesta clase controla si hi ha bingo utilizant un contador que sigui igual a 15, que es el tota de numeros
    //per cartó.
    private static boolean isBingo(StringBuilder[][] jugador) {
        boolean  ganar = false;
        int cont = 0;

        for(int i = 1; i < jugador.length; i +=2){
            for(int j = 1; j < jugador[0].length; j+=2){
                if(jugador[i][j].charAt(jugador[i][j].length()-2) == 'X') {
                    cont++;
                }
            }
        }
        if(cont == 15){
            ganar = true;
        }

        return ganar;
    }

    //Inicialitzo les matrius per tal de que no donin null i poder treballar-les.

    private static void inicializar(StringBuilder[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                tablero[i][j] = new StringBuilder();
            }
        }
    }

    //Controlo si hi ha fila amb un contador a 5. La cuantitat de numeros que hi ha a una fila.
    private static boolean isFila(StringBuilder[][] jugador) {
        boolean fila = false;
        int cont = 0;

        for(int i = 1; i < jugador.length; i +=2){
            for(int j = 1; j < jugador[0].length; j+=2){
                if(jugador[i][j].charAt(jugador[i][j].length()-2) == 'X') {
                    cont++;
                }
            }
            if(cont == 5){
                fila = true;
            }
            cont = 0;
        }

        return fila;
    }

    //Avanço partida generant un numero aleatori del 1 al 100. Comprobo si ja ha sortit miran una ArrayList de Integers
    //que he creat previament i, en cas positiu, el busco dintre de cada matriu.
    //
    //Haig de sumar las rondas aquí perque si ho feia en el Main sumaba inclus les rondes on trobava un numero repetit
    //i les rondes podien pujar fins a les 300, Lo mateix amb el sleep i els sysos.
    private static void avanzarPartida(StringBuilder[][] partida, StringBuilder[][] salidaNumeros, StringBuilder[][] jugador1, StringBuilder[][] jugador2, int numero) throws InterruptedException {

        numero = rand.nextInt(1,101);

        if(!jaHaSortit.contains(numero)) {
            jaHaSortit.add(numero);
            encontrarNumero(jugador1,numero);
            encontrarNumero(jugador2,numero);
            encontrarNumero(salidaNumeros,numero);
            ronda++;
            llenarPartida(partida, salidaNumeros, jugador1, jugador2, ronda, numero);
            imprimirTablero(partida);

            TimeUnit.SECONDS.sleep(2);
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }


    //Comrpobo si las matrius tenen el numero que ha sortit i els afegeix-ho una X al penúltim carácter
    //per fer-ho mes estétic.
    private static void encontrarNumero(StringBuilder[][] jugador, int numero) {
        for(int i = 1; i < jugador.length; i+=2){
            for(int j = 1; j < jugador[0].length; j+=2){
                if(numero >= 10){
                    if(jugador[i][j].toString().equals(numero+"    ")){
                        jugador[i][j].setCharAt(jugador[i][j].length()-2, 'X');
                    }
                } else {
                    if(jugador[i][j].toString().equals(numero+"     ")){
                        jugador[i][j].setCharAt(jugador[i][j].length()-2, 'X');
                    }
                }
            }
        }
    }

    //Numero las caselles del Taulell principal amb tots el numeros.
    private static void numerarCasillas(StringBuilder[][] salidaNumeros) {
        int cont = 1;
        for(int i = 1; i <salidaNumeros.length; i+=2){
            for(int j = 1; j < salidaNumeros[0].length; j+=2){
                if(cont < 101 && cont < 10){
                    salidaNumeros[i][j] = new StringBuilder(cont+"     ");
                    cont++;
                } else if(cont < 101 && cont >= 10){
                    salidaNumeros[i][j] = new StringBuilder(cont+"    ");
                    cont++;
                }
            }
        }
    }

    //Aqui hi ha una matriu de matrius. Dintre de una matriu mes gran he ficat tant la salidaNumeros, jugador1 i jugador2
    // deixant una columna en mig amb un espai bastant ample per tal de distingir be el taulell dels jugadors.

    private static void llenarPartida(StringBuilder[][] partida, StringBuilder[][] salidaNumeros, StringBuilder[][] jugador1, StringBuilder[][] jugador2, int ronda, int numero) {
        for(int i = 0; i < partida.length; i++){
            for(int j = 0; j < partida[0].length; j++){
                if(j < 21){
                    partida[i][j] = salidaNumeros[i][j];
                } else if (j == 21){
                    partida[i][j] = new StringBuilder("           ");
                }else if (j == 22 && i == 0) {
                    partida[i][j] = new StringBuilder("JUGADOR 1");
                }else if (j > 22 && i == 0){
                    partida[i][j] = new StringBuilder("   ");
                }else if ((j > 21)&& (i > 0 && i < 8)){
                    partida[i][j] = jugador1[i - 1][j-22];
                } else if (i == 8 || i == 9 && j > 21){
                    partida[i][j] = new StringBuilder("   ");
                } else if (i == 10 & j == 22){
                    partida[i][j] = new StringBuilder("JUGADOR 2: ") ;
                }else if (j > 22 && i == 10){
                    partida[i][j] = new StringBuilder("   ");
                }else if ((j > 21) && (i > 10 && i < 18)) {
                    partida[i][j] = jugador2[i - 11][j - 22];
                }else if((i == 18 || i == 19) && j > 21) {
                    partida[i][j] = new StringBuilder("   ");
                } else if (i == 20 && (j > 21 && j < 26)){
                    switch (j){
                        case 22:
                            partida[i][j] = new StringBuilder("Ronda: ") ;
                            break;
                        case 23:
                            partida[i][j] = new StringBuilder(ronda+"    ");
                            break;
                        case 24:
                            partida[i][j] = new StringBuilder("Numero: ");
                            break;
                        case 25:
                            partida[i][j] = new StringBuilder(numero+"    ");
                            break;
                    }
                } else if ( i == 20 && j > 25){
                    partida[i][j] = new StringBuilder("   ");
                }
            }
        }
    }


    //Aqui comprobo la columna on ens trobem del cartró dels jugadors. Segons el cartró li poso un minim o un maxim dintre de una desena.
    private static void llenarVacias(StringBuilder[][] tablero) {
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
           for(int i = 1; i < tablero.length; i+=2){
               if(num1 > 9) {
                   if (tablero[i][j].toString().equals("      ")) {
                       if (num1 < num2 ) {
                           tablero[i][j] = new StringBuilder(num1+"    ");
                       } else if (num1 > num2) {
                           tablero[i][j] = new StringBuilder(num2+"    ");

                       } else if (num1 > num2 ) {
                           tablero[i][j] = new StringBuilder(num1+"    ");

                       } else if (num1 < num2 ) {
                           tablero[i][j] = new StringBuilder(num2+"    ");

                       }
                   }
               } else {
                   if (tablero[i][j].toString().equals("      ")) {
                       if (num1 < num2 ) {
                           tablero[i][j] = new StringBuilder(num1+"     ");

                       } else if (num1 > num2 ) {
                           tablero[i][j] = new StringBuilder(num2+"     ");

                       } else if (num1 > num2 ) {
                           tablero[i][j] = new StringBuilder(num1+"     ");

                       } else if (num1 < num2 ) {
                           tablero[i][j] = new StringBuilder(num2+"     ");

                       }
                   }
               }
           }
        }

    }

    //Buidar les caselles
    //Miro la cantitat de "buits" que hi ha a les files, han de haver-hi exactament 5. Sino, faig bucle fins que surtin.

    private static void vaciarCasillas(StringBuilder[][] tablero) {
        int contX = 0;
        //fila 1
        for(int i = 1; i < tablero[0].length; i+=2){
            int siNo = rand.nextInt(0,2);
            if(i % 2 == 1 && siNo == 1 && contX < 5){
                tablero[1][i] = new StringBuilder(blank);
                contX++;
            }
        }
        while (contX < 5){
            int colRand = rand.nextInt(0,11);
            if(!tablero[1][colRand].toString().equals(blank) && colRand%2 == 1){
                tablero[1][colRand] = new StringBuilder(blank);
                contX++;
            }
        }
        //fila 2
        contX = 0;
        for(int i = 1; i < tablero[0].length; i+=2){
            int siNo = rand.nextInt(0,2);
            if(i % 2 == 1 && siNo == 1 && contX < 5){
                tablero[3][i] = new StringBuilder(blank);
                contX++;
            }
        }
        while (contX < 5){
            int colRand = rand.nextInt(0,11);
            if(!tablero[3][colRand].toString().equals(blank) && colRand%2 == 1){
                tablero[3][colRand] = new StringBuilder(blank);
                contX++;
            }
        }
        //Contar las X de les columnes per saber si s'ha d'aplicar l'algoritme o no.
        contX = 0;
        for(int j = 1; j < tablero[0].length; j++){
            int x = contarX(tablero,j,blank);
            if(x == 1){
                int siNo = rand.nextInt(0, 2);
                if ((siNo == 1 && contX < 5) && j%2 == 1) {
                    tablero[5][j] = new StringBuilder(blank);
                    contX++;
                }
            } else if (x == 0 && j%2 == 1 && contX < 5){
                tablero[5][j] = new StringBuilder(blank);
                contX++;
            }
        }
        while (contX < 5){
            int colRand = rand.nextInt(0,11);
            if(colRand % 2 == 1) {
                if (!tablero[5][colRand].toString().equals(blank) && (contarX(tablero, colRand,blank) == 1 || contarX(tablero, colRand,blank) == 0)) {
                    tablero[5][colRand] = new StringBuilder(blank);
                    contX++;
                }
            }
        }
    }

    //Aqui simplement conto la cuantitat de caselles buides per després poder mirar si aplicar l'algoritme.
    private static int contarX(StringBuilder[][] tablero, int j,String blank) {
        int contColumnas = 0;
        for(int i = 1; i < tablero.length; i+=2){
            if(tablero[i][j].toString().equals(blank)){
                contColumnas++;
            }
        }

       return contColumnas;
    }

    //Imprimeix el tablero.

    private static void imprimirTablero(StringBuilder[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    //Aquesta funció només ompla la matriu amb els marcs del cartró.

    private static void llenarTablero(StringBuilder[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(j % 2 != 0){
                    if(i% 2 == 1 && j % 2 == 1){
                        tablero[i][j] = new StringBuilder("      ");
                    } else {
                        tablero[i][j] = new StringBuilder("------");
                    }
                } else {
                    if(i% 2 == 1 && j % 2 == 1){
                        tablero[i][j] = new StringBuilder(" ");
                    } else if (j%2 == 0 && i % 2 == 1 ){
                        tablero[i][j] = new StringBuilder("|");
                    } else {
                        tablero[i][j] = new StringBuilder("·");
                    }
                }
            }
        }

    }
}
