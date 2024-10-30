package Joel.Arrays;

import java.util.Scanner;

public class OsSHipeo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades,alt = 0,baix = 0;

        for(int i = 0; i < casos; i++){
            entrades = scan.nextInt();
            int[] nums = new int[entrades];

            for(int j =0 ; j < nums.length; j++){
                nums[j] = scan.nextInt();
                if(alt == 0 || nums[j]>alt) {
                    alt = nums[j];
                }
                if(baix == 0 || nums[j] < baix) {
                    baix = nums[j];
                }
            }
            System.out.println(alt-baix);
            alt = 0;
            baix = 0;
        }
    }
}
