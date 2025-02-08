package Joel.Recursibitat;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero para calcular su factorial: ");
        int num = scan.nextInt();

        System.out.println("El resultado es: "+factorial(num));
    }

    private static int factorial(int num) {
        if(num == 1){
            return 1;
        } else {
            return num*(factorial(num-1));
        }
    }
}
