package EjerciciosGPT.Recursividad;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        if(num == 0){
            return 1;
        } else {
            return num * factorial(num-1);
        }
    }
}
