package EjerciciosMouredev;

import java.util.Random;
import java.util.Scanner;

/*
 * Crea una función que reciba dos array, un booleano y retorne un array.
 * - Si el booleano es verdadero buscará y retornará los elementos comunes
 *   de los dos array.
 * - Si el booleano es falso buscará y retornará los elementos no comunes
 *   de los dos array.
 * - No se pueden utilizar operaciones del lenguaje que
 *   lo resuelvan directamente.
 */

public class Conuntos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[array1.length];
        int[] resultado = new int[array1.length];
        initResultado(resultado);

        //Generar numeros random positivos.

        Random rand = new Random();

        for(int i = 0; i < array1.length; i++){
            int num1 = rand.nextInt(0,11);
            array1[i] = num1;
            int num2 = rand.nextInt(0,11);
            array2[i] = num2;
        }

        soloIguales(resultado, array1, array2);

        printarArrays(array1);
        System.out.println();
        printarArrays(array2);
        System.out.println();
        printarArrays(resultado);

    }

    private static void printarArrays(int[] array1) {
        for(int i = 0; i < array1.length; i++){
            if(array1[i] != -1) {
                System.out.print(array1[i] + " ");
            }
        }
    }

    private static void initResultado(int[] resultado) {
        for(int i = 0; i < resultado.length; i++){
            resultado[i] = -1;
        }
    }

    private static void soloIguales(int[] resultado, int[] array1, int[] array2) {
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j] && comprobarNumero(array1[i], resultado)){
                    introducirNumero(resultado, array1[i]);
                }
            }
        }
    }

    private static void introducirNumero(int[] resultado, int num) {
        for(int i = 0; i < resultado.length; i++){
            if(resultado[i] == -1){
                resultado[i] = num;
                return;
            }
        }
    }

    private static boolean comprobarNumero(int num, int[] resultado) {
        for(int i = 0; i < resultado.length; i++){
            if(resultado[i] == num){
                return false;
            }
        }

        return true;
    }
}
