package Joel.Recursibitat;

import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num =  scan.nextInt();
        int base = 1;
        if(recursividadPrimo(num, base)){
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }

    private static boolean recursividadPrimo(int num, int base) {
        if(base >= num) {
            return true;
        }
        if(num % base == 0) {
            return false;
        }
        return recursividadPrimo(num, base + 1);
    }
}
