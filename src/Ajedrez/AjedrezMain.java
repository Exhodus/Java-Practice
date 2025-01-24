package Ajedrez;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AjedrezMain {
    //Tablero
    //Jugadores
    //piezas (piezas)

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Peon> peonesBlancos = new ArrayList<>();
    static ArrayList<Peon> peonesNegros = new ArrayList<>();
    static ArrayList<Torre> torresBlancas = new ArrayList<>();
    static ArrayList<Torre> torresNegras = new ArrayList<>();
    static Caballo caballoBlanco = new Caballo();
    static Caballo caballoNegro = new Caballo();
    static Alfil alfilBlanco = new Alfil();
    static Alfil alfilNegro = new Alfil();
    static Reina reinaBlanca = new Reina();
    static Reina reinaNegra = new Reina();
    static Rey reyBlanco = new Rey();
    static Rey reyNegro = new Rey();


    public static void main(String[] args) {

        String[][] tablero = new String[18][18];

        //menú



        delimitarTablero(tablero);
        guiasTablero(tablero);
        colocarPiezas(tablero);
        printarTablero(tablero);
    }

    private static void colocarPiezas(String[][] tablero) {
        declararPeones();
        colocarPeones(tablero);
        declararTorres();
        colocarTorres(tablero);
        colocarCaballos(tablero);
        colocarAlfil(tablero);
        colocarReyes(tablero);
    }

    private static void declararTorres() {
        for(int i = 0; i < 2; i++){
            torresBlancas.add(new Torre());
            torresBlancas.get(i).id = i+1;
            torresBlancas.get(i).nombre = "\u265C";

            torresNegras.add(new Torre());
            torresNegras.get(i).id = i+1;
            torresNegras.get(i).nombre = "\u2656";
        }
    }

    private static void declararPeones() {
        for(int i = 0; i < 8; i++){
            peonesBlancos.add(new Peon());
            peonesBlancos.get(i).id = i+1;
            peonesBlancos.get(i).nombre = "\u265F";

            peonesNegros.add(new Peon());
            peonesNegros.get(i).id = i+1;
            peonesNegros.get(i).nombre = "\u2659";
        }
    }

    private static void colocarReyes(String[][] tablero) {
        reinaNegra.nombre = "\u2655";
        reinaBlanca.nombre = "\u265B";
        reyNegro.nombre = "\u2654";
        reyBlanco.nombre ="\u265A";
        tablero[1][8] = reinaNegra.nombre;
        tablero[1][10] = reyNegro.nombre;
        tablero[15][8] = reinaBlanca.nombre;
        tablero[15][10] = reyBlanco.nombre;
    }

    private static void colocarAlfil(String[][] tablero) {
        alfilNegro.nombre = "\u2657";
        alfilBlanco.nombre = "\u265D";

        tablero[1][6] = alfilNegro.nombre;
        tablero[1][12] = alfilNegro.nombre;
        tablero[15][6] = alfilBlanco.nombre;
        tablero[15][12] = alfilBlanco.nombre;
    }

    private static void colocarCaballos(String[][] tablero) {
        caballoNegro.nombre = "\u2658";
        caballoBlanco.nombre = "\u265E";

        tablero[1][4] = caballoNegro.nombre;
        tablero[1][14] = caballoNegro.nombre;
        tablero[15][4] = caballoBlanco.nombre;
        tablero[15][14] = caballoBlanco.nombre;
    }

    private static void colocarTorres(String[][] tablero) {

        tablero[1][2] = torresNegras.get(0).nombre;
        tablero[1][16] = torresNegras.get(1).nombre;
        tablero[15][2] = torresBlancas.get(0).nombre;
        tablero[15][16] = torresBlancas.get(1).nombre;

    }

    private static void colocarPeones(String[][] tablero) {

        int cont = 0;

        for (int j = 2; j < tablero[0].length; j+=2) {
            tablero[13][j] = peonesBlancos.get(cont).nombre;
            tablero[3][j] = peonesNegros.get(cont).nombre;
            cont++;
        }
    }

    private static void guiasTablero(String[][] tablero) {
        String[] letras = {"A","B","C","D","E","F","G","H"};
        int cont = 7;


        for(int i = 1; i < tablero.length-2; i+=2){
            if(i == 0){
                tablero[i][0] = "";
            } else if(i%2 == 1 ){
                tablero[i][0] = letras[cont];
                cont--;
            }
        }

        cont = 1;
        for(int j = 0; j < tablero[0].length; j+=2){
            if(j != 0 && j%2 == 0) {
                tablero[tablero.length - 1][j] = " "+cont;
                cont++;
            }
        }
    }

    private static void printarTablero(String[][] tablero) {
        for(int i = 0 ; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    private static void delimitarTablero(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(i %2 == 1 ) {
                    if (j % 2 == 0) {
                        tablero[i][j] = " ";
                    } else {
                        tablero[i][j] = " | ";
                    }
                } else  if(i%2== 0 && j == tablero[0].length-1){
                    tablero[i][j] = "--------";
                  } else if( i%2== 0 && j >= 3) {
                tablero[i][j] = "--";
              } else {
                    tablero[i][j] = " ";
                }
            }
        }
    }
}
