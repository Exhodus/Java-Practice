package Joel.Arrays;

import java.util.Scanner;

public class Contrasenyas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades;
        scan.nextLine();
        String[] noms = new String[casos];
        String[] conts = new String[casos];
        String holder = "";
        boolean flagNom = false, flagCont = false;
        int posicio = 0;

        for(int i = 0; i < casos; i++){
            noms[i] = scan.next();
        }
        for(int i = 0; i < casos; i++){
            conts[i] = scan.next();
        }

        entrades = scan.nextInt();
        scan.nextLine();
        String[] proves = new String[2];

        for(int i = 0; i < entrades; i++){
            proves[0] = scan.next();
            proves[1] = scan.next();

            for(int j = 0; j < noms.length; j++){
                if(proves[0].equals(noms[j])){
                    flagNom = true;
                    posicio = j;
                }
            }

            if(flagNom){
                if(proves[1].equals(conts[posicio])){
                    flagCont = true;
                }
            }

            if(flagNom){
                if(flagCont){
                    System.out.println("OK");
                } else {
                    System.out.println("contrasenya incorrecta");
                }
            } else {
                System.out.println("usuari no trobat");
            }

            flagNom = false;
            flagCont = false;
        }



        for( int i = 0; i < noms.length; i++){
            for(int j = i +1; j < noms.length; j++){

                if(noms[i].compareTo(noms[j]) > 0){
                    holder = noms[i];
                    noms[i] = noms[j];
                    noms[j] = holder;
                }
            }
        }

        for(int i = 0; i < noms.length; i++){
            System.out.print(noms[i]+" ");
        }
    }
}
