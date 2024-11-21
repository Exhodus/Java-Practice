package Joel.Arrays;

import java.util.Scanner;

public class CapICua {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder num = new StringBuilder(scan.nextLine());
        String dret = String.valueOf(num);
        String reves = String.valueOf(num.reverse());


        if (reves.equals(dret)){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
