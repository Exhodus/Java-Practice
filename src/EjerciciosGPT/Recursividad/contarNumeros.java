package EjerciciosGPT.Recursividad;

import java.util.Scanner;



public class contarNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(contar(num));
    }

    private static int contar(int num) {
        if(num / 10 == 0){
            return 1;
        } else {
            return contar(num / 10) +1;
        }
    }
}
