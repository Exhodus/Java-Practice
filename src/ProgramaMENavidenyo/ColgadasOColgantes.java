package ProgramaMENavidenyo;

import java.util.Locale;
import java.util.Scanner;

public class ColgadasOColgantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String palabra;

        for(int i = 0; i < casos; i++){
            palabra = scan.nextLine().toLowerCase();
            if(palabra.equals("colgadas")){
                System.out.println("Bien");
            } else {
                System.out.println("Mal");
            }
        }
    }
}
