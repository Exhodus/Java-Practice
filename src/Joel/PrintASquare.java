package Joel;

import java.util.Scanner;

//Print a square:
//@@@@@@@
//@     @
//@     @
//@@@@@@@
public class PrintASquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.print("@");
        }
        System.out.println();
        for(int i = 1; i < num-1; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == 1 || j == num) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = 1; i <= num; i++){
            System.out.print("@");
        }
    }
}
