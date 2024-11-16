package Joel.Llistes;

import java.util.ArrayList;
import java.util.Scanner;

public class NotaActitud {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas;
        int puntiacioMax = 0, cont = 0;
        ArrayList<Integer> notas1 = new ArrayList<>();
        ArrayList<Integer> notas2 = new ArrayList<>();

        for(int i = 0; i < casos; i++) {
            entradas = scan.nextInt();
            for(int j = 0; j < entradas; j++) {
                notas1.add(scan.nextInt());
            }

            for(int j = 0; j < entradas; j++) {
                notas2.add(scan.nextInt());
            }

            for(int j = 0; j < notas1.size(); j++) {
                if(notas2.get(j) - notas1.get(j) > puntiacioMax || puntiacioMax == 0) {
                    puntiacioMax = notas2.get(j) - notas1.get(j);
                }
            }

            for(int j = 0; j < notas2.size(); j++) {
                if(notas2.get(j) - notas1.get(j) == puntiacioMax){
                    cont++;
                }
            }

            System.out.println(puntiacioMax+" "+cont);
            puntiacioMax = 0;
            cont = 0;
        }
    }
}
