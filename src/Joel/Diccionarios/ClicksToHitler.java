package Joel.Diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class ClicksToHitler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas;
        boolean imposible = false;
        int cont = 1;

        HashMap<String,String> pages = new HashMap<>();

        for(int i = 0; i < casos; i++){
            entradas = scan.nextInt();
            scan.nextLine();

            for(int j = 0; j < entradas; j++){
                String[] paginas = scan.nextLine().split("->");
                pages.put(paginas[0],paginas[1]);
            }

            String salida = scan.nextLine();

            String key = pages.get(salida);
            String value = "";

            while (!key.equals("HITLER") && !imposible ){

                if(pages.containsKey(key)){
                    value = pages.get(key);
                    cont++;
                    key = value;
                } else {
                    imposible= true;
                }
            }

            if(imposible){
                System.out.println("IMPOSSIBLE");
            } else {
                System.out.println(cont);
            }

            cont = 0;
            imposible = false;
            pages.clear();
        }
    }
}
