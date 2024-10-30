package Joel.Arrays;

import java.util.Scanner;

public class EleccionsPatates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        int entrades,gran = 0;

        for(int i = 0; i < casos; i++){
            entrades = scan.nextInt();
            int[] nums = new int[entrades];
            for(int j = 0; j < entrades ;j++){
                nums[j] = scan.nextInt();
            }

            for(int j = 0; j < entrades-1 ;j++){
                if(nums[j]>nums[j+1]){
                    gran = j+1;
                } else if(nums[j+1]>nums[j]) {
                    gran = j+2;
                } else if(nums[j] == nums[j+1] && gran == 0){
                    gran = j+1;
                }
            }
            System.out.println(gran);
        }

    }
}

