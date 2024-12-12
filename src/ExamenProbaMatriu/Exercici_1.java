package ExamenProbaMatriu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercici_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entradas = scan.nextInt();
        scan.nextLine();
        HashMap<String, Integer> clases = new HashMap<>();
        HashMap<String, Integer> terrorista = new HashMap<>();
        String clase;

        for(int i = 0; i < entradas; i++){
            clase = scan.nextLine();
            String[] separats = clase.split(" ");

            String aula = separats[0];
            int valor = Integer.parseInt(separats[1]);



            if(clases.containsKey(aula)){
                valor += clases.get(aula);
                clases.put(aula,valor);
            } else {
                clases.put(aula,valor);
            }


        }

        for(String k : clases.keySet()){

        }
    }
}
