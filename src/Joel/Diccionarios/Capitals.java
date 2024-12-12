package Joel.Diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class Capitals {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas;

        for(int i = 0; i < casos; i++){
            entradas = scan.nextInt();
            scan.nextLine();
            HashMap<String,String> capitals = new HashMap<>();

            for(int j = 0; j < entradas-1; j++){
                String entradaString = scan.nextLine();
                String[] separats = entradaString.split("-");

                capitals.put(separats[0],separats[1]);
            }

            String demana = scan.nextLine();
            System.out.println(capitals.getOrDefault(demana,"NO HO SE"));
        }
    }
}
