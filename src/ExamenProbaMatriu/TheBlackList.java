package ExamenProbaMatriu;

import com.sun.security.auth.NTSidGroupPrincipal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheBlackList {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int llista = scan.nextInt();
        HashMap<String,String> blacklist = new HashMap<>();
        HashMap<String,String> blacklistFinal = new HashMap<>();
        scan.nextLine();
        int cont = 500;

        for(int i = 0; i < llista; i++){
            String[] malagent = scan.nextLine().split(",");
            blacklist.put(malagent[0],malagent[1]);
        }

        blacklistFinal.putAll(blacklist);

        String entrada = scan.nextLine();

        while (!entrada.equals("DIE")){

            if(blacklist.containsKey(entrada)){
                blacklistFinal.remove(entrada);
            } else {
                boolean estaValor = false;
                for(Map.Entry<String,String> entry: blacklist.entrySet()){
                    if(entry.getValue().equals(entrada)){
                        String key = entry.getKey();
                        blacklistFinal.remove(key);
                        estaValor = true;
                    }
                }
                if(!estaValor){
                    if(entrada.charAt(0) != 'N') {
                        blacklistFinal.put("N" + cont, entrada);
                        cont++;
                    } else {
                        blacklistFinal.put(entrada, "Nom ocult");
                    }
                }
            }

            entrada = scan.nextLine();
        }

        System.out.println(blacklistFinal);
    }

}
