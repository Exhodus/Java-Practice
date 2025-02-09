package EjerciciosGPT.Recursividad;

import java.util.Scanner;

public class esPrimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(primo(num,num));
    }

    private static boolean primo(int num,int divisor) {
        if(num <= 1){
            return false;
        } else if (divisor == 1){
            return true;
        } else if (num%divisor == 0){
            return false;
        } else {
            return primo(num,divisor-1);
        }
    }
}
