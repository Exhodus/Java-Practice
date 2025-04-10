package Joel;

import java.util.HashMap;
import java.util.Scanner;

public class AgullesAmagades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < casos; i++){
            String[] entrada = scan.nextLine().split(":");
            int hora = Integer.parseInt(entrada[0]);
            int min = Integer.parseInt(entrada[1]);

            if(hora >= 12){
                hora %= 12;
            }

            min = min/5;

            if(hora == min){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
