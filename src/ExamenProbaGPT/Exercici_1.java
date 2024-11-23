package ExamenProbaGPT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercici_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entradas = scan.nextInt();
        scan.nextLine();
        int any;
        ArrayList<String> noms = new ArrayList<>();
        ArrayList<String> cognoms = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();

        for(int i = 0; i < entradas; i++){
            noms.add(scan.next().toLowerCase());
        }

        for(int i = 0; i < entradas; i++){
            cognoms.add(scan.next().toLowerCase());
        }

        any = scan.nextInt()%100;



        for(int i = 0; i < noms.size(); i++){
            if(emails.contains(noms.get(i).charAt(0)+cognoms.get(i)+"@ies-sabadell.cat")){
                emails.add(noms.get(i).charAt(0)+cognoms.get(i)+any+"@ies-sabadell.cat");
            } else {
                emails.add(noms.get(i).charAt(0)+cognoms.get(i)+"@ies-sabadell.cat");
            }
        }

        Collections.sort(emails);
        int aux = emails.indexOf("malbareda@ies-sabadell.cat");

        if(emails.contains("malbareda@ies-sabadell.cat") && emails.indexOf("malbareda@ies-sabadell.cat") > 0){
            emails.remove(aux);
            emails.add(0,"malbareda@ies-sabadell.cat");
        }

        System.out.println(emails);
    }
}
