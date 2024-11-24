package EjerciciosGPT;

import java.util.Scanner;

public class FormatearStringConStringbuilder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase = scan.nextLine();

        String[] separados = frase.split(" ");

        for(int i = 0; i < separados.length; i++){

            separados[i] = separados[i].toLowerCase();

        }

        for(int i = 0; i < separados.length; i++){
            System.out.print(separados[i]+" ");
        }
    }
}
