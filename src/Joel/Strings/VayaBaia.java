package Joel.Strings;

import java.util.Scanner;

public class VayaBaia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        StringBuilder frase;
        scan.nextLine();
        for(int i = 0; i < casos; i++){

            frase  = new StringBuilder(scan.nextLine());

            for(int j = 0; j < frase.length(); j++){
                if(frase.charAt(j) == 'v'){
                    frase.setCharAt(j,'b');
                } else if(frase.charAt(j) == 'V'){
                    frase.setCharAt(j,'B');
                } else if(frase.charAt(j) == 'b'){
                    frase.setCharAt(j,'v');
                } else if(frase.charAt(j) == 'B'){
                    frase.setCharAt(j,'V');
                }
            }

            System.out.println(frase);
        }
    }
}
