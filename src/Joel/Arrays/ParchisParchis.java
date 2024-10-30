package Joel.Arrays;

import java.util.Scanner;

public class ParchisParchis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int[] nums = new int[4];
        int acc = 0,accDiff = 0;

        for(int i = 0; i < casos; i++){
            for(int j = 0; j < nums.length;j++){
                nums[j] = scan.nextInt();
            }

            for(int j =0 ; j < nums.length; j++){
                acc +=nums[j];
                if(acc > 8){
                    accDiff = acc-8;
                    acc = 8;
                    acc -= accDiff;
                } else if( acc == 8){
                    break;
                }
            }

            System.out.println(acc);
            acc = 0;
        }
    }
}
