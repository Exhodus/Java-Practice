package Lliga2425;

import java.util.Scanner;

public class SerpMates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int total = (int) Math.pow(num,2)*2;
        int inicio = 0;


        for(int i = 0; i < num; i++){
            if(i%2 == 0) {
                for (int j = 0; j < num; j++) {
                    inicio += 2;
                    System.out.print(inicio + " ");
                }
                System.out.println();
            } else {
                int holder = inicio+(2*num)+2;
                inicio += (2*num);
                for(int j = 0; j < num; j++){
                    holder -= 2;
                    System.out.print(holder + " ");
                }
                System.out.println();
            }
        }
    }
}
