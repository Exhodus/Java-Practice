package ExamenProvaBucles;

import java.util.Scanner;

public class Exercici_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolliu una opció: ");
        System.out.println("1. Introduir frase.");
        System.out.println("2. Afegir paraules a la frase");
        System.out.println("3. Eliminar frase.");
        System.out.println("4. Canvis despres de xifrar");
        System.out.println("5. sortir");
        int opcio = scan.nextInt(), cont = 0;
        scan.nextLine();
        String frase = "", cosa;
        while (opcio != 5) {

            switch (opcio) {
                case 1:
                    System.out.println("Introdueix una frase: ");
                    frase = scan.nextLine().toUpperCase();
                    break;
                case 2:
                    System.out.println("Quina paraula vol afegir?");
                    frase += scan.next();
                    break;
                case 3:
                    System.out.println("Frase eliminada.");
                    frase = "";
                    System.out.println(frase);
                    break;
                case 4:
                    for (int i = 0; i < frase.length(); i++){
                        if (frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'P'||
                                frase.charAt(i) == 'C'){
                            cont++;
                        }
                    }
                    System.out.println(cont);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ave, Caesar, morituri te salutant");
            }

            System.out.println("Escolliu una opció: ");
            System.out.println("1. Introduir frase.");
            System.out.println("2. Afegir paraules a la frase");
            System.out.println("3. Eliminar frase.");
            System.out.println("4. Canvis despres de xifrar");
            System.out.println("5. sortir");
            opcio = scan.nextInt();

        }

        System.out.println("A reveure");
    }
}
