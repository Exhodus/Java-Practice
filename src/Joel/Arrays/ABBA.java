package Joel.Arrays;

import java.util.Scanner;

public class ABBA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String noms;
        String inicials = "";

        for (int i = 0; i < casos; i++){
            noms = scan.nextLine();
            String[] separats = noms.split(", ");
            String[] ultims = separats[separats.length-1].split(" i ");

            for(int j = 0; j <  separats.length-1; j++){
                inicials += separats[j].charAt(0);
            }
            for(int j = 0; j <  ultims.length; j++){
                if(ultims.length > 2) {
                    if (j % 2 == 0) {
                        inicials += ultims[j].charAt(0);
                    }
                } else {
                    inicials += ultims[j].charAt(0);
                }
            }

            System.out.println(inicials);

            inicials = "";
        }
    }
}
