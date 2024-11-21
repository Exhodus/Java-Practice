package Joel.Strings;

import java.util.Scanner;

public class Jaimito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        String frase;
        scan.nextLine();

        for(int i = 0; i < casos; i++){


            frase = scan.nextLine().toLowerCase();

            if(frase.contains(" hada ") || frase.contains("uwu") || frase.contains("owo") || frase.contains("sacapuntas") ||
            frase.contains("adolfito") || frase.contains("35")){
                System.out.println("Jaime ha recibido un Ban");
            } else {
                System.out.println("No Ban a Jaime");
            }

        }
    }
}
