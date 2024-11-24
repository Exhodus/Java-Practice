package EjerciciosGPT;

import java.util.Scanner;

public class Combinar2Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] salida = new int[5];

        System.out.println("Introduce 2 arrays de 5 numeros: ");
        System.out.println("Primer array: ");
        for(int i = 0; i < array1.length; i++){
            array1[i] = scan.nextInt();
        }

        System.out.println("Segundo array: ");
        for(int i = 0; i < array2.length; i++){
            array2[i] = scan.nextInt();
        }

        for(int i = 0; i < array1.length; i++){
            salida[i] = array1[i] + array2[i];
        }

        for(int i = 0; i < salida.length; i++){
            System.out.print(salida[i]+" ");
        }
    }
}
