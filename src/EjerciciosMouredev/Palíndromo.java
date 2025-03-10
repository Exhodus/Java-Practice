package EjerciciosMouredev;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
 * Escribe una función que reciba un texto y retorne verdadero o
 * falso (Boolean) según sean o no palíndromos.
 * Un Palíndromo es una palabra o expresión que es igual si se lee
 * de izquierda a derecha que de derecha a izquierda.
 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
 * Ejemplo: Ana lleva al oso la avellana.
 */
public class Palíndromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine().toLowerCase();
        if(isPalindromo(frase)){
            System.out.println("ES UN PALINDROMO".toLowerCase());
        } else {
            System.out.println("NO ES UN PALINDROMO".toLowerCase());
        }

    }

    private static boolean isPalindromo(String frase) {
            String palindromo = "";
            for(int i = 0; i < frase.length(); i++){
                if( frase.charAt(i) != ' '){
                    palindromo += frase.charAt(i);
                }
            }

            boolean flag = false;
            for (int i = 0; i < palindromo.length(); i++){
                if(i < ((palindromo.length()-1) - i)) {
                    if (palindromo.charAt(i) != palindromo.charAt((palindromo.length() - 1) - i)) {
                        flag = true;
                    }
                }
            }

            if(flag){
                return false;
            }
            return true;

    }
}
