package EjerciciosGPT.Recursividad;

import java.util.Scanner;

public class sumarNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(sumar(num));
    }

    private static int sumar(int num) {
        if(num == 0){
            return 0;
        } else {
            return num + sumar(num-1);
        }
    }
}
