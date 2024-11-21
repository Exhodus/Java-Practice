package Joel;

import java.util.Scanner;

public class Gankplank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int monedos, empieza;

        for(int i = 0; i < casos; i++){

            monedos = scan.nextInt();
            empieza = scan.nextInt();

            if(monedos % 2 == 0){
                if(empieza == 0){
                    System.out.println("GANGPLANK");
                } else {
                    System.out.println("JO");
                }
            } else if (monedos % 2 == 1 ){
                if(empieza == 1){
                    System.out.println("GANGPLANK");
                } else {
                    System.out.println("JO");
                }
            }


        }
    }
}
