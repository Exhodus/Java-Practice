package Joel.Llistes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TotsMoltALaDreta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades, posicions;

        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 0; i < casos; i++){

            entrades = scan.nextInt();
            for( int j = 0; j < entrades; j++){
                nums.add(scan.nextInt());
            }

            posicions = scan.nextInt();

            Collections.rotate(nums, posicions);

            for(int j = 0; j < nums.size(); j++){
                System.out.print(nums.get(j)+" ");
            }
            System.out.println();
            nums.clear();
        }
    }
}
