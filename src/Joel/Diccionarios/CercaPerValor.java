package Joel.Diccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CercaPerValor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas;

        TreeMap<String,String> capitals = new TreeMap<>();

        for(int k = 0; k < casos; k++){

            entradas = scan.nextInt();
            scan.nextLine();

            for(int i = 0; i < entradas-1; i++){
                String[] frase = scan.nextLine().split("-");
                capitals.put(frase[0],frase[1]);
            }

            String buscador = scan.nextLine();
            String key = "";

            for(Map.Entry<String,String> entry : capitals.entrySet()){
                if(entry.getValue().equals(buscador)){
                    key = entry.getKey();
                }
            }

            System.out.println(capitals);
            System.out.println(key);
            capitals.clear();
        }
    }
}
