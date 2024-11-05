package Lliga2425;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatriculaViva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxAlumn = 0, ratio;
        String nom;
        List<String> llistAlumn = new ArrayList<>();
        char opcio = '0';

        while (opcio != 'F'){

            opcio = scan.next().charAt(0);

            switch (opcio){
                case 'C':
                    maxAlumn = scan.nextInt();
                    scan.nextLine();
                    break;
                case 'I':
                    nom = scan.nextLine();
                    if(maxAlumn == llistAlumn.size()){
                        System.out.println("KO "+nom);
                    } else {
                        llistAlumn.add(nom);
                    }
                    break;
                case 'B':
                    nom = scan.nextLine();
                    if(llistAlumn.contains(nom)){
                        llistAlumn.remove(nom);
                    }
                    break;
                case 'A':
                    ratio = scan.nextInt();
                    scan.nextLine();
                    maxAlumn = ratio;
                    break;
                case 'N':
                case 'S':
                case 'F':
                    System.out.println(llistAlumn.size());
                    break;
            }


        }


    }
}
