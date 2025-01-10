package Memory;

import java.util.ArrayList;
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

    public static void main(String[] args) {
        boolean sortir = false;

        Jugadors player1 = new Jugadors();
        Jugadors player2 = new Jugadors();
        Tableros tableroBase = new Tableros();
        Tableros tableroJuego = new Tableros();


        while (!sortir){
            System.out.println("Benvinguts al");
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
        int alsada, ample;
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("DE CUANT VOLS LA MATRIU? ");
        System.out.print("ALSADA: ");
        alsada = scan.nextInt();
        System.out.print("AMPLADA: ");
        ample = scan.nextInt();
        scan.nextLine();

        String[][] tableroJugadores = new String[alsada][ample];
        llenarTableros(tableroJuego,alsada,ample,tableroBase);
        int turno = rand.nextInt(0,2);
        while (!partida){
//            juego(turno,player1,player2,tableroJuego);
//            partida = guanyat(tableroJuego);
            partida = true;
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

    private static void llenarTableros(Tableros tableroJuego, int alsada, int ample, Tableros tableroBase) {

        int lletresNecesaries = (alsada*ample)/2;

        for(int i = 0; i < lletresNecesaries; i++){
            // Utilitzo contador y no una flag per fer-ho 2 vegades.
            int cont = 0;
            while (cont < 2) {
                int filas = rand.nextInt(0,alsada-1);
                int cols = rand.nextInt(0, ample-1 );
                if (tableroBase.tablero[filas][cols].isEmpty()) {
                    tableroBase.tablero[filas][cols] = lletres[i];
                    cont++;
                }
            }
        }

        printTableros(tableroBase);
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
