package Joel;

import java.util.Scanner;

public class BaladaGangPlank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int monedos, empieza;
            monedos = scan.nextInt();
            empieza = scan.nextInt();

            if(monedos % 4 == 0){
                if(empieza == 0){
                    System.out.println("GANGPLANK");
                } else {
                    System.out.println("JO");
                }
            } else {
                if(empieza == 1){
                    System.out.println("GANGPLANK");
                } else {
                    System.out.println("JO");
                }
            }


    }
}
