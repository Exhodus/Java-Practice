package Joel.Recursibitat;

import java.util.Scanner;

public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Calcular el Minimo Comun Divisor.");
        System.out.println("Introduce el primer numero:");
        int num1 = scan.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = scan.nextInt();
        int resultado = mcd(num1,num2);
        System.out.println(resultado);
    }

    private static int mcd(int num1, int num2) {
        if(num2 == 0){
            return num1;
        } else {
            return mcd(num2,(num1 % num2));
        }
    }
}
