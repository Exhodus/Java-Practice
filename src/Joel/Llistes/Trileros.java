package Joel.Llistes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Trileros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entrades = scan.nextInt();
        ArrayList<Integer> cubells = new ArrayList<>(entrades);

        for(int i = 0; i < entrades; i++){
            if(i < entrades-1){
                cubells.add(0);
            } else {
                cubells.add(1);
            }
        }

        int[] canvis = new int[2];
        canvis[0] = scan.nextInt();
        canvis[1] = scan.nextInt();

        while (canvis[0] != -1 && canvis[1] != -1){

            Collections.swap(cubells, canvis[0], canvis[1]);

            canvis[0] = scan.nextInt();
            canvis[1] = scan.nextInt();
        }

        System.out.println(cubells);
        for(int j = 0; j < cubells.size(); j++){
            if(cubells.get(j) == 1){
                System.out.println(j);
            }
        }
    }
}
