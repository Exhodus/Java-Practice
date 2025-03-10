package practica;

import java.util.Scanner;

public class ex1IFS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 == 0){
            if(num2 == num3){
                System.out.println("Trio");
            }  else {
                System.out.println("Parella");
            }
        } else if (num2 == 0){
            if(num1 == num3){
                System.out.println("Trio");
            }  else {
                System.out.println("Parella");
            }
        } else if (num3 == 0){
            if(num1 == num2){
                System.out.println("Trio");
            }  else {
                System.out.println("Parella");
            }
        } else {
            if(num1 == num2 && num1 == num3){
                System.out.println("Trio");
            } else if (num1 == num2 || num1 == num3){
                System.out.println("Parella");
            } else if (num2 == num3){
                System.out.println("Parella");
            } else {
                System.out.println("Res");
            }
        }
    }
}
