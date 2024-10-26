package ExamenProvaBucles;

import java.util.Scanner;

public class Cientifica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introdueix un nombre positiu major que zero: ");
        double resultat = scan.nextDouble();
        System.out.println("1 - Arrel cuadrada de "+resultat);
        System.out.println("2 - "+resultat+" al cuadrat");
        System.out.println("3 - "+resultat+" al cub");
        System.out.println("4 - 2 elevat a "+resultat);
        System.out.println("5 - 1/"+resultat);
        System.out.println("6 - Exit");

        int opcio = scan.nextInt();
        while (opcio != 6) {
            switch (opcio) {
                case 1:
                    resultat = Math.sqrt(resultat);
                    System.out.printf("%.2f",resultat);

                    System.out.println();
                    break;
                case 2:
                    resultat = Math.pow(resultat, 2);
                    System.out.println(resultat);
                    break;
                case 3:
                    resultat = Math.pow(resultat, 3);
                    System.out.println(resultat);
                    break;
                case 4:
                    resultat = Math.pow(2, resultat);
                    System.out.println(resultat);
                    break;
                case 5:
                    resultat = 1 / resultat;
                    System.out.printf("%.2f",resultat);

                    System.out.println();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("ERROR: opció incorrecte.");
            }

            System.out.print("Introdueix un nombre positiu major que zero: ");
            resultat = scan.nextDouble();
            System.out.println("1 - Arrel cuadrada de "+resultat);
            System.out.println("2 - "+resultat+" al cuadrat");
            System.out.println("3 - "+resultat+" al cub");
            System.out.println("4 - 2 elevat a "+resultat);
            System.out.println("5 - 1/"+resultat);
            System.out.println("6 - Exit");

            opcio = scan.nextInt();
        }
        System.out.println("A reveure.");

    }
}
