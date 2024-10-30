package Joel.Strings;

import java.util.Scanner;

public class NoEsPatata {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String patata;

        for(int i = 0; i < casos; i++){
            patata = scan.nextLine().toLowerCase();

            if(patata.equals("patata")){
                System.out.println("Es Patata");
            } else {
                System.out.println("No es Patata");
            }
        }
    }
}
