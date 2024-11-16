package Joel.Llistes;

import java.util.ArrayList;
import java.util.Scanner;

public class Bassou {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> noms = new ArrayList<>();
        int entrades = scan.nextInt();
        scan.nextLine();
        ArrayList<String> nomsOdi = new ArrayList<>();

        for(int i = 0; i < entrades; i++){
            noms.add(scan.nextLine());

            if(noms.get(i).equals("Bassou")){
                nomsOdi.add(noms.get(i));
            }
        }

        System.out.println(nomsOdi);
    }
}
