package Lliga2425;

import java.util.Arrays;
import java.util.Scanner;

public class EscalaReial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int carta;
        int cont = 0;
        int contReal = 0;
        int[] ma = new int[7];


        for(int i = 0; i <casos; i++){
            for(int j = 0; j < ma.length; j++){
                ma[j] = scan.nextInt();
            }

            Arrays.sort(ma);

            for(int j = 1; j < ma.length; j++){
                if(ma[j]-1 == ma[j-1]){
                    cont++;
                }
            }

            System.out.println(cont);

            if(cont >= 5){
                if(ma[])
            }

        }
    }
}
