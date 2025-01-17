package LightsOut;

import java.util.Random;
import java.util.Scanner;

public class LightsOut {
    static Scanner scan = new Scanner(System.in);
    static String[][] taulell = new String[3][3];

    public static void main(String[] args) {

        String nomJugador = null;
        Integer N = null;

        boolean sortir = false;

        while (!sortir) {
        int opcio = menu();
        scan.nextLine(); // Sempre recordem que després d'escaneja un int ens queda el BUG
            switch (opcio) {
                case 1:
                    boolean acabarConfi = false;
                    System.out.println("Configuracio");
                    System.out.println("El nom primer:");
                    nomJugador = scan.nextLine();
                    while (!acabarConfi) {
                        System.out.println("Tamany del tauler");
                        N = scan.nextInt();
                        scan.nextLine();
                        taulell = new String[N][N];
                        if(asegurarTamany(N)){
                            acabarConfi = true;
                        }
                    }
                    break;
                case 2:
                    jugar(nomJugador,N);
                    break;
                case 3:
                    sortir = true;
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

    private static void jugar(String nomJugador, Integer N) {
        boolean win = false;
        int nMoviments = 0;

        InicialitzarTaulell();
        while (!win) {
            mostrar();
            Posicio p = seleccionarPosicio();
            activar(taulell, p);
            win = comprovarVictoria(taulell, N);
            nMoviments++;
        }
      System.out.println("Enhorabona, " + nomJugador + ", has guanyat en " + nMoviments + " moviments");
    }

    private static void activar(String[][] taulell, Posicio p) {
        // TODO Auto-generated method stub
        for(int i = p.files-1; i <= p.files+1; i++){
            for(int j = p.columnes-1; j <= p.columnes+1; j++){
                if(!estoyFuerisima(i,j,taulell)){
                    if(taulell[i][j] == " \u2588 "){
                        taulell[i][j] = "   ";
                    } else {
                        taulell[i][j] = " \u2588 ";
                    }
                }
            }

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

        return false;
    }

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

    private static void mostrar() {
        // TODO Auto-generated method stub
        for(int i = 0; i < taulell.length; i++){
            for(int j = 0; j < taulell[0].length; j++){
                System.out.print(taulell[i][j]);
            }
            System.out.println();
        }
    }

    private static void InicialitzarTaulell() {
        // TODO Auto-generated method stub
        Random rand = new Random();
        int numRand = 0;
        for(int i = 0; i < taulell.length; i++){
            for(int j = 0; j < taulell[0].length; j++){
                numRand = rand.nextInt(0,101);
                if(numRand < 50) {
                    taulell[i][j] = " \u2588 ";
                } else {
                    taulell[i][j] = "   ";
                }
            }
        }
    }

}
