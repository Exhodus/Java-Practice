package EjerciciosMouredev;

/*
 * Escribe una función que calcule y retorne el factorial de un número dado
 * de forma recursiva.
 */

import java.util.Scanner;

public class FactorialRecursivo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextInt();
        num = factorial(num);
        System.out.println(num);
    }

    private static long factorial(long num) {
        if(num <= 1){
            return 1;
        } else {
            return factorial(num -1 )* num;
        }
    }
}
