package Joel.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LalafelBalanceado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int lalafel = 0,telaranya = 0, llenas = 0;
        int capacitat;
        boolean aranya = false;
        scan.nextLine();
        String entradas;


        for(int i =0 ; i < casos; i++){

            entradas = scan.nextLine();
            String[] separados = entradas.split(", ");

            capacitat = scan.nextInt();
            scan.nextLine();

            for(int j = 0; j < separados.length; j++){

                switch (separados[j]){
                    case "Lalafel":
                        lalafel ++;
                        break;
                    case "Telaranya":
                        telaranya++;
                        break;
                    case "Aranya":
                        aranya = true;
                        break;
                }
            }

            if(!aranya){
                if(telaranya*capacitat <= lalafel && capacitat!= 0){
                    llenas = telaranya;
                    System.out.println("Hay " +llenas+" telaranyas llenas");
                }else{
                    System.out.println("Hay " +llenas+" telaranyas llenas");
                }
            } else {
                System.out.println("Hay " +llenas+" telaranyas llenas");
            }

            lalafel = 0;
            telaranya = 0;
            aranya = false;
            llenas = 0;
        }

    }
}
