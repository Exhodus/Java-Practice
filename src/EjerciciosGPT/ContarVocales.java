package EjerciciosGPT;

import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String palabra = scan.nextLine();
        int cont = 0;

        for(int i = 0; i < palabra.length(); i++){
            switch (palabra.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    cont++;
                    break;
            }
        }

        System.out.println(cont);
    }
}
