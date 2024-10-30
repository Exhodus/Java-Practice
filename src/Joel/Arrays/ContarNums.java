package Joel.Arrays;

import java.util.Scanner;

public class ContarNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades, num, cont = 0;

        for(int i = 0; i < casos; i++){
            entrades = scan.nextInt();
            int[] nombres = new int[entrades];

            for(int j = 0 ; j < nombres.length; j++){
                nombres[j] = scan.nextInt();
            }

            num = scan.nextInt();

            for(int j = 0 ; j < nombres.length; j++){
                if( nombres[j] == num){
                    cont++;
                }
            }

            System.out.println(cont);
            cont = 0;
        }
    }
}
