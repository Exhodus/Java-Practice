package EjerciciosGPT.Recursividad;

import java.util.Scanner;

public class imprimirInverso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        imprimir(num);
    }

    private static void imprimir(int num) {
        if(num == 0){
            System.out.print(num+" ");
        } else {
            System.out.print(num+" ");
            imprimir(num-1);
        }
    }
}
