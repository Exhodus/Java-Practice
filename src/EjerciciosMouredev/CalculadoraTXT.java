package EjerciciosMouredev;

/*
 * Lee el fichero "Challenge21.txt" incluido en el proyecto, calcula su
 * resultado e imprímelo.
 * - El .txt se corresponde con las entradas de una calculadora.
 * - Cada línea tendrá un número o una operación representada por un
 *   símbolo (alternando ambos).
 * - Soporta números enteros y decimales.
 * - Soporta las operaciones suma "+", resta "-", multiplicación "*"
 *   y división "/".
 * - El resultado se muestra al finalizar la lectura de la última
 *   línea (si el .txt es correcto).
 * - Si el formato del .txt no es correcto, se indicará que no se han
 *   podido resolver las operaciones.
 */

import java.io.*;
import java.util.Scanner;

public class CalculadoraTXT {
    public static void main(String[] args) throws IOException {

        System.out.println(calculo());
    }

    private static double calculo() throws IOException {
        double resultado = 0;

        File f = new File("src/EjerciciosMouredev/Challenge22.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        double num1 = 0;
        double num2 = 0;

        boolean suma = false;
        boolean resta = false;
        boolean mult = false;
        boolean div = false;

        while(br.ready()){
            String line = br.readLine();
            switch (line){
                case "+":
                    suma = true;
                    break;
                case "-":
                    resta = true;
                    break;
                case "*":
                    mult = true;
                    break;
                case "/":
                    div = true;
                    break;
                default:
                    if(num1 == 0){
                        num1 = Integer.parseInt(line);
                    } else {
                        num2 = Integer.parseInt(line);
                    }
            }

            if(suma && num2 != 0){
                num1 += num2;
                suma = false;
                num2 = 0;
            } else if (resta && num2 != 0){
                num1 -= num2;
                resta = false;
                num2 = 0;
            } else if (mult && num2 != 0){
                num1 *= num2;
                mult = false;
                num2 = 0;
            } else if (div && num2 != 0){
                num1 /= num2;
                div = false;
                num2 = 0;
            }


        }

        br.close();
        fr.close();
        return num1;
    }
}
