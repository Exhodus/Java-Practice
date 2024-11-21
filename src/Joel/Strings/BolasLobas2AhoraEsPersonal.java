package Joel.Strings;

import java.util.Scanner;

public class BolasLobas2AhoraEsPersonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String nom1,nom2;
        int indice1 = -1, indice2 = -1;

        for(int i = 0; i < casos; i++){
            nom1 = scan.nextLine();
            nom2 = scan.nextLine();

            for(int j = 0; j < nom1.length(); j++){
                for(int k = 1; k < nom2.length(); k++){
                    if(nom1.charAt(j) == nom2.charAt(k)){
                        if(indice1 == -1){
                            indice1 = j;
                        } else if ( indice2 == -1){
                            indice2 = k;
                        }
                    }
                }
            }
            System.out.println(indice1+" "+indice2);
            indice1 = -1;
            indice2 = -1;
        }
    }
}
