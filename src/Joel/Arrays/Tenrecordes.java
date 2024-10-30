package Joel.Arrays;

import java.util.Scanner;

public class Tenrecordes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades,select;

        for(int i = 0; i < casos; i ++){
            entrades = scan.nextInt();
            int[] num = new int[entrades];

            for(int j = 0; j < num.length; j++){
                num[j] = scan.nextInt();
            }
            select = scan.nextInt();

            System.out.println(num[select]);

        }
    }
}
