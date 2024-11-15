package Joel.Llistes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TotsALaDreta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int entrades = scan.nextInt();
        int num;
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 0; i < entrades; i++){
            num = scan.nextInt();
            nums.add(num);
        }

        Collections.rotate(nums,1);

        for(int i = 0; i < nums.size(); i++){
            System.out.print(nums.get(i)+" ");
        }
    }
}
