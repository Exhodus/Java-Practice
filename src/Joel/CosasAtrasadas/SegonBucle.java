package Joel.CosasAtrasadas;

import java.util.Scanner;

public class SegonBucle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas, suma;

        for(int i = 0; i < casos; i++){
            entradas = scan.nextInt();
            for(int j = 0; j < entradas; j++){
                suma = scan.nextInt();
                System.out.println(suma+1);
            }
        }
    }
}
