package Joel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class musicaBambino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String entrada = "";
        String[] octavas = {"A","A#","B","C","C#","D","D#","E","F","F#","G","G#"};
        for(int i = 0; i < casos; i++){
            entrada = scan.nextLine();
            String[] sep = entrada.split(" ");
            ArrayList<String> notas = new ArrayList<>(Arrays.asList(sep));

            for(int j = 1; j < notas.size(); j++){
                if(notas.get(j-1).charAt(0) > notas.get(j).charAt(0)){
                    String aux = notas.get(j-1);
                    notas.set(j-1, notas.get(j));
                    notas.set(j, aux);
                    j = 0;
                }
            }

            boolean flagPrimera = false;
            int suma = 0;
            int posicio = 0;
            for(int j = 0; j < notas.size(); j++) {
                for (int k = 0; k < octavas.length; k++) {
                    if (flagPrimera && notas.get(j).equals(octavas[k])) {
                        if(k < posicio){
                            suma = ((octavas.length-1)-posicio) + k;
                        } else {
                            suma += (k - posicio);
                        }
                        posicio = k;
                        k = octavas.length - 1;
                    } else if (notas.get(j).equals(octavas[k])) {
                        flagPrimera = true;
                        posicio = k;
                        k = octavas.length-1;
                    }
                }
            }

            System.out.println(suma);
            System.out.println(notas);
        }
    }
}
