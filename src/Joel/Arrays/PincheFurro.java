package Joel.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class PincheFurro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        ArrayList <String> expresions = new ArrayList<>();
        String frases;
        boolean hector = false;

        for(int i = 0; i < casos; i++){

            frases = scan.nextLine();
            String[] separats = frases.split(" ");

            for(int j = 0; j < separats.length;j++){
                if(separats[j].equals("grrr")){
                    expresions.add(separats[j]);
                } else if (separats[j].equals("woof")){
                    expresions.add(separats[j]);
                } else if (separats[j].equals("meow")){
                    expresions.add(separats[j]);
                }

                if(separats[j].equals("Hector")){
                    hector = true;
                }
            }

            if(hector){
                System.out.println("Gato pasando por el campo de batalla");
            } else {
                if(expresions.isEmpty()){
                    System.out.println("No hay Furros cerca");
                } else {
                    System.out.println(expresions);
                }
            }
            expresions.clear();
            hector = false;
        }
    }
}
