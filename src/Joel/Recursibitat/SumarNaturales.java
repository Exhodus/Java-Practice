package Joel.Recursibitat;

import java.util.Scanner;

public class SumarNaturales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero para sumarle sus numeros naturales:");
        int num = scan.nextInt();

        System.out.println("El resultado es: "+sumar(num));
    }

    private static int sumar(int num) {
        if(num == 0){
            return 0;
        } else {
            return num + sumar(num-1);
        }
    }
}
