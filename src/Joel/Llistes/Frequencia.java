package Joel.Llistes;

import java.util.ArrayList;
import java.util.Scanner;

public class Frequencia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades;
        boolean flag = false;

        for(int i = 0; i < casos; i++){
            entrades = scan.nextInt();
            int[] nums = new int[entrades];

            for(int j = 0; j < nums.length; j++){
                nums[j] = scan.nextInt();
            }

            for(int j = 0; j <nums.length; j++){
                for(int k = j+1; k < nums.length; k++){
                    if(nums[j] == nums[k]){
                        flag = true;
                    }
                }
            }

            if(flag){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            flag = false;
        }
    }
}
