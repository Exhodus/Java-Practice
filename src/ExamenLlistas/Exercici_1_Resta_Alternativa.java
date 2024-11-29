package ExamenLlistas;

import java.util.Scanner;

public class Exercici_1_Resta_Alternativa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nums = scan.nextInt();
        scan.nextLine();
        String entrades = scan.nextLine();
        String[] array1 = entrades.split(" ");
        entrades = scan.nextLine();
        String[] array2 = entrades.split(" ");

        for(int i = 0; i < array2.length; i++){

            int aux = Integer.parseInt(array2[i]);

            int resultat = 9-aux;

            array2[i] = String.valueOf(resultat);
        }

        String aux = "";

        for(int i = 0; i < array1.length; i++){
            aux += array1[i];
        }
        int primer = Integer.parseInt(aux);

        aux = "";



        for(int i = 0; i < array2.length; i++){
            aux += array2[i];
        }

        int segon = Integer.parseInt(aux);

        String resulFinal = Integer.toString(primer+segon+1);

        for(int i = 1; i < resulFinal.length(); i++){
            System.out.print(resulFinal.charAt(i));
        }

    }
}
