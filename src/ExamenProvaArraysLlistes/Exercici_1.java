package ExamenProvaArraysLlistes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercici_1 {
    public static void main(String[] args) {

        Scanner  scan = new Scanner(System.in);

        int numeroNoms = scan.nextInt();
        scan.nextLine();
        ArrayList<String> noms = new ArrayList<>();
        ArrayList<String> cognoms = new ArrayList<>();
        ArrayList<String> mails = new ArrayList<>();
        String any;

        for(int i = 0; i < numeroNoms; i++){
            noms.add(scan.next().toLowerCase());
        }

        for(int i = 0; i < numeroNoms; i++){
            cognoms.add(scan.next().toLowerCase());
        }

        any = scan.next();
        String[] anySeparat = any.split("");
        String anyAux = "";

        for(int i = anySeparat.length-2; i < anySeparat.length; i++){
            anyAux += anySeparat[i];
        }

        for(int i = 0; i < noms.size(); i++){

            String aux = noms.get(i).charAt(0)+cognoms.get(i);

            if(!mails.contains(aux)){

                mails.add(aux);
            } else {
                aux += anyAux;
                mails.add(aux);
            }
        }

        Collections.sort(mails);

        if(mails.contains("malbareda")){
            int aux = mails.lastIndexOf("malbareda");

            mails.remove(aux);
            mails.add(0, "malbareda");
        }

        for(int i = 0; i < mails.size(); i++){
            mails.set(i, mails.get(i)+"@ies-sabadell.cat");
        }

        System.out.println(mails);
    }
}
