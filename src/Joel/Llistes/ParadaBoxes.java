package Joel.Llistes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ParadaBoxes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas;
        ArrayList<String> pilots = new ArrayList<>();

        for(int i = 0; i < casos; i++){

            entradas = scan.nextInt();
            scan.nextLine();
            for(int j = 0; j < entradas; j++){
                pilots.add(scan.next());
            }

            for(int j = 0; j < pilots.size(); j++){

                int posició = scan.nextInt();
                Collections.swap(pilots, j, posició);
            }

            System.out.println(pilots);
            pilots.clear();
        }
    }
}
