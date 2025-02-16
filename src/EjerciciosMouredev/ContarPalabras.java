package EjerciciosMouredev;

/*
 * Crea un programa que cuente cuantas veces se repite cada palabra
 * y que muestre el recuento final de todas ellas.
 * - Los signos de puntuación no forman parte de la palabra.
 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
 * - No se pueden utilizar funciones propias del lenguaje que
 *   lo resuelvan automáticamente.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();
        String entrada = scan.nextLine().toLowerCase();
        String[] sep = entrada.split(" ");

        for(int i = 0; i < sep.length; i++){
            int cont = 1;
            if(!palabras.contains(sep[i])){
                for(int j = i+1; j < sep.length; j++){
                    if(sep[i].equals(sep[j])){
                        cont++;
                    }
                }
                System.out.println(sep[i] + " " + cont);
                palabras.add(sep[i]);
            }
        }

    }
}
