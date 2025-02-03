package ExamenProbaFuncionsRecursivitat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExplodingKittens {
    static Scanner scan = new Scanner(System.in);
    public static ArrayList<Integer> baralla = new ArrayList<Integer>(
            Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 11, 11, 11, 11, 12, 12, 12, 12, 15, 15));
    //Faig aquesta variable en static per tal de poder anar guardant les cartes a mesura que canvien les rondes.
    static int cartaAnterior = 0;
    public static void main(String[] args) {
        int torn = 0;
        ArrayList<Integer> usades =  new ArrayList<Integer>();
        Jugador[] jugadors = new Jugador[4];
        Collections.shuffle(baralla);
        init(jugadors,baralla);
        baralla.add(14);
        baralla.add(14);
        baralla.add(14);
        Collections.shuffle(baralla);
        boolean fi = false;
        while (!fi) {
            int[] cartaDoble = new int[2];

            int cartaSeleccionada = SeleccionarCarta(torn, jugadors);
            if (cartaSeleccionada == -1){
                System.out.println("OJO! No has seleccionat cap carta disponible. Aixó vol dir que passes el torn");
                System.out.println("Si estas segur, torna a seleccionar la mateixa.");
                System.out.println("Si pel contrari volies jugar una carta de la ma");
                System.out.println("Torna a seleccionar-la:");
                cartaSeleccionada = SeleccionarCarta(torn, jugadors);
                if (cartaSeleccionada != -1) {
                    GestionarCartaTirada(cartaSeleccionada,jugadors, torn);
                    esborrarCarta(jugadors,torn, cartaSeleccionada);
                    System.out.println(jugadors[torn].ma);
                }
            }
            System.out.println(jugadors[torn].ma);
            boolean isKitten = robar(torn, jugadors);
            if(isKitten){
                explota(jugadors, torn);
                scan.nextLine();
                scan.nextLine();
            }
            torn = canviTorn(jugadors,torn);
            fi = fiPartida(jugadors);
        }
    }

    private static void esborrarCarta(Jugador[] jugadors, int torn, int cartaSeleccionada) {
        jugadors[torn].ma.remove(cartaSeleccionada);
    }

    private static void explota(Jugador[] jugadors, int torn) {

        if(jugadors[torn].ma.contains(15)){
            System.out.println("T'has salvar pels pels! tenias una carta de desactivació. Vigila quins gats toques la próxima vegada.");
            System.out.println("No tots els gats son amigables. I menys si tenen c4 enganxat al cos.");
        } else {
            jugadors[torn].viu = false;
            System.out.println("El jugador " + jugadors[torn].nom + " Ha explotat entre terrible sufriment. El pobre tenia familia.");
            System.out.println("Apreta intro per continuar.");
        }
    }

    private static boolean robar(int torn, Jugador[] jugadors) {
        boolean gatete = false;
        jugadors[torn].ma.add(baralla.get(0));

        if(baralla.get(0) == 14){
            gatete = true;
        }
        baralla.remove(0);
        return gatete;
    }

    private static void GestionarCartaTirada(int cartaSeleccionada, Jugador[] jugadors, int torn) {
        if(cartaSeleccionada == 11){
            Collections.shuffle(baralla);
        } else if (cartaSeleccionada == 12) {
            System.out.print(baralla.get(0));
            System.out.print(baralla.get(1));
            System.out.println(baralla.get(2));
        }
    }

    private static void seleccionarCartaARobar(Jugador[] jugadors, int numaux, int torn) {
        if(numaux != torn){
            System.out.println("La ma del jugador "+ jugadors[numaux].nom+": "+jugadors[numaux].ma);
            System.out.println("Selecciona la carta a robar: ");
            int aux = scan.nextInt();
            jugadors[torn].ma.add(jugadors[numaux].ma.indexOf(aux));
            jugadors[numaux].ma.remove(jugadors[numaux].ma.indexOf(aux));
        }
    }

    private static int seleccionarJugadorARobar(Jugador[] jugadors, int torn){
        System.out.println("Selecciona el jugador a qui li vols robar: [del 0 al 4]");
        int jug = scan.nextInt();
        if(jug != torn){
            return jug;
        } else {
            System.out.println("Epa! vigila que t'has seleccionat a tu mateix! Per llest ara et quedes sense robar.");
        }
        return jug;
    }

    private static int canviTorn(Jugador[] jugadors,int torn) {
        if(torn == 0){
            if(jugadors[1].viu){
                return 1;
            } else if (jugadors[2].viu){
                return 2;
            } else if (jugadors[3].viu){
                return 3;
            }
        } else if (torn == 1){
            if(jugadors[2].viu){
                return 2;
            } else if (jugadors[3].viu){
                return 3;
            } else if (jugadors[0].viu){
                return 0;
            }
        } else if (torn == 2){
            if(jugadors[3].viu){
                return 3;
            } else if (jugadors[0].viu){
                return 0;
            } else if (jugadors[1].viu){
                return 1;
            }
        } else if (torn == 3){
            if(jugadors[0].viu){
                return 0;
            } else if (jugadors[1].viu){
                return 1;
            } else if (jugadors[2].viu){
                return 2;
            }
        }
        return 0;
    }

    private static int SeleccionarCarta(int torn, Jugador[] jugadors) {
        System.out.println("Es el teu torn "+jugadors[torn].nom);
        System.out.println("Escull una de las teves cartes: ");
        System.out.println(jugadors[torn].ma);
        int numCarta = scan.nextInt();
        System.out.println(numCarta);
       int indexCarta = jugadors[torn].ma.indexOf(numCarta);
        System.out.println(indexCarta);
        System.out.println(jugadors[torn].ma.get(indexCarta));
        return -1;

    }

    private static boolean fiPartida(Jugador[] jugadors) {
        int cont = 0;
        for(int i = 0; i < jugadors.length; i++){
            if(!jugadors[i].viu){
                cont++;
            }
        }
        if(cont == 3){
            return true;
        }
        return false;
    }

    private static void init(Jugador[] jugadors, ArrayList<Integer> baralla) {
        for(int i = 0; i < jugadors.length; i++){
            jugadors[i] = new Jugador();
            jugadors[i].nom = "Jugador "+i;
            for(int j = 0; j < 5; j++){
                jugadors[i].ma.add(baralla.get(j));
                baralla.remove(j);
            }
            jugadors[i].ma.add(15);
        }
    }
}

