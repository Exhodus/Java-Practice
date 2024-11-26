package Joel.Llistes;

import java.util.ArrayList;
import java.util.Scanner;

public class FeliSergioChen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numAlumn = scan.nextInt();
        ArrayList<String> llista = new ArrayList<>();
        scan.nextLine();

        for(int i = 0; i < numAlumn; i++){
            llista.add(scan.nextLine());
        }

        for(int i = 0; i < llista.size(); i++) {
            if (llista.get(i).equals("C") && llista.get(i - 1).equals("S") && llista.get(i - 2).equals("F")) {
                llista.remove(i);
                llista.remove(i - 1);
                llista.remove(i - 2);
                i = 0;
            }
        }

        System.out.println(llista.size());

    }
}
