package Joel.Diccionarios;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class EscriuEnUnDiccionari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entrades = scan.nextInt();
        scan.nextLine();
        LinkedHashMap<String, String> cumples = new LinkedHashMap<>();

        for(int i = 0; i < entrades ;i++){
            cumples.put(scan.nextLine(),scan.nextLine());
        }


        String key = scan.nextLine();

        System.out.println(cumples);
        System.out.println(cumples.get(key));

    }
}
