package ExamenProvaArraysLlistes;

import java.util.Scanner;

public class exercici_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder frase = new StringBuilder(scan.nextLine());
        int cont = 0;

        for(int i = 0; i < frase.length();i++){
            if(i%2 == 1){
                frase.replace(i,i+1,"*");
            }
            if(i%2 == 0 && (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o'
                    || frase.charAt(i) == 'u' || frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O'
                    || frase.charAt(i) == 'U')){
                frase.delete(i,i+1);
                cont++;
                i--;
            }
        }

        System.out.println(frase);
        System.out.println("Numero de vocals destruidas con mi omnipotencia: "+cont);
    }
}
