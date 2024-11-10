package Lliga2425;

import java.util.Scanner;

public class SJOOITB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String any = scan.nextLine();
        String[] separats = any.split(" - ");

        int anyInici = Integer.parseInt(separats[0]);
        int anyfin = Integer.parseInt(separats[1]);

        if(anyInici >= 1956 && anyInici <1981){
            System.out.println("SJO");
        } else if ( anyInici > 2018){
            System.out.println("ITB");
        } else {
            System.out.println("NO");
        }
    }
}
