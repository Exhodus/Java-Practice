package ExamenProvaArraysLlistes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercici_2 {
    public static void main(String[] args) {

        Random rand = new Random();

        ArrayList<Integer> llista1 = new ArrayList<>(10);
        ArrayList<Integer> llista2 = new ArrayList<>(10);
        int gran = 0, petit = 0;
        int granIndex = 0, petitIndex = 0;

        for(int i = 0; i < 10; i++){
            llista1.add(rand.nextInt(1,21));
        }

        for(int i = 0; i < 10; i++){
            llista2.add(rand.nextInt(1,21));
        }

        System.out.println("Llista 1: "+llista1);
        System.out.println("Llista 2: "+llista2);
        llista1.retainAll(llista2);
        System.out.println("Llista amb elements comuns: "+llista1);

        gran = Collections.max(llista1);
        petit = Collections.min(llista1);

        granIndex = llista1.indexOf(gran);
        petitIndex = llista1.indexOf(petit);

        Collections.swap(llista1,granIndex,petitIndex);
        System.out.println("Llista amb posició MAX i MIN intercanviada: "+llista1);
    }
}
