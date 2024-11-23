package ExamenProbaGPT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Exercici_2 {
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Integer> llista1 = new ArrayList<>();
        ArrayList<Integer> llista2 = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            llista1.add(rand.nextInt(1,21));
        }
        for(int i = 0; i < 10; i++){
            llista2.add(rand.nextInt(1,21));
        }

        System.out.println("Llista 1: "+llista1);
        System.out.println("Llista 2: "+llista2);
        llista1.retainAll(llista2);
        System.out.println("LLista amb els elements comuns: "+llista1);

        int max = llista1.indexOf(Collections.max(llista1));
        int min = llista1.indexOf(Collections.min(llista1));
        Collections.swap(llista1, max, min);
        System.out.println("LLista amb la posició Max y Min intercanviada: "+llista1);

    }
}
