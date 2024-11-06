package Joel.Arrays;

import java.util.*;

public class LaGrossa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int calers;
        int entrades;
        int cont = 0;
        List<Integer> listCalers = new ArrayList<Integer>();

        for(int j = 0; j < casos; j++) {
            calers = scan.nextInt();
            entrades = scan.nextInt();
            while (entrades != 0) {
                listCalers.add(entrades);
                entrades = scan.nextInt();
            }

            Collections.sort(listCalers);

            for (int i = 0; i < listCalers.size(); i++) {
                if (calers > 0) {
                    calers -= listCalers.get(i);
                    if (calers >= 0) {
                        cont++;
                    }
                }
            }

            System.out.println(cont);
            cont = 0;
            listCalers.clear();
        }
    }
}
