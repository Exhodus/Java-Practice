package practica;

import java.util.Scanner;

public class ex2IFS {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String frase = scan.nextLine();

        switch (frase) {
            case "GANDHI":
            case "DANDY":
            case "DAMM VI":
                System.out.println("DAMVI");
                break;
            case "YA VA":
            case "LLAMA":
                System.out.println("JAVA");
                break;
            case "EL RESULTAT ENS DONA":
                System.out.println("MERCADONA");
                break;
            default:
                System.out.println(frase);
        }
    }
}
