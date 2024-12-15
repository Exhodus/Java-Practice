package Joel.Diccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class estamosTraviesosWebCasteller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas;

        HashMap<String,String> diccionario = new HashMap<>();

        for(int i = 0; i < casos; i++){
            entradas = scan.nextInt();
            scan.nextLine();
            for(int j = 0; j < entradas; j++){
                String[] sep = scan.nextLine().split("-");
                diccionario.put(sep[0],sep[1]);
            }

            String frase = scan.nextLine();
            String[] fraseSep = frase.split(" ");


            for(String s: fraseSep){
                if(diccionario.containsKey(s)){
                    s = diccionario.get(s);
                }
                System.out.print(s+" ");
            }

            diccionario.clear();
        }
    }
}
