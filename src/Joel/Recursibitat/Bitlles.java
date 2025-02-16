package Joel.Recursibitat;

import java.util.Scanner;

public class Bitlles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();

        for(int i = 0; i < casos; i++){
            int num = scan.nextInt();

            System.out.println(factorial(num));
        }
    }

    private static int factorial(int num) {

        if(num == 0){
            return 0;
        } else {
            return num+(factorial(num-1));
        }
    }
}
