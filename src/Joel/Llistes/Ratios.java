package Joel.Llistes;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Scanner;

public class Ratios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades, index;
        String nom;
        ArrayList<String> noms = new ArrayList<>();


        for(int i = 0; i < casos; i++){
            entrades = scan.nextInt();
            scan.nextLine();
            for(int j = 0; j < entrades; j++){
                nom = scan.next();
                noms.add(nom);
            }

            index = scan.nextInt();
            scan.nextLine();

            for(int j = 0; j < noms.size(); j++){
                if(j != index) {
                    System.out.print(noms.get(j) + " ");
                }
            }

            noms.clear();
        }
    }
}
