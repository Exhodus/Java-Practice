package Joel.Strings;

import java.util.Scanner;

public class BolasLobas2AhoraEsPersonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        String nom1,nom2;
        int indice1 = 0, indice2 = 0;
        boolean primer = false;
        scan.nextLine();


        for(int i = 0; i < casos; i++){
            nom1 = scan.nextLine();
            nom2 = scan.nextLine();

            for(int j = 0; j <  nom1.length(); j++){
                for(int k = j+1; k < nom1.length(); k++){
                    if((nom1.charAt(j) == nom2.charAt(k)) && !primer){
                        indice1 = j;
                        indice2 = k;
                        primer = true;
                    }
                }
            }


            System.out.println(indice1+" "+indice2);
            indice1 = 0;
            indice2 = 0;
            primer = false;
        }
    }
}
