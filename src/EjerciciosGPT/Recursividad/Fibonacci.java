package EjerciciosGPT.Recursividad;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        for(int i = 0; i < casos; i++ ) {
            long posicion = scan.nextInt();
            System.out.println(fibonacci(posicion));
        }
    }

    private static long fibonacci(long posicion) {
        if(posicion <= -1){
            return -1;
        }
        if (posicion == 0){
            return 0;
        }
        if(posicion == 1){
            return 1;
        } else {
            return fibonacci(posicion-1)+fibonacci(posicion-2);
        }
    }
}
