package Laberinth;
import java.util.Random;
import java.util.Scanner;

public class Laberinth {
    //Dado que el laberinto es siempre el mismo voy a mantenerlo en estático para poder
    //acceder a él de una forma mas sencilla.
    static int[][] laberinth = new int[5][5];
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        Jugador player = new Jugador();
        posicion p = new posicion();
        String[][] labPlayer = new String[5][5];
        initLaberinth();
        initLabPlayer(labPlayer);
        labPlayer[0][0] = " 0 ";
        boolean comprobarFinal = false;
        while (!comprobarFinal){
            printLaberinth(labPlayer);
            posicion aux = new posicion();
            aux = p;
            p = nuevaPosicion(p);
            actualizarLab(p, labPlayer);
            if(!comprobarPosicion(p)){
                System.out.println("En esa dirección hay una pared! no puedes moverte a través de paredes.");
                System.out.println("Escoje otra dirección.");
                p = aux;
            }

            comprobarFinal = fin(p);
        }

        System.out.println("FELICIDADES! Has conseguido salir del laberinto!");
    }

    private static boolean fin(posicion p) {
        if(p.filas == 4 && p.columnas == 4){
            return true;
        }
        return false;
    }

    private static void actualizarLab(posicion p, String[][] labPlayer) {
        labPlayer[p.filas][p.columnas] = " "+laberinth[p.filas][p.columnas]+" ";
    }

    private static void initLabPlayer(String[][] labPlayer) {
        for(int i = 0; i < labPlayer.length; i++){
            for(int j = 0; j < labPlayer[0].length; j++){
                labPlayer[i][j] = "   ";
            }
        }
    }

    private static boolean comprobarPosicion(posicion p) {
        if(!estoyFuerisima(p) && laberinth[p.filas][p.columnas] == 0){
            return true;
        } else {
            return false;
        }
    }

    private static boolean estoyFuerisima(posicion p) {
        if(p.filas < 0 || p.filas >= laberinth.length || p.columnas < 0 || p.columnas >= laberinth[0].length){
            return true;
        } else{
            return false;
        }
    }

    private static posicion nuevaPosicion(posicion antigua) {
        posicion p = new posicion();
        System.out.println("Dónde te quieres mover? ");
        System.out.println("Izquierda = a \nDerecha = d \nArriba = w \nAbajo = s");
        String direccion = scan.nextLine().toLowerCase();
        switch (direccion){
            case "a":
                p.filas = antigua.filas;
                p.columnas = antigua.columnas-1;
                break;
            case "d":
                p.filas = antigua.filas;
                p.columnas = antigua.columnas+1;
                break;
            case "w":
                p.filas = antigua.filas-1;
                p.columnas = antigua.columnas;
                break;
            case "s":
                p.filas = antigua.filas+1;
                p.columnas = antigua.columnas;
                break;
        }
        return p;
    }

    private static void printLaberinth(String[][] labPlayer) {
        for(int i = 0; i < labPlayer.length; i++){
            for(int j = 0; j < labPlayer[0].length; j++){
                System.out.print(labPlayer[i][j]);;
            }
            System.out.println();
        }
    }

    private static void initLaberinth() {
        for(int i = 0; i < laberinth.length; i++){
            for(int j = 0; j < laberinth[0].length; j++){
                laberinth[i][j] = 0;
            }
        }

        int filas = rand.nextInt(0,5);
        int columnas = rand.nextInt(0,5);

        for(int i = 0; i < 7; i++){
            if((filas != 0 || columnas != 0) && (filas != 4 || columnas != 4)) {
                if (laberinth[filas][columnas] != 1) {
                    laberinth[filas][columnas] = 1;
                }
            } else {
                i--;
            }
            filas = rand.nextInt(0,5);
            columnas = rand.nextInt(0,5);
        }
    }
}
