package Joel.Llistes;

import java.util.ArrayList;
import java.util.Scanner;

public class TotsDiferents {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas;
        boolean ojo = false;

        for(int i = 0; i < casos; i++){
            entradas = scan.nextInt();
            int[] arr1 = new int[entradas];
            int[] arr2 = new int[entradas];

            for(int j = 0; j < arr1.length; j++){
                arr1[j] = scan.nextInt();
            }

            for(int j = 0; j < arr2.length; j++){
                arr2[j] = scan.nextInt();
            }

            for (int j = 0; j < arr1.length; j++){
                for (int k = 0; k < arr1.length; k++){
                    if(arr1[j] == arr2[k]){
                        ojo = true;
                    }
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
