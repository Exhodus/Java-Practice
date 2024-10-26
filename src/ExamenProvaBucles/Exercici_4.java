package ExamenProvaBucles;

import java.util.Scanner;

public class Exercici_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int senar = 0,parell = 0;

        while (num != -1 && num != 73){

            if(num%2 == 0){
                parell += num;
            } else {
                senar += num;
            }

            num = scan.nextInt();
        }

        if(num == 73){
            System.out.println("MAGIA");
        } else {
            if (parell > senar){
                System.out.println("PARELLS");
            } else {
                System.out.println("SENARS");
            }
        }

    }
}
