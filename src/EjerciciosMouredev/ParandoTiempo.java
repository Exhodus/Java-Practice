package EjerciciosMouredev;

import java.io.IOException;
import java.util.Scanner;

/*
 * Crea una función que sume 2 números y retorne su resultado pasados
 * unos segundos.
 * - Recibirá por parámetros los 2 números a sumar y los segundos que
 *   debe tardar en finalizar su ejecución.
 * - Si el lenguaje lo soporta, deberá retornar el resultado de forma
 *   asíncrona, es decir, sin detener la ejecución del programa principal.
 *   Se podría ejecutar varias veces al mismo tiempo.
 */

public class ParandoTiempo {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce 2 numeros para sumarlos:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Introduce cuantos segundos quieres esperar: ");
        int sec = scan.nextInt();

        suma(num1, num2, sec);
    }

    private static void suma(int num1, int num2, int sec) throws InterruptedException {
        Thread.sleep(sec* 1000L);
        System.out.println(num1+num2);
    }
}
