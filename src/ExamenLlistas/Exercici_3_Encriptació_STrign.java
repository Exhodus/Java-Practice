package ExamenLlistas;

import java.util.Scanner;

public class Exercici_3_Encriptació_STrign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder frase = new StringBuilder(scan.nextLine());
        int indexInici = scan.nextInt();
        int indexFinal = scan.nextInt();
        int desplasament = scan.nextInt();

        for(int i = indexInici; i <= indexFinal; i++){
            char aux = frase.charAt(i);

            aux = (char) (aux + desplasament);

            frase.setCharAt(i,aux);
        }

        System.out.println(frase);
    }
}
