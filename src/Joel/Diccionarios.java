package Joel;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionarios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> cosa = new HashMap<>();
        String frase = scan.nextLine();
        String[] capitalYPais = frase.split("-");

        String pais = capitalYPais[0];
        String capital = capitalYPais[1];

        cosa.put(pais,capital);

        System.out.println(cosa);
    }
}
