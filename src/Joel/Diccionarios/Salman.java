package Joel.Diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class Salman {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int casos = scan.nextInt();
        int entrades;

        for(int i = 0; i < casos ; i++){
            entrades = scan.nextInt();
            scan.nextLine();
            HashMap<String, String> amics = new HashMap<>();

            for(int j = 0; j < entrades-1 ; j++){
                String[] separats = scan.nextLine().split(" ");
                if(amics.containsKey(separats[0])){
                    amics.put(separats[0],separats[1]);
                    amics.put(separats[1],separats[0]);
                } else {
                    amics.put(separats[0],separats[1]);
                    amics.put(separats[1],separats[0]);
                }
            }

            String buscador = scan.nextLine();

            System.out.println(amics.get(buscador));
        }
    }
}
