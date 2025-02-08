package EjerciciosGPT.MagiaDeMagos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class main {
    //Esta variable la pongo en estático para poder sacar el numero seleccionado de jugador cuando
    //se lanza una maldición y utilizarlo cuando sea su turno. El turno del jugador seleccionado
    //se pasará.
    static int jugSeleccionadoMaldicion = -1;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Jugador[] players = new Jugador[4];
        ArrayList<Integer> mazo = new ArrayList<>(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6));
        Collections.shuffle(mazo);
        init(players, mazo);
        boolean fi = false;
        int turno = 0;

        while (!fi) {
            int cartaSeleccionada = seleccionarCarta(players,turno);
           if (cartaSeleccionada != -1) {
               gestionarCartaLanzada(cartaSeleccionada, players, turno);
               players[turno].hand.remove(cartaSeleccionada);
            }
            robar(mazo,players,turno);
           fi = fiPartida(players, turno);
           if(!fi) {
               turno = cambiarTurno(players, turno);
           }

       }
    }

    private static boolean fiPartida(Jugador[] players, int turno) {
        for(int i = 0; i < players.length; i++){
            if(players[i] != players[turno]){
                if(players[i].alive) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int cambiarTurno(Jugador[] players, int turno) {
        int aux = siguienteVivo(turno,players,jugSeleccionadoMaldicion);
        if (jugSeleccionadoMaldicion == aux) {
            System.out.println("----------------------------");
            System.out.println("Te ha caido una maldición! La maldición te encoje las manos " +
                    "a un tamaño ridículo y no puedes cojer las cartas!");
            System.out.println("           Turno del jugador:     " + siguienteVivo(aux,players,jugSeleccionadoMaldicion));
            jugSeleccionadoMaldicion = -1;
            return siguienteVivo(turno,players,jugSeleccionadoMaldicion);
        } else {
            System.out.println("----------------------------");
            System.out.println("           Turno del jugador:     " + aux);
            return aux;
        }

    }

    private static int siguienteVivo(int turno, Jugador[] players, int jugSeleccionadoMaldicion) {
        for(int i = (turno+1)%4; i < players.length; i++){
            if(players[i].alive){
                return i;
            } else if (i == 3 && !players[i].alive){
                i = 0;
            }
        }
        return 0;
    }

    private static void robar(ArrayList<Integer> mazo, Jugador[] players, int turno) {
        if(mazo.size() > 0){
            players[turno].hand.add(mazo.get(0));
            mazo.remove(0);
        }
    }

    private static void gestionarCartaLanzada(int cartaSeleccionada, Jugador[] players, int turno) {
        if(players[turno].hand.get(cartaSeleccionada) == 5){
            System.out.println("Selecciona a qué jugador quieres lanzarle la maldición: [0-3]");
            System.out.println("Recuerda, tu numero de jugador es "+turno+". Escoje uno diferente!");
             jugSeleccionadoMaldicion = scan.nextInt();
            System.out.println("Estupendo, el jugador "+players[jugSeleccionadoMaldicion].name+" no jugará la siguiente ronda.");
        } else if (players[turno].hand.get(cartaSeleccionada) == 6){
            for(int i = 0; i < players.length; i++){
                if(players[i] != players[turno]){
                    if(players[i].hand.contains(7)){
                        players[i].hand.remove(players[i].hand.indexOf(7));
                        System.out.println("El jugador "+ players[i].name+
                                " Se ha salvado gracias a la carta de defensa!");
                        System.out.println("La carta de defensa del jugador "+players[i].name+
                                " ha sido destruida.");
                    } else {
                        players[i].alive = false;
                        players[i].vida = 0;
                    }
                }
            }
        } else if (players[turno].hand.get(cartaSeleccionada) == 7){
            System.out.println("No puedes jugar una carta de defensa! Se pasará el turno.");
        } else {
            int jugSeleccionadoDaño = 0;
            System.out.println("Selecciona el jugador al que vas a atacar: [0-3]");
            System.out.println("Recuerda, tu numero de jugador es "+turno+". Escoje uno diferente!");
            for(int i = 0; i < players.length; i++){
                if(players[i] != players[turno] && players[i].alive){
                    System.out.println(players[i].name + ": "+ players[i].vida+"hp");
                }
            }
            System.out.print("Jugador: ");
            jugSeleccionadoDaño = scan.nextInt();
            players[jugSeleccionadoDaño].vida -= players[turno].hand.get(cartaSeleccionada);
            if(players[jugSeleccionadoDaño].vida <= 0){
                players[jugSeleccionadoDaño].alive = false;
                scan.nextLine();
                System.out.println("El jugador "+players[jugSeleccionadoDaño].name+" ha muerto!");
                System.out.println("Apreta intro para continuar! ");
                scan.nextLine();
            }
        }

        System.out.println("Jugadores vivos: ");
        if(players[0].alive){
            System.out.println(players[0].name);
        }
        if(players[1].alive){
            System.out.println(players[1].name);
        }
        if(players[2].alive){
            System.out.println(players[2].name);
        }
        if(players[3].alive){
            System.out.println(players[3].name);
        }

    }

    private static int seleccionarCarta(Jugador[] players, int turno) {
        System.out.println("SELECCIONA UNA CARTA PARA JUGAR: ");
        System.out.println("---------------------------------");
        System.out.println("| "+players[turno].hand+"|");
        System.out.println("---------------------------------");
        int carta = scan.nextInt();
        int cartaSeleccionada = players[turno].hand.indexOf(carta);
        return cartaSeleccionada;
    }

    private static void init(Jugador[] players, ArrayList<Integer> mazo) {
        for(int i = 0; i < players.length; i++){
            players[i] = new Jugador();
            players[i].name = "jugador "+i;
            int cont = 0;
            while (mazo.size() > 1 && cont < 5){
                players[i].hand.add(mazo.get(0));
                mazo.remove(0);
                cont++;
            }
            players[i].hand.add(7);
        }
    }
}
