package Joel.Strings;

import java.util.Scanner;

public class rimador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String rimas;
        String letras ="";

        for(int i = 0; i < casos; i++){

            rimas = scan.nextLine();
            String[] separats = rimas.split(",");

            for(int j = 0; j < separats[0].length(); j++){
                if(separats[0].charAt((separats[0].length() - 1) - j) == separats[1].charAt((separats[1].length() - 1) - j)){
                    letras += separats[0].charAt(j);
                }
            }

            System.out.println(letras);

        }
    }
}
