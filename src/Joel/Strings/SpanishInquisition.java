package Joel.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class SpanishInquisition {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        String frase;
        ArrayList<String> censura = new ArrayList<>();
        int casos = scan.nextInt();
        int entradas;

        for(int i = 0; i < casos; i++){
            entradas = scan.nextInt();
            scan.nextLine();

            for(int j = 0; j < entradas-1; j++){
                censura.add(scan.nextLine());
            }

            frase = scan.nextLine();

            for(int j = 0; j < censura.size(); j++){
                if(frase.contains(censura.get(j))){
                    frase = frase.replaceAll(censura.get(j), "*****");
                }
            }

            System.out.println(frase);

            censura.clear();

        }
    }
}
