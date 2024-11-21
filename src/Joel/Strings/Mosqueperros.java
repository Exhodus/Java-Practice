package Joel.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Mosqueperros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas;
        String nombres;
        String[] nombresSeparados;
        ArrayList<String> nombresMal = new ArrayList<>();
        ArrayList<String> mosquePerros = new ArrayList<>();

        for(int i = 0; i < casos; i++){
            entradas = scan.nextInt();
            scan.nextLine();
            nombres = scan.nextLine();
            nombresSeparados = nombres.split(", ");

            for(int j = 0; j < nombresSeparados.length; j++){

                if(nombresSeparados[j].contains("Mosqueperro")){
                    if(!nombresSeparados[j].contains("AntiMosqueperro")) {
                        mosquePerros.add(nombresSeparados[j]);
                    } else {
                        nombresMal.add(nombresSeparados[j]);
                    }
                } else {
                    nombresMal.add(nombresSeparados[j]);
                }
            }

            System.out.println(mosquePerros);
            System.out.println(nombresMal);

            mosquePerros.clear();
            nombresMal.clear();
        }
    }
}
