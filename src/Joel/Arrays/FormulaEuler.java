package Joel.Arrays;

import java.util.Scanner;

public class FormulaEuler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades,gran = -1,petit = -1, sum;

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
                    if ((nums[j] > gran || gran == -1) && nums[j] != -1) {
                        gran = nums[j];
                    }
                    if ((nums[j] < petit || petit == -1) && nums[j] != -1) {
                        petit = nums[j];
                    }
                }

                sum = gran + petit;
                System.out.print(sum + " ");


                for (int j = 0; j < nums.length; j++){
                    if( nums[j] == gran){
                        nums[j] = -1;
                    } else if(nums[j] == petit){
                        nums[j] = -1;
                    }
                }

                gran = -1;
                petit = -1;

            }

            System.out.println();

        }
    }
}
