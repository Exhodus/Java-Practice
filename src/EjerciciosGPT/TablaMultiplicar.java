package EjerciciosGPT;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
