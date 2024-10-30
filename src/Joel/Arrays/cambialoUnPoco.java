package Joel.Arrays;

import java.util.Scanner;

public class cambialoUnPoco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades, num1,num2;

        for( int i = 0; i < casos; i++){
            entrades = scan.nextInt();
            int[] nombres = new int[entrades];

            for(int j = 0; j < nombres.length; j++){
                nombres[j] = scan.nextInt();
            }

            num1 = scan.nextInt();
            num2 = scan.nextInt();

            for(int j = 0; j < nombres.length; j++){
                if(nombres[j] == num1){
                    nombres[j] = num2;
                }
                System.out.print(nombres[j]+ " ");
            }
            System.out.println();
        }
    }
}
