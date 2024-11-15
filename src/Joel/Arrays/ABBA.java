package Joel.Arrays;

import java.util.Scanner;

public class ABBA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String noms;
        String acronim = "";

        for(int i = 0; i < casos; i++){

            noms = scan.nextLine();
            String[] nomSep = noms.split(", ");
            String[] lastNomSep = nomSep[nomSep.length-1].split(" i ");

            for(int j = 0; j < nomSep.length-1; j++){
                acronim += nomSep[j].charAt(0);
            }

            for(int j = 0; j < lastNomSep.length; j++){
                acronim += lastNomSep[j].charAt(0);
            }

            System.out.println(acronim);
            acronim = "";
        }
    }
}
