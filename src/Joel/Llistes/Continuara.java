package Joel.Llistes;

import java.util.Scanner;

public class Continuara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String frase;
        String punts = "...";

        for(int i = 0; i < casos; i++){
            frase = scan.nextLine();
            String[] paraules = frase.split(" ");

            for(int j = 0; j < paraules.length-1; j++){
                if(paraules[j].length() < paraules[j+1].length()){
                    paraules[j] += punts;
                }
            }

            for(int j = 0; j < paraules.length; j++){
                System.out.print(paraules[j]+" ");
            }

            System.out.println();
        }
    }
}
