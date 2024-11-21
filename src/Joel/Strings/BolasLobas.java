package Joel.Strings;

import java.util.Scanner;

public class BolasLobas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int indice1,indice2;
        StringBuilder nom;


        for (int i = 0; i < casos; i++){
            scan.nextLine();
            nom = new StringBuilder(scan.nextLine());
            indice1 = scan.nextInt();
            indice2 = scan.nextInt();

            String uno = "";
            uno += nom.charAt(indice1);
            nom.setCharAt(indice1, nom.charAt(indice2));
            nom.setCharAt(indice2,uno.charAt(0));
            System.out.println(nom);
        }
    }
}
