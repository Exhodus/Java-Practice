package EjerciciosMouredev;

/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

import java.util.Scanner;

public class RevertirCadenas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder cadena1 = new StringBuilder(scan.nextLine());
        StringBuilder cadena2 = new StringBuilder();

        for(int i = 0; i < cadena1.length(); i++){
            cadena2.insert(i,cadena1.charAt((cadena1.length()-1)-i)) ;
        }

        System.out.println(cadena2);
    }
}
