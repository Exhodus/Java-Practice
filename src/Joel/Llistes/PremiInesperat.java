package Joel.Llistes;

import java.util.ArrayList;
import java.util.Scanner;

public class PremiInesperat {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int entrades = scan.nextInt(), joana, carlota;
        while (entrades != 0) {

            while (entrades != 0) {
                nums.add(entrades);
                entrades = scan.nextInt();
            }

            joana = scan.nextInt()-1;
            carlota = scan.nextInt()-1;

            if (nums.get(joana) > nums.get(carlota)) {
                System.out.println("JOANA");
            } else {
                System.out.println("CARLOTA");
            }

            nums.clear();

            entrades = scan.nextInt();
        }
    }
}
