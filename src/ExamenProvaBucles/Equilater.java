package ExamenProvaBucles;

import java.util.Scanner;

public class Equilater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introdueix un nombre natural més gran que 1: ");
        int num = scan.nextInt();

        for(int i = num; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
