package ExamenProbaGPT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entradas = scan.nextInt();
        scan.nextLine();
        ArrayList<String> nom = new ArrayList<>();
        ArrayList<String> cognom = new ArrayList<>();
        ArrayList<String> id = new ArrayList<>();
        String letrasNom = "", letrasCog = "";
        int cont = 1;

        for(int i = 0; i < entradas; i++){
            nom.add(scan.next().toUpperCase());
        }

        for(int i = 0; i < entradas; i++){
            cognom.add(scan.next().toUpperCase());
        }

        int year = scan.nextInt()%100;

        for( int i = 0; i < entradas; i++){
            letrasNom = nom.get(i).substring(0,3);
            letrasCog = cognom.get(i).substring(0,3);

            if(id.contains(letrasNom+letrasCog+year)){
                id.add(letrasNom+letrasCog+year+"_"+cont);
                cont++;
            } else {
                id.add(letrasNom+letrasCog+year);
            }
        }

        Collections.sort(id);
        System.out.println(id);
    }
}
