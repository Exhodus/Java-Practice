package Lliga2425;

import java.util.Scanner;

public class MaquinaDelTiempo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int any = scan.nextInt();

        if(any >= 1984){
            System.out.println("Nou Barris");
        } else {
            System.out.println("Sant Andreu");
        }
    }
}
