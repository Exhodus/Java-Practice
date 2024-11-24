package EjerciciosGPT;

import java.util.Scanner;

public class PracticaEjercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder frase = new StringBuilder(scan.nextLine());
        int cont = 0;

        for(int i = 0; i < frase.length(); i++){
            if(i%2 == 0){
                if(frase.charAt(i) == 'a'||frase.charAt(i) == 'e'||frase.charAt(i) == 'i'||frase.charAt(i) == 'o'||frase.charAt(i) == 'u'||
                        frase.charAt(i) == 'A'||frase.charAt(i) == 'E'||frase.charAt(i) == 'I'||frase.charAt(i) == 'O'||frase.charAt(i) == 'U'){
                    frase.deleteCharAt(i);
                    cont++;
                    i--;
                }
            } else if(i%2 == 1){
                frase.replace(i,i+1,"*");
            }
        }

        System.out.println("Frase modificada: "+frase);
        System.out.println("Numero de vocals eliminades: "+cont);
    }
}
