package ExamenFuncions.Polishaç;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PolishaMain {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<CartaPolilla> baralla = new ArrayList<>();

    public static void main(String[] args) {
        //variables
        JugadorPolilla[] jugador = new JugadorPolilla[4];
        boolean fi = false;
        int torn = 0;
        CartaPolilla cartaAnterior = new CartaPolilla();
        JugadorPolilla guanyador = new JugadorPolilla();

        //funcions pre Inici
        init(jugador);
        Collections.shuffle(baralla);
        repartirCartes(jugador);
        cartaAnterior = baralla.get(0);
        baralla.remove(0);

        while (!fi) {
            System.out.println("Torn del jugador "+jugador[torn].nom);
            System.out.println("Prem enter per continuar");
            scan.nextLine();
            System.out.print("La carta anterior es: "+ cartaAnterior);
            System.out.println();

            if (potTirar(jugador, cartaAnterior, torn)) {
                System.out.println("Quina carta vols utilitzar? ");
                CartaPolilla cartaJugador = escollirCarta(jugador, torn, cartaAnterior);
                eliminarCarta(jugador, torn, cartaJugador);
                aplicarEfecte(cartaJugador, jugador, torn);
                baralla.add(cartaAnterior);
                cartaAnterior = cartaJugador;
            } else {
                mostrarCartes(jugador, torn);
                System.out.println();
                System.out.println("No pots llençar cap carta! Has de robar!");
                robarCarta(jugador, torn);
            }

            if(fiPartida(jugador,torn)) {
                fi =true;
                guanyador = jugador[torn];
            } else {
                torn = canviTorn(torn);
            }
        }

        System.out.println("El guanyador es:  "+guanyador.nom+"!!!!!");
    }

    private static void aplicarEfecte(CartaPolilla cartaJugador, JugadorPolilla[] jugador, int torn) {
        System.out.println();
        System.out.println("HAS TIRAT UNA CARTA "+cartaJugador.tipus);
        if(!cartaJugador.tipus.equals("NEUTRA")){
            if(cartaJugador.tipus.equals("MOSQUIT")){
                System.out.println("Escull 3 cartes per donarli als altres jugadors ");
                for(int i = 0; i < 4; i++){
                    if(!jugador[torn].ma.isEmpty() && i != torn){
                        CartaPolilla carta = escollirTipus(jugador,torn);
                        jugador[i].ma.add(carta);
                        jugador[torn].ma.remove(carta);
                    }
                }
            } else if(cartaJugador.tipus.equals("ARANYA")){
                System.out.println("Escull una carta per donar-li a un altre jugador: ");
                CartaPolilla carta = escollirTipus(jugador,torn);
                System.out.println("Ara escull al jugador: ");
                int indexJugador = escullJugador(jugador,torn);
                intercanviCartes(jugador,torn,indexJugador,carta);
            } else if(cartaJugador.tipus.equals("FORMIGA")){
                System.out.println("La resta de jugadors roba carta!");
                robarFormiga(jugador,torn);
            }
        }
    }

    private static void robarFormiga(JugadorPolilla[] jugador, int torn) {
        for(int i = 0; i < jugador.length; i++){
            if(torn != i && !baralla.isEmpty()){
                jugador[i].ma.add(baralla.get(0));
            }
        }
    }

    private static void intercanviCartes(JugadorPolilla[] jugador, int torn, int indexJugador, CartaPolilla carta) {
        jugador[indexJugador].ma.add(carta);
        jugador[torn].ma.remove(jugador[torn].ma.indexOf(carta));
    }

    private static int escullJugador(JugadorPolilla[] jugador, int torn) {
        System.out.println("JUGADORS: ");
        for(int i = 0; i < jugador.length; i++){
            System.out.print(jugador[i].nom+"   ["+i+"]   ");
        }
        int index = scan.nextInt();
        while (index == torn){
            System.out.println("Has escollit el teu mateix índex. Escull un altre, si us plau: ");
            index = scan.nextInt();
        }
        return index;
    }

    private static CartaPolilla escollirTipus(JugadorPolilla[] jugador, int torn) {
        mostrarCartes(jugador,torn);
        int index = scan.nextInt();
        return jugador[torn].ma.get(index);
    }

    private static CartaPolilla escollirCarta(JugadorPolilla[] jugador, int torn, CartaPolilla cartaAnterior) {
        System.out.println("Escull una de les cartes disponibles: [0-"+(jugador[torn].ma.size()-1)+"]");
        CartaPolilla nova = new CartaPolilla();
        boolean valid = false;
        while (!valid) {
            mostrarCartes(jugador, torn);
            int index = scan.nextInt();
            if (!estoyFuerisima(jugador,torn,index) && esValida(index, jugador, torn,cartaAnterior)) {
                nova = jugador[torn].ma.get(index);
                valid = true;
            } else {
                System.out.println("La carta introduida no es válida. O bé perque está fora de límits o bé\n"+
                        "perque no es jugable. Escull un altre, si us plau:");
            }
        }
        return nova;
    }

    private static boolean estoyFuerisima(JugadorPolilla[] jugador, int torn, int index) {
        if(index < 0 || index > jugador[torn].ma.size()-1 ){
            return true;
        } else {
            return false;
        }
    }

    private static boolean esValida(int index, JugadorPolilla[] jugador, int torn, CartaPolilla cartaAnterior) {
        if(jugador[torn].ma.get(index).numero > cartaAnterior.numero+1 || jugador[torn].ma.get(index).numero < cartaAnterior.numero-1
                || index > jugador[torn].ma.size()-1 || index < 0){
            return false;
        } else {
            return  true;
        }
    }

    private static void mostrarCartes(JugadorPolilla[] jugador, int torn) {
        for(int i = 0; i < jugador[torn].ma.size(); i++){
            System.out.print(jugador[torn].ma.get(i)+"["+i+"]   ");
        }
    }

    private static void eliminarCarta(JugadorPolilla[] jugador, int torn, CartaPolilla cartaJugador) {
        jugador[torn].ma.remove(cartaJugador);
    }

    private static boolean potTirar(JugadorPolilla[] jugador, CartaPolilla cartaAnterior, int torn) {
        for(int i = 0; i < jugador[torn].ma.size(); i++){
            if(!jugador[torn].ma.get(i).tipus.equals("ESCARABAT") && !cartaAnterior.tipus.equals("ESCARABAT")) {
                if (jugador[torn].ma.get(i).numero == cartaAnterior.numero-1 || jugador[torn].ma.get(i).numero == cartaAnterior.numero+1){
                    return true;
                }
            } else if (cartaAnterior.tipus.equals("ESCARABAT")){
                if(jugador[torn].ma.get(i).numero == cartaAnterior.numero || jugador[torn].ma.get(i).tipus.equals("ESCARABAT")){
                    return true;
                }
            } else{
                return true;
            }
        }
        return false;
    }

    private static void robarCarta(JugadorPolilla[] jugador, int torn) {
        jugador[torn].ma.add(baralla.get(0));
        baralla.remove(0);
    }

    private static void repartirCartes(JugadorPolilla[] jugador) {
        for(int i = 0; i < jugador.length; i++){
            for(int j = 0; j < 6; j++){
                jugador[i].ma.add(baralla.get(j));
                baralla.remove(j);
            }
        }
    }

    private static int canviTorn(int torn) {
        return (torn+1)%4;
    }

    private static boolean fiPartida(JugadorPolilla[] jugador, int torn) {
        if(jugador[torn].ma.isEmpty()){
            return true;
        }
        return false;
    }

    private static void init(JugadorPolilla[] jugador) { //la funció init() fa més coses
        inicialitzarBaralla("NEUTRA");
        inicialitzarBaralla("NEUTRA");
        inicialitzarBaralla("MOSQUIT");
        inicialitzarBaralla("ESCARABAT");
        inicialitzarBaralla("ARANYA");
        inicialitzarBaralla("FORMIGA");

        //InicialitzarJugadors
        initJugadors(jugador);
    }

    private static void initJugadors(JugadorPolilla[] jugador) {
        for(int i = 0; i < 4; i++){
            jugador[i] = new JugadorPolilla();
            jugador[i].nom = "Jugador "+i;
        }
    }

    private static void inicialitzarBaralla(String tipus) {
        for (int i = 1; i <= 5; i++) {
            CartaPolilla c = new CartaPolilla();
            c.tipus = tipus;
            c.numero = i;
            baralla.add(c);
        }
    }
}
