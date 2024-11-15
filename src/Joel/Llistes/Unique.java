package Joel.Llistes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> llista = new ArrayList<>();

        int casos = scan.nextInt();
        int entrades;

        for(int i = 0; i < casos; i++){

            entrades = scan.nextInt();
            scan.nextLine();

            for(int j = 0; j < entrades; j++){
                llista.add(scan.nextLine());
            }

            Set<String> fi = new HashSet<>(llista);

            System.out.println(fi);

            llista.clear();
            fi.clear();

        }
    }
}
