package Joel.Recursibitat;

import java.util.Map;
import java.util.Scanner;

public class LaLegoPiramide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();

        for(int i = 0; i < casos; i++){
            int numero = scan.nextInt();

            int resultado = calcular(numero);

            System.out.println(resultado/4);
        }
    }

    private static int calcular(int numero) {
        if(numero == 0){
            return 0;
        } else {
            return (numero*numero)+calcular(numero-1);
        }
    }
}
