package Joel.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LalafelBalanceado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int lalafel = 0,telaranya = 0, llenas = 0;
        int capacitat,holder = 0;
        boolean aranya = false;
        scan.nextLine();
        String entradas;


        for(int i =0 ; i < casos; i++){

            entradas = scan.nextLine().toLowerCase();
            String[] separados = entradas.split(", ");

            capacitat = scan.nextInt();
            scan.nextLine();

            for(int j = 0; j < separados.length; j++){
                if(separados[j].equals("lalafel")){
                    lalafel++;
                    aranya = false;
                } else if (separados[j].equals("telaranya")){
                    telaranya++;
                    aranya = false;
                } else if ( separados[j].equals("aranya") ){
                    aranya = true;
                    telaranya = 0;
                    lalafel = 0;
                }
            }

            if (!aranya && capacitat > 0 && telaranya > 0){
                if(lalafel >= (capacitat*telaranya)){
                    llenas = telaranya;
                }
            }

            System.out.println("Hay "+llenas+" telaranyas llenas.");

            lalafel = 0;
            telaranya = 0;
            aranya = false;
            llenas = 0;
        }

    }
}
