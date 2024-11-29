package ExamenLlistas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercici_2_Cadires_locas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numJugadors = scan.nextInt();
        ArrayList<String> noms = new ArrayList<>();

        for(int i = 0; i < numJugadors; i++){
            noms.add(scan.next());
        }

        for(int i = 0; i < numJugadors-1; i++) {
            int voltes = scan.nextInt();

            Collections.rotate(noms,voltes);

            noms.remove(noms.size()-1);
        }

        System.out.println("Ha guanyat: "+noms+"!!!");

    }
}
