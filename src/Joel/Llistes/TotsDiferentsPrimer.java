package Joel.Llistes;

import java.util.Scanner;

public class TotsDiferentsPrimer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas;
        boolean ojo = false;

        for(int i = 0; i < casos; i++){

            entradas = scan.nextInt();
            int[] lista1 = new int[entradas];
            int[] lista2 = new int[entradas];

            for(int j = 0; j < lista1.length; j++){
                lista1[j] = scan.nextInt();
            }

            for(int j = 0; j < lista2.length; j++){
                lista2[j] = scan.nextInt();
            }

            for(int j = 0; j < lista2.length; j++){
                if(lista1[j] == lista2[j]){
                    ojo = true;
                }
            }

            if(ojo){
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }

            ojo = false;
        }
    }
}
