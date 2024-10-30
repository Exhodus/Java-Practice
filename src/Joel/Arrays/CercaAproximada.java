package Joel.Arrays;

import java.util.Scanner;

public class CercaAproximada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades, numPeu;
        boolean flag = false;

        for(int i = 0; i < casos; i++){
            entrades = scan.nextInt();
            int[] nums = new int[entrades];

            for(int j =0; j < nums.length; j++){
                nums[j] = scan.nextInt();
            }
            numPeu = scan.nextInt();

            for(int j =0; j < nums.length; j++){
                if(nums[j]== numPeu || nums[j] == numPeu+1 || nums[j] == numPeu-1){
                    flag = true;
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
