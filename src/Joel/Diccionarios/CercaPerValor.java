package Joel.Diccionarios;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CercaPerValor {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int casos = scan.nextInt();
        int entrdades;

        for(int i = 0; i < casos; i++){
            entrdades = scan.nextInt();
            scan.nextLine();
            HashMap<String,String> capitals = new HashMap<>();


            for(int j = 0; j < entrdades-1; j++){
                String[] sep = scan.nextLine().split("-");
                capitals.put(sep[0],sep[1]);
            }

            String busqueda = scan.nextLine();
            String key = "";

            System.out.println(capitals);
            System.out.println(capitals.get(busqueda));
        }
    }
}
