package Joel.Recursibitat;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qué posicion de Fibonacci quieres saber? ");
        int posicion = scan.nextInt();
        if(posicion == 0){
            System.out.println("El numero es: "+0);
        } else {
            System.out.println("El numero es: "+fibonacci(posicion));
        }
    }

    private static int fibonacci(int posicion) {
        if(posicion == 1 || posicion <= 0){
            return 1;
        } else {
            return  fibonacci(posicion-1)+fibonacci(posicion-2);
        }
    }
}
