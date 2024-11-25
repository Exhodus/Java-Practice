package Joel.Llistes;

import Joel.Arrays.Index;

import java.util.ArrayList;
import java.util.Scanner;

public class NotaActitud2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas, gran = 0,cont = 0;
        ArrayList<Integer> notes1 = new ArrayList<>();
        ArrayList<Integer> notes2 = new ArrayList<>();

        for(int i = 0; i < casos; i++){

            entradas = scan.nextInt();

            for(int j = 0; j < entradas; j++){
                notes1.add(scan.nextInt());
            }

            for(int j = 0; j < entradas; j++){
                notes2.add(scan.nextInt());
            }

            for(int j = 0; j < entradas; j++){
                if((notes2.get(j)-notes1.get(j)) > gran || gran == 0) {
                    gran = notes2.get(j)-notes1.get(j);
                }
            }

            for(int j = 0; j < notes2.size(); j++){
                if(notes2.get(j) - notes1.get(j) == gran){
                    cont++;
                }
            }

            System.out.println(gran+" "+cont);

            cont = 0;
            gran = 0;
            notes2.clear();
            notes1.clear();
        }
    }
}
