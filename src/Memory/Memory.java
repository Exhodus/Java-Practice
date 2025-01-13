package Memory;

import java.util.Random;
import java.util.Scanner;

public class Memory {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();

    //Estatica perque un cop inicialitzada no canviará en tot el joc. Al contrari que la següent
    //que anirá consultant aquesta constantment.
    //static String[][] tableroBase;

    //Faig Aquesta Array Statica perque l'utilitzaré més endevant per anar omplint las matrius.
    static String[] lletres = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N",
            "O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    static int files;
    static int cols;

    public static void main(String[] args) {
        boolean sortir = false;

        Jugadors player1 = new Jugadors();
        Jugadors player2 = new Jugadors();
        Tableros tableroBase = new Tableros();
        Tableros tableroJuego = new Tableros();


        while (!sortir){
            System.out.println("\n" +
                    "                                                            .-'''-.                               \n" +
                    "                                                           '   _    \\                             \n" +
                    " __  __   ___           __.....__       __  __   ___     /   /` '.   \\                            \n" +
                    "|  |/  `.'   `.     .-''         '.    |  |/  `.'   `.  .   |     \\  '            .-.          .- \n" +
                    "|   .-.  .-.   '   /     .-''\"'-.  `.  |   .-.  .-.   ' |   '      |  ' .-,.--.    \\ \\        / / \n" +
                    "|  |  |  |  |  |  /     /________\\   \\ |  |  |  |  |  | \\    \\     / /  |  .-. |    \\ \\      / /  \n" +
                    "|  |  |  |  |  |  |                  | |  |  |  |  |  |  `.   ` ..' /   | |  | |     \\ \\    / /   \n" +
                    "|  |  |  |  |  |  \\    .-------------' |  |  |  |  |  |     '-...-'`    | |  | |      \\ \\  / /    \n" +
                    "|  |  |  |  |  |   \\    '-.____...---. |  |  |  |  |  |                 | |  '-        \\ `  /     \n" +
                    "|__|  |__|  |__|    `.             .'  |__|  |__|  |__|                 | |             \\  /      \n" +
                    "                      `''-...... -'                                     | |             / /       \n" +
                    "                                                                        |_|         |`-' /        \n" +
                    "                                                                                     '..'         \n");


            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("MENU: ");
            System.out.println("     1. - JUGAR");
            System.out.println("     2. - CONFIGURACIO");
            System.out.println("     3. - VICTORIES");

            int opcio = scan.nextInt();
            switch (opcio){
                case 1:
                    jugar(player1, player2,tableroBase,tableroJuego);
                    break;
                case 2:
                    configurar(player1, player2);
                    break;
                case 3:
                    enseñarVictorias(player1,player2);
                    break;
                default:
                    sortir = true;
            }
        }
    }

    private static void jugar(Jugadors player1, Jugadors player2, Tableros tableroBase, Tableros tableroJuego) {

        boolean partida = false;
        String siNo = "";
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("DE CUANT VOLS LA MATRIU? ");
        System.out.print("ALSADA: ");
        files = scan.nextInt();
        System.out.print("AMPLADA: ");
        cols = scan.nextInt();
        scan.nextLine();

        tableroBase.tablero = new String[files][cols];
        tableroJuego.tablero = new String[files][cols];
        initMatriz(tableroBase,tableroJuego);

        llenarTableroBase(tableroBase, files, cols);
        llenarTableroJuego(tableroJuego, files, cols);
        int turno = rand.nextInt(0,2);

        String ganador = "";

        while (!partida) {
            if (turno == 0) {
                System.out.println("TORN DE "+player1.nom);
                System.out.println();
                juega1(player1, tableroJuego, tableroBase);
                if(seFini(tableroJuego, tableroBase)){
                    partida = true;
                    ganador = mirarPuntos(player1, player2);
                } else {
                    turno = 1;
                }
            } else {
                System.out.println("TORN DE "+player2.nom);
                juega1(player2, tableroJuego, tableroBase);
                if(seFini(tableroJuego, tableroBase)){
                    partida = true;
                    ganador = mirarPuntos(player1, player2);
                } else {
                    turno = 0;
                }
            }
        }

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("VOLS TORNAR A JUGAR? ");
        System.out.print("S/N: ");
        siNo = scan.nextLine();
        if(siNo.equals("S")|| siNo.equals("s")){
            jugar(player1,player2,tableroBase,tableroJuego);
        }

    }

    private static boolean seFini(Tableros tablero, Tableros tableroBase) {
        int contCartass = 0;
        int contCasillas = 0;
        for(int i = 0; i < tablero.tablero.length; i++){
            for(int j = 0; j < tablero.tablero[0].length; j++){
                contCasillas++;
                if(tablero.tablero[i][j].equals(tableroBase.tablero[i][j])){
                    contCartass++;
                }
            }
        }

        if(contCasillas == contCartass){
            return true;
        } else {
            return false;
        }
    }


    private static String mirarPuntos(Jugadors player1, Jugadors player2) {
        if (player1.numPunts > player2.numPunts){
            return player1.nom;
        } else if (player1.numPunts < player2.numPunts){
            return player2.nom;
        } else {
            return "EMPAT!";
        }
    }


    private static void juega1(Jugadors player, Tableros tableroJuego, Tableros tableroBase) {

        printTableros(tableroBase);
        System.out.println("ESCULL UNA CASELLA -->");
        System.out.print("FILA: ");
        files = scan.nextInt();
        System.out.print("COLUMNA: ");
        cols = scan.nextInt();

        int files1 = files;
        int cols1 = cols;

        if(!estoyFuerisima(tableroJuego,files,cols) && !yaDestapada(tableroBase,tableroJuego,files,cols)){
            destapar(tableroJuego,tableroBase,files,cols);
            printTableros(tableroJuego);
        }

        System.out.println("ESCULL UN ALTRE -->");
        System.out.print("FILA: ");
        files = scan.nextInt();
        System.out.print("COLUMNA: ");
        cols = scan.nextInt();

        if(!estoyFuerisima(tableroJuego,files,cols) && !yaDestapada(tableroBase,tableroJuego,files,cols)){
            destapar(tableroJuego,tableroBase,files,cols);
            printTableros(tableroJuego);
        }

        
        if(tableroJuego.tablero[files1][cols1].equals(tableroJuego.tablero[files][cols])){
            System.out.println("---> +10 PUNTS! <---");
            System.out.println();
            System.out.println("ET TORNA A TOCAR! -->");
            player.numPunts +=10;
            juega1(player, tableroJuego, tableroBase);
        } else {
            tapar(tableroJuego,files,files1,cols1,cols);
            System.out.println("OOH Mala SORT!");
        }
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        printTableros(tableroJuego);
    }

    private static void tapar(Tableros tableroJuego, int files, int files1, int cols1, int cols) {
        tableroJuego.tablero[files][cols] = " & ";
        tableroJuego.tablero[files1][cols1] = " & ";
    }

    private static void destapar(Tableros tableroJuego, Tableros tableroBase, int files, int cols) {
        tableroJuego.tablero[files][cols] = tableroBase.tablero[files][cols];
    }

    private static boolean yaDestapada(Tableros tableroBase,Tableros tableroJuego, int files, int cols) {
        if(tableroBase.tablero[files][cols].equals(tableroJuego.tablero[files][cols])){
            return true;
        } else {
            return false;
        }
    }

    private static boolean estoyFuerisima(Tableros tableroJuego, int files, int cols) {
            if(files < 0 || files > tableroJuego.tablero.length-1 || cols < 0 || cols > tableroJuego.tablero[0].length){
                return true;
            } else {
                return false;
            }
    }


    private static void initMatriz(Tableros tableroBase, Tableros tableroJuego) {
        for(int i = 0; i < tableroBase.tablero.length; i++){
            for(int j = 0; j < tableroBase.tablero[0].length; j++){
                tableroBase.tablero[i][j] = "";
                tableroJuego.tablero[i][j] = "";
            }
        }
    }

    private static void llenarTableroJuego(Tableros tableroJuego, int alsada, int ample){
        int cont = 0;
        for(int i = 0; i < tableroJuego.tablero.length; i++){
            for(int j = 0; j < tableroJuego.tablero[0].length; j++){
                cont++;
                tableroJuego.tablero[i][j] = " & ";
            }
        }
    }

    private static void llenarTableroBase(Tableros tableroBase, int alsada, int ample) {

        int lletresNecesaries = (alsada*ample)/2;

        for(int i = 0; i < lletresNecesaries; i++){
            // Utilitzo contador y no una flag per fer-ho 2 vegades.
            int cont = 0;
            while (cont < 2) {
                int filas = rand.nextInt(0,alsada);
                int cols = rand.nextInt(0, ample);
                if (tableroBase.tablero[filas][cols].isEmpty()) {
                    tableroBase.tablero[filas][cols] = " "+lletres[i]+" ";
                    cont++;
                }
            }
        }
    }

    private static void printTableros(Tableros tableroBase) {
        for(int i = 0; i < tableroBase.tablero.length; i++){
            for(int j = 0; j < tableroBase.tablero[0].length; j++){
                System.out.print(tableroBase.tablero[i][j]);
            }
            System.out.println();
        }
    }

    private static void enseñarVictorias(Jugadors player1, Jugadors player2) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println();
        System.out.println("_____________");
        System.out.println("| "+player1.nom+" |     VICTORIAS: "+player1.numVictor);
        System.out.println("_____________");
        System.out.println();
        System.out.println("_____________");
        System.out.println("| "+player2.nom+" |     VICTORIAS: "+player1.numVictor);
        System.out.println("_____________");
    }

    private static void configurar(Jugadors player1, Jugadors player2) {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("CONFIGURACIO: ");
        System.out.println("     1. - CAMBIAR NOM");
        System.out.println("     2. - RESETEAR VICTORIAS");
        System.out.println("     3. - SALIR");
        int opcio = scan.nextInt();
        scan.nextLine();
        switch (opcio) {
            case 1:
                System.out.print("NOM DEL JUGADOR 1: ");
                player1.nom = scan.nextLine();
                System.out.println();
                System.out.print("NOM DEL JUGADOR 2: ");
                player2.nom = scan.nextLine();
                break;
            case 2:
                System.out.println("ESTAS SEGUR? EL JUGADOR 1 TE "+player1.numVictor+" I EL JUGADOR 2 TE "+player2.numVictor);
                System.out.println("S/N");
                String siNo = scan.nextLine();
                if(siNo.equals("S") || siNo.equals("s")){
                    player1.numVictor = 0;
                    player1.numPunts = 0;
                    player2.numPunts = 0;
                    player2.numVictor = 0;
                }
        }
    }
}
