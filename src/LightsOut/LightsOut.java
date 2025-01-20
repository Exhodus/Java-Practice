package LightsOut;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class LightsOut {
    static Scanner scan = new Scanner(System.in);
    static String[][] taulell;

    public static void main(String[] args) {

        String nomJugador = "Jugador";
        Integer N = 3;

        taulell = new String[N+N+1][N+N+1];

        boolean sortir = false;
        boolean acabarConfi = false;

        while (!sortir) {
        int opcio = menu();
        scan.nextLine(); // Sempre recordem que després d'escaneja un int ens queda el BUG
            switch (opcio) {
                case 1:
                    System.out.println("Configuracio");
                    System.out.println("El nom primer:");
                    nomJugador = scan.nextLine();
                    while (!acabarConfi) {
                        System.out.println("Tamany del tauler");
                        N = scan.nextInt();
                        scan.nextLine();
                        taulell = new String[N+N+1][N+N+1];
                        if(asegurarTamany(N)){
                            acabarConfi = true;
                        }
                    }
                    break;
                case 2:
                    jugar(nomJugador,N,acabarConfi);
                    break;
                case 3:
                    sortir = true;
            }
        }
    }

    private static void enmarcarTaulell() {
        for(int i = 0; i < taulell.length; i++){
            for(int j = 0; j < taulell[0].length; j++){
                if(j % 2 != 0){
                    if(i% 2 == 1 && j % 2 == 1){
                        taulell[i][j] = "   ";
                    } else {
                        taulell[i][j] = "---";
                    }
                } else {
                    if(i% 2 == 1 && j % 2 == 1){
                        taulell[i][j] = " ";
                    } else if (j%2 == 0 && i % 2 == 1 ){
                        taulell[i][j] = "|";
                    } else {
                        taulell[i][j] = "·";
                    }
                }
            }
        }
    }

    private static boolean asegurarTamany(Integer n) {
        String resposta = "";
        System.out.println("El taulell es veurá així: ");
        InicialitzarTaulell();
        mostrar();
        System.out.println("Vols deixar-lo així? ");
        resposta = scan.nextLine();
        if(resposta.equals("S")|| resposta.equals("s") || resposta.equals("SI") || resposta.equals("si") || resposta.equals("Si")){
            return true;
        } else {
            return false;
        }
    }

    private static int menu() {
        System.out.println("█    ▄█   ▄▀   ▄  █    ▄▄▄▄▀ ▄▄▄▄▄       ████▄   ▄     ▄▄▄▄▀ \n" +
                            "█    ██ ▄▀    █   █ ▀▀▀ █   █     ▀▄     █   █    █ ▀▀▀ █    \n" +
                            "█    ██ █ ▀▄  ██▀▀█     █ ▄  ▀▀▀▀▄       █   █ █   █    █    \n" +
                            "███▄ ▐█ █   █ █   █    █   ▀▄▄▄▄▀        ▀████ █   █   █     \n" +
                            "    ▀ ▐  ███     █    ▀                        █▄ ▄█  ▀      \n" +
                            "                ▀                               ▀▀▀          \n" +
                            "                                                            ");

        System.out.println("MENU: ");
        System.out.println("      1 - Configuració");
        System.out.println("      2 - Jugar");
        System.out.println("      3 - Sortir");
        int num = scan.nextInt();
        return num;
    }

    private static void jugar(String nomJugador, Integer N, boolean acabarConfi) {
        boolean win = false;
        int nMoviments = 0;

        if(!acabarConfi) {
            InicialitzarTaulell();
        }
        HashMap<Integer,String> caselles = iniDiccionari(taulell,N);
        while (!win) {
            mostrar();
            int p = seleccionarPosicio(N);
            Posicio posicio = mirarPosicio(p,caselles);
            activar(taulell, posicio);
            win = comprovarVictoria(taulell, N);
            nMoviments++;
        }
      System.out.println("Enhorabona, " + nomJugador + ", has guanyat en " + nMoviments + " moviments");
    }

    private static Posicio mirarPosicio(int p, HashMap<Integer, String> caselles) {
            Posicio fc = new Posicio();
            String[] separats = caselles.get(p).split(" ");

            fc.files = Integer.parseInt(separats[0]);
            fc.columnes = Integer.parseInt(separats[1]);
            return fc;
    }

    private static  HashMap iniDiccionari(String[][] taulell, Integer N) {
        HashMap<Integer, String> casellas = new HashMap<>();
        int cont = 1;
        for(int i = 1; i < taulell.length; i+=2){
            for(int j = 1; j < taulell[0].length; j+=2){
                casellas.put(cont,i+" "+j);
                cont++;
            }
        }

        return  casellas;
    }

    private static void activar(String[][] taulell, Posicio p) {
        // TODO Auto-generated method stub

        for(int i = p.files-2; i <= p.files+2; i+=2){
            for(int j = p.columnes-2; j <= p.columnes+2; j+=2){
                if(!estoyFuerisima(i,j,taulell) && mirarEsquinas(i,j,taulell,p)){
                    if(taulell[i][j].equals(" \u2588 ")){
                        taulell[i][j] = "   ";
                    } else{
                        taulell[i][j] = " \u2588 ";
                    }
                }
            }
        }

    }

    /**
     * Comprueba que en una matriz las esquinas no se tengan en cuenta.
     * @param i (filas)
     * @param j (columnas)
     * @param taulell (matriz)
     * @param p (posición desde la cual se debe de mirar)
     * @return true si la posición relativa de p con tablero[i][j] no es una esquina. False si lo es.
     */

    private static boolean mirarEsquinas(int i, int j, String[][] taulell, Posicio p) {
        if((i == p.files-2 && j == p.columnes) ||
                (i == p.files && j == p.columnes-2) ||
                (i == p.files && j == p.columnes+2) ||
                (i == p.files+2 && j == p.columnes) ||
                (i == p.files && j == p.columnes)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean estoyFuerisima(int i, int j, String[][] taulell) {
        if(i < 0 || i > taulell.length-1 || j< 0 || j > taulell[0].length -1){
            return true;
        } else {
            return false;
        }
    }

    private static boolean comprovarVictoria(String[][] taulell, Integer N) {
        // TODO Auto-generated method stub
        int count = 0;
        for(int i = 0; i < taulell.length; i++){
            for(int j = 0; j < taulell[0].length; j++){
                if(taulell[i][j].equals("   ")){
                    count++;
                }
            }
        }

        if(count == Math.pow(N,2)){
            return true;
        }
        return false;
    }


    /**
     *
     * @return
     */
    private static int seleccionarPosicio(Integer N) {
        // TODO Auto-generated method stub
        int num = 0;

        while (true) {
            System.out.println("Escull la casella: (del 1 al " + (N * N) + ").");
            System.out.println("Casella: ");
            num = scan.nextInt();
            if(num <= N*N && num > 0 ){
                return num;
            } else {
                System.out.println("El numero es massa gran o massa petit!, Torna-ho a intentar. Recorda:");
            }


        }
    }

    /**
     * Printa por consola una matriz con espacios.
     */

    private static void mostrar() {
        // TODO Auto-generated method stub
        for(int i = 0; i < taulell.length; i++){
            for(int j = 0; j < taulell[0].length; j++){
                System.out.print(taulell[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Inicializa un tablero con casillas blancas y negras.
     *
     *
     */

    private static void InicialitzarTaulell() {
        // TODO Auto-generated method stub
        Random rand = new Random();
        int numRand = 0;

        for(int i = 0; i < taulell.length; i++){
            for(int j = 0; j < taulell[0].length; j++){
                if(j % 2 != 0){
                    if(i% 2 == 1 && j % 2 == 1){
                        numRand = rand.nextInt(0,101);
                        if(numRand < 50) {
                            taulell[i][j] = " \u2588 ";
                        } else {
                            taulell[i][j] = "   ";
                        }
                    } else {
                        taulell[i][j] = "---";
                    }
                } else {
                    if(i% 2 == 1 && j % 2 == 1){
                        taulell[i][j] = " ";
                    } else if (j%2 == 0 && i % 2 == 1 ){
                        taulell[i][j] = "|";
                    } else {
                        taulell[i][j] = "·";
                    }
                }
            }
        }

    }

}
