package ExamenProvaArraysLlistes;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercici_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase = scan.nextLine();
        String[] paraules = frase.split(" ");
        ArrayList<String> llista= new ArrayList<String>();
        boolean mereketengue = false, salsa = false;

        for(int i = 0; i < paraules.length-1; i++){
            for(int j = i+1; j < paraules.length; j++){
                if(paraules[i].equals(paraules[j])){
                    paraules[j] = "";
                }
            }

        }

        for(int i = 0; i < paraules.length; i++){
           if(!paraules[i].equals("")){
                llista.add(paraules[i]);

               if(paraules[i].equals("Mereketengue")){
                   mereketengue = true;
               } else if (paraules[i].equals("Salsa")){
                   salsa = true;
               }
           }
        }


        for(int i = 0; i < llista.size(); i++){
            System.out.print(llista.get(i)+" ");
        }

        System.out.println();

        if( mereketengue){
            if(salsa){
                System.out.println("Mereketengue i Salsa");
            } else {
                System.out.println("Mereketengue");
            }
        } else if (salsa){
            System.out.println("Salsa");
        } else {
            System.out.println("Cap");
        }
    }
}
