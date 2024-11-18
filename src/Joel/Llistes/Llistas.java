package Joel.Llistes;

import java.util.Scanner;

public class Llistas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int numSeus;
        String comida;

        for(int i = 0; i  < casos; i++){

            numSeus = scan.nextInt();

            scan.nextLine();
            comida = scan.nextLine();
            String[] aperitius = comida.split(" ");

            for(int j = 0; j < aperitius.length; j++){
                if(j % numSeus == 1 && numSeus != 1){
                    aperitius[j] = "";
                }
                if(numSeus == 1){
                    aperitius[j] = "";
                }
            }

            for(int j = 0; j < aperitius.length; j++){
                System.out.print(aperitius[j]+" ");
            }

            System.out.println();
        }
    }
}
