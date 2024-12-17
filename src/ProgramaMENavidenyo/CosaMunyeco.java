package ProgramaMENavidenyo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CosaMunyeco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> puntuacionAdult = new HashMap<>();
        HashMap<String, Integer> puntuacionNen = new HashMap<>();
        int entradas = scan.nextInt();
        while (entradas != 0){
            scan.nextLine();
            String ninot = "";
            int contNen = 1;
            int contAdu = 1;
            ArrayList<String> llistaAdults = new ArrayList<>();
            ArrayList<String> llistaNens = new ArrayList<>();
            for(int i = 0; i < entradas; i++){

                ninot = scan.next();
                if(puntuacionAdult.containsKey(ninot)){
                    int valor = puntuacionAdult.get(ninot);
                    puntuacionAdult.put(ninot, valor+1);
                    contAdu = valor;
                } else if(puntuacionNen.containsKey(ninot)){
                    int valor = puntuacionNen.get(ninot);
                    puntuacionNen.put(ninot, valor+1);
                    contNen = valor;
                } else if(ninot.equals(ninot.toLowerCase())){
                    puntuacionNen.put(ninot,1);
                } else if (ninot.equals(ninot.toUpperCase())){
                    puntuacionAdult.put(ninot, 1);
                }
            }

            int maxValAdu = 0;
            for(String s: puntuacionAdult.keySet()){
                if(puntuacionAdult.get(s) > maxValAdu){
                    maxValAdu = puntuacionAdult.get(s);
                }
            }

            int maxValNen = 0;
            for(String s: puntuacionNen.keySet()){
                if(puntuacionNen.get(s) > maxValNen){
                    maxValNen = puntuacionNen.get(s);
                }
            }


            for ( String entry: puntuacionAdult.keySet()){
                if(puntuacionAdult.get(entry) == maxValAdu){
                    llistaAdults.add(entry);
                }
            }

            for ( String entry: puntuacionNen.keySet()){
                if(puntuacionNen.get(entry) == maxValNen){
                    llistaAdults.add(entry);
                }
            }

            if(llistaAdults.size() == 1){
                System.out.print(llistaAdults.get(0)+" ");
            } else {
                System.out.print("empate ");
            }

            if(llistaNens.size() == 1){
                System.out.print(llistaNens.get(0)+" ");
            } else {
                System.out.print("empate ");
            }

            puntuacionAdult.clear();
            puntuacionNen.clear();

            entradas = scan.nextInt();
        }

    }
}
