package EjerciciosMouredev;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras
 *        "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo)
 *        o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla)
 *        será correcto y no variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 */
public class CarreraObstaculos {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> pista = new ArrayList<>();
        pista.add("_");
        pista.add("_");
        pista.add("|");
        pista.add("|");
        pista.add("_");
        pista.add("|");

        ArrayList<String> jugador = new ArrayList<>();

        boolean acertado = correr(jugador, pista);

        if(acertado){
            System.out.println("Has acabado bien la carrera!");
        } else {
            System.out.println("Cagaste crak");
        }

    }

    private static boolean correr(ArrayList<String> jugador, ArrayList<String> pista) {
        ArrayList<String> aux = new ArrayList<>();

        for(int j = 0; j < pista.size(); j++){
            aux.add(pista.get(j));
        }

        System.out.println(aux);
        for(int i = 0; i < pista.size(); i++){
            System.out.println("Pista: "+ pista.get(i));
            System.out.println("Que haces? run(r)/jump(j)");
            String entrada = scan.nextLine().toLowerCase();

            if(entrada.equals("r")){
                if(!pista.get(i).equals("_")){
                    pista.set(i,"/");
                }
            } else if(entrada.equals("j")){
                if(!pista.get(i).equals("|")){
                    pista.set(i,"x");
                }
            } else {
                System.out.println("Entrada erronea!");
            }
        }

        System.out.println("Pista al principio de la carrera: "+aux);
        System.out.println("Pista al final de la carrera: "+pista);

        boolean fallo = false;
        for(int i = 0; i < aux.size(); i++){
            for(int j = 0; j < pista.size(); j++){
                if(!aux.get(i).equals(pista.get(i))){
                    fallo = true;
                }
            }
        }

        return !fallo;
    }
}




















