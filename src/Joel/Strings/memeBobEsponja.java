package Joel.Strings;

import java.util.Scanner;

public class memeBobEsponja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String frase,fin = "";

        for(int i = 0; i < casos; i++){
            frase = scan.nextLine();
            String upper = frase.toUpperCase();
            String lower = frase.toLowerCase();
            int cont = 0;


            for(int j = 0; j < frase.length(); j++){

                if(frase.charAt(j) != ' ') {
                    if (cont % 2 == 0) {
                        fin += lower.charAt(j);
                        cont++;
                    } else if (cont % 2 == 1) {
                        fin += upper.charAt(j);
                        cont++;
                    }
                }else {
                    fin += " ";
                }
            }

            System.out.println(fin);
            System.out.println();
            fin ="";
        }
    }
}
