package EjerciciosMouredev;

/*
 * Crea una función que reciba un String de cualquier tipo y se encargue de
 * poner en mayúscula la primera letra de cada palabra.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */

import java.util.Scanner;

public class EnMayuscula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder frase = new StringBuilder(scan.nextLine().toLowerCase());
        for(int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            letra -= 32;
            System.out.print(letra);
        }
    }
}
