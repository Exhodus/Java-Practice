package EjerciciosGPT.Recursividad;

import java.util.Scanner;

public class invertirNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(invertir(num,0));
    }

    private static int invertir(int num, int aux) {
        if(num < 10){
            return num;
        } else {
            return invertir(num/10,aux*10+num%10);
        }
    }
}
