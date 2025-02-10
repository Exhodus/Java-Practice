package ExamenProbaFuncionsRecursivitat;

import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        if(ordenades(frase)){
            System.out.println("Estan ordenades.");
        } else {
            System.out.println("Estan desordenades.");
        }
    }

    private static boolean ordenades(String frase) {
        if(frase.length() == 1){
            return true;
        } else {
            return frase < c
        }
    }
}
