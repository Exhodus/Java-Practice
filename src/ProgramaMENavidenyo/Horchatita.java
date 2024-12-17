package ProgramaMENavidenyo;

import java.util.*;

public class Horchatita {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int horchata = scan.nextInt();
        int personas = scan.nextInt();

        int cont = 0;

        while (horchata != 0 && personas != 0){

            int[] valor = new int[personas];
            int[] orchas = new int[personas];

            for(int i = 0; i < valor.length; i++){
                valor[i] = scan.nextInt();
                orchas[i] = scan.nextInt();
            }

            int[] ordenats = new int[personas];
            for(int i = 0; i < valor.length-1; i++){
                for(int j = 0; j < valor.length; j++){
                    if(valor[j] > valor[i]){
                        int aux = valor[i];
                        valor[i] = valor[j];
                        valor[j] = aux;
                        aux = orchas[i];
                        orchas[i] = orchas[j];
                        orchas[j] = orchas[i];
                    }
                }
            }

            for(int i = 0; i < valor.length; i++){
                System.out.println(valor[i]+" "+orchas[i]);
            }
//            System.out.println(cont+" "+horchata);
            cont = 0;
            horchata = scan.nextInt();
            personas = scan.nextInt();
        }


    }
}
