package EjerciciosMouredev;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean flag = false;
        String palabra1 = scan.nextLine().toUpperCase();
        String palabra2 = scan.nextLine().toUpperCase();

        if(!palabra2.equals(palabra1)){
            if(palabra2.length() == palabra1.length()){
                for(int i = 0; i < palabra2.length(); i++){
                    boolean flagEncontrado = false;
                    for (int j = 0; j < palabra1.length(); j++){
                        if(palabra1.charAt(i) == palabra2.charAt(j)){
                            flagEncontrado = true;
                        }
                    }
                    if(!flagEncontrado){
                        flag = true;
                    }
                }
            }
        }

        if(flag){
            System.out.println("No son anagramas");
        } else {
            System.out.println("Son anagramas");
        }
    }
}
