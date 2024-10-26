package ExamenProvaBucles;

import java.util.Scanner;

public class Exercici_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jokovic = 6;
        int alcaraz = 7;

        while ((alcaraz < 10 && jokovic < 10) || (alcaraz <= jokovic+1 && jokovic <= alcaraz+1) ){

            System.out.print("Escriu qui ha fet el punt: ");
            String entrada = scan.nextLine();

            if(entrada.equals("DJOKOVIC")){
                jokovic++;
            } else if (entrada.equals("ALCARAZ")){
                alcaraz++;
            } else {
                System.out.println("La entrada no es valida. Torna-ho a provar.");
            }
        }

        if(alcaraz > jokovic){
            System.out.println("GUANYA ALCARAZ");
        } else {
            System.out.println("GUANYA DJOKOVIC");
        }
    }
}
