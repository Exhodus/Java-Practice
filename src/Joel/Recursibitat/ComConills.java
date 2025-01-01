package Joel.Recursibitat;

import java.util.Scanner;

public class ComConills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int num;

        for(int i = 0; i < casos; i++){
            num = scan.nextInt();
            int resultat = calculFibonacci(num);
            System.out.println(resultat);
        }
    }

    private static int calculFibonacci(int num) {
        int suma = 1;
        int anterior = 1;
        int aux = 0;
        int cont = 1;

        while (suma != num){
            aux = anterior;
            suma += anterior;

        }

        return  suma;
    }
}
