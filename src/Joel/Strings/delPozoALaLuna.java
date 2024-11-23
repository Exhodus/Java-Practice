package Joel.Strings;

import java.util.Scanner;

public class delPozoALaLuna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas;
        int cont = 0;
        boolean epa = false;

        for(int i = 0; i < casos; i++){

            entradas = scan.nextInt();
            scan.nextLine();
            String[] paraula = new String[entradas];

            for(int j = 0; j < paraula.length; j++){
                paraula[j] = scan.nextLine();
            }

            for(int j = 0; j < paraula.length-1; j++){
                for(int k = 0; k < paraula[j].length(); k++){
                    if(paraula[j].charAt(k) != paraula[j+1].charAt(k)){
                        cont++;
                    }
                }
                if(cont > 1 || cont == 0){
                    epa = true;
                }
                cont = 0;
            }

            if(epa){
                System.out.println("INCORRECTE");
            } else {
                System.out.println("CORRECTE");
            }

            epa = false;

        }
    }
}
