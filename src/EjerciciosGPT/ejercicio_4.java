package EjerciciosGPT;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase = scan.nextLine();
        boolean mere = false, salsa = false;

        String[] separat = frase.split(" ");

        for(int i = 0; i < separat.length; i++){
            if(separat[i].equals("Mereketengue")){
                mere = true;
            } else if (separat[i].equals("Salsa")){
                salsa = true;
            }
        }

        LinkedHashSet <String> fin = new LinkedHashSet<>(Arrays.asList(separat));
        String[] stringFinal = new String[fin.size()];
        stringFinal = fin.toArray(stringFinal);

        for(int i = 0; i < stringFinal.length; i++){
            System.out.print(stringFinal[i]+" ");
        }

        System.out.println();

        if(mere){
            if(salsa){
                System.out.println("Salsa y Mereketengue");
            } else {
                System.out.println("Mereketengue");
            }
        } else if (salsa){
            System.out.println("Salsa");
        } else {
            System.out.println("Cap");
        }
    }
}
