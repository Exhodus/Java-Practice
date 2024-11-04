package Joel;

import java.util.Scanner;

public class Broxah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int[] entrades = new int[6];
        int broxa = 0, enemic = 0;

        for(int i = 0; i < casos; i++){

            for(int j = 0; j < entrades.length; j++){
                entrades[j] = scan.nextInt();
            }

            broxa += entrades[0] * 90;
            broxa += entrades[1] * 300;
            broxa += entrades[2] * 250;
            enemic += entrades[3] * 90;
            enemic += entrades[4] * 300;
            enemic += entrades[5] * 250;

            if(broxa > enemic){
                System.out.println("TY MR.BROXAH");
            } else {
                System.out.println("IN REKKLES WE TRUST... NVM");
            }

            broxa = 0;
            enemic = 0;
        }

    }
}
