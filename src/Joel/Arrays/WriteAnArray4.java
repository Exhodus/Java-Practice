package Joel.Arrays;

import java.util.Scanner;

public class WriteAnArray4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entrades = scan.nextInt();
        int[] nums = new  int[entrades];

        for(int i = 0; i < nums.length; i++){
            nums[i] = scan.nextInt();
        }

        int suma = scan.nextInt();

        for(int i = 0; i < nums.length; i++){
            nums[i] += suma;
            System.out.print(nums[i] + " ");
        }
    }
}
