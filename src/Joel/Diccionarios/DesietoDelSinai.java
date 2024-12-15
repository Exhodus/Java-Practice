package Joel.Diccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesietoDelSinai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas;

        for(int i = 0; i < casos; i++){

            entradas = scan.nextInt();
            scan.nextLine();
            HashMap<String,Integer> mapes = new HashMap<>();
            int cont = 0;

            for(int j = 0; j < entradas; j++){
                String key = scan.nextLine();

                if(mapes.containsKey(key)){
                    mapes.put(key,cont+1);
                    cont++;
                } else {
                    mapes.put(key,0);
                }
            }

            int gran = 0;
            String mesGran = "";

            for(Map.Entry<String,Integer> entry : mapes.entrySet()){
                if(entry.getValue() > gran || gran == 0){
                    mesGran = entry.getKey();
                    gran = entry.getValue();
                }
            }

            System.out.println(mesGran);




        }
    }
}
