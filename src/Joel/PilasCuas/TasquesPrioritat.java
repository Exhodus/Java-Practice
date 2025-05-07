package Joel.PilasCuas;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TasquesPrioritat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        for(int i = 0 ; i < casos; i++){
            int numEntradas = scan.nextInt();
            int index = scan.nextInt();
            scan.nextLine();
            PriorityQueue<Integer> llista = new PriorityQueue<>();
            HashMap<Integer, String> diccionari = new HashMap<>();

            for(int j = 0; j < numEntradas; j++){
                String num = scan.next();
                String frase = scan.nextLine();

                llista.add(Integer.parseInt(num));
                diccionari.put(Integer.parseInt(num), frase);
            }

            for(int j = 0; j < index-1; j++){
                llista.poll();
            }

            System.out.println(diccionari.get(llista.poll()));
        }
    }
}
