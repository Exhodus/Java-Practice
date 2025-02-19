package EjerciciosMouredev;

/*
 * Crea un programa se encargue de transformar un número
 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
 */

import java.util.Scanner;

public class DecimalABinario {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int acc = 0;
        int decimal = scan.nextInt();
        String binario = "";

        while (decimal >= 2){
            binario += ""+(decimal%2);
            decimal /=2;
        }

        binario += decimal;

        StringBuilder resultado = new StringBuilder(binario);

        resultado.reverse();

        System.out.println(resultado);
    }
}
