package Joel.Arrays;

import java.util.Scanner;

public class MultiplyEverithing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades, mult;

        for (int i = 0; i < casos; i++){
            entrades = scan.nextInt();
            int[] num = new int[entrades];

            for( int j = 0; j < num.length; j++){
                num[j] = scan.nextInt();
            }

            mult = scan.nextInt();

            for(int j = 0; j < num.length; j++){
                num[j] *= mult;
                System.out.print(num[j]+" ");
            }
            System.out.println();
        }
    }
}
