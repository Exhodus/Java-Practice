package EjerciciosMouredev;

import java.util.Scanner;

public class MCDMCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = -1;
        int num2 = -1;

        while (num != 0){
            num = scan.nextInt();
            num2 = scan.nextInt();

            if(num < num2){
                System.out.println("Mínimo común múltiplo: "+ calcularMinimoComunMultiplo(num, num2));
                System.out.println("Máximo común divisor: "+ calcularMaximoComunDivisor(num, num2));
            } else {
                System.out.println("Mínimo común múltiplo: "+ calcularMinimoComunMultiplo(num2,num));
                System.out.println("Máximo común divisor: "+ calcularMaximoComunDivisor(num2, num));
            }


        }
    }

    private static int calcularMinimoComunMultiplo(int pequeño, int grande) {
        int resultado = 0;



        return resultado;
    }

    private static int calcularMaximoComunDivisor(int pequeño, int grande) {
        int resultado = 0;
        for(int i = 1; i <= pequeño; i++){
            if(pequeño % i == 0 && grande % i == 0){
                resultado = i;
            }
        }
        return resultado;
    }
}
