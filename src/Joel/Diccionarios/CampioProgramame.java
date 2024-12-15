package Joel.Diccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CampioProgramame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas;
        int cont = 0;

        for(int i = 0; i < casos; i++){
            entradas = scan.nextInt();
            scan.nextLine();
            HashMap<Integer,String> lista = new HashMap<>();

            for(int j = 0; j < entradas-1; j++){
                String[] sep = scan.nextLine().split("-");
                int any = Integer.parseInt(sep[0]);

                lista.put(any,sep[1]);
            }

            String concursant = scan.nextLine();

            for(Map.Entry<Integer,String> entry: lista.entrySet()){
                if(entry.getValue().equals(concursant)){
                    cont++;
                }
            }

            System.out.println(cont);
            cont = 0;
        }
    }
}
