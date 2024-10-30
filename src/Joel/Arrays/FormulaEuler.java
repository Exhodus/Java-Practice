package Joel.Arrays;

import java.util.Scanner;

public class FormulaEuler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades,gran = 0,petit = 0, sum;

        for(int i = 0; i < casos; i++){
            entrades = scan.nextInt();
            int[] nums = new int[entrades];
            int[] numSobrants = new int[entrades];
            int loops = entrades/2;

            for (int j = 0; j < nums.length; j++) {
                nums[j] = scan.nextInt();
            }

            for(int h = 0; h < loops; h++) {
                for (int j = 0; j < nums.length; j++) {
                    if ((nums[j] > gran || gran == 0) && nums[j] != 0) {
                        gran = nums[j];
                    }
                    if ((nums[j] < petit || petit == 0) && nums[j] != 0) {
                        petit = nums[j];
                    }
                }

                sum = gran + petit;
                System.out.print(sum + " ");


                for (int j = 0; j < nums.length; j++){
                    if( nums[j] == gran){
                        nums[j] = 0;
                    } else if(nums[j] == petit){
                        nums[j] = 0;
                    }
                }

                gran = 0;
                petit = 0;

            }

            System.out.println();

        }
    }
}
