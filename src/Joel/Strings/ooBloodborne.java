package Joel.Strings;

import java.util.Scanner;

public class ooBloodborne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String nom;
        boolean seguides = false;

        for(int i = 0; i < casos; i++){

            nom = scan.nextLine();

            for(int j = 0; j < nom.length()-1; j++){
                if(nom.charAt(j) == nom.charAt(j+1)){
                    seguides = true;
                }
            }

            if(seguides){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            seguides = false;
        }
    }
}
