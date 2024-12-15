package Joel.Diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class ElPrimerQueArribiA5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nom = scan.nextLine();
        int valor = 0;
        boolean guanyador = false;
        String victoria = "";
        HashMap<String,Integer> jugadors = new HashMap<>();

        while (!nom.equals("xxx")){

            if(jugadors.containsKey(nom)){
                valor = jugadors.get(nom);
                jugadors.put(nom,valor+1);
                if(jugadors.get(nom) == 4 && !guanyador){
                    victoria = nom;
                    guanyador = true;
                }
            } else {
                jugadors.put(nom,0);
            }

            nom = scan.nextLine();
        }

        if(victoria.isEmpty()){
            System.out.println("NO");
        } else {
            System.out.println(victoria);
        }
    }
}
