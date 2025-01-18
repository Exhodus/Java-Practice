package LightsOut;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class LightsOut {
    static Scanner scan = new Scanner(System.in);
    static String[][] taulell = new String[3][3];

    public static void main(String[] args) {

        String nomJugador = null;
        Integer N = 3;

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
        HashMap<String,String> caselles = iniDiccionari(taulell,N);
        while (!win) {
            mostrar();
            Posicio p = seleccionarPosicio();
            String[] entrada = {Integer.toString(p.files), Integer.toString(p.columnes)};
            String numCasella = sacarValorStringArrayToString(entrada,caselles);
            activar(taulell, numCasella, caselles);
            win = comprovarVictoria(taulell, N);
            nMoviments++;
        }
      System.out.println("Enhorabona, " + nomJugador + ", has guanyat en " + nMoviments + " moviments");
    }

    private static String sacarValorStringArrayToString(String[] entrada, HashMap<String,String> caselles) {
        String sortida = entrada[0]+entrada[1];
        return sortida;
    }

    private static  HashMap iniDiccionari(String[][] taulell, Integer N) {
        HashMap<String, String> casellas = new HashMap<>();
        int cont = 1;
        for(int i = 1; i < taulell.length; i+=2){
            for(int j = 1; j < taulell[0].length; j+=2){
                casellas.put(i+" "+j,cont+"");
            }
        }

        System.out.println(casellas);

        return  casellas;
    }

    private static void activar(String[][] taulell, String p, HashMap<String, String> caselles) {
        // TODO Auto-generated method stub


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
        if((i == p.files-1 && j == p.columnes) ||
                (i == p.files && j == p.columnes-1) ||
                (i == p.files && j == p.columnes+1) ||
                (i == p.files+1 && j == p.columnes) ||
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
     * Arreglar esto, Tiene que ser un solo input con el numero de la casilla.
     * @return
     */
    private static Posicio seleccionarPosicio() {
        // TODO Auto-generated method stub
        Posicio p = new Posicio();
        p.columnes = 0;
        p.files = 0;

        System.out.println("Escull Posició: (Recorda, comença en 0)");
        System.out.println("Files: ");
        p.files = scan.nextInt();
        System.out.println("Columnes: ");
        p.columnes = scan.nextInt();
        return p;
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
