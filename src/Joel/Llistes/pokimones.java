package Joel.Llistes;

import java.awt.datatransfer.FlavorListener;
import java.util.ArrayList;
import java.util.Scanner;

public class pokimones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas = scan.nextInt();
        int[] pokemon = new int[entradas];
        int[] nivel = new int[entradas];
        int cont = 0;
        boolean diferente = false;
        ArrayList<Integer> lista = new ArrayList<>();

        for(int i = 0; i < casos; i++){
            for(int j = 0; j < entradas; j++){
                pokemon[j] = scan.nextInt();
            }
            for(int j = 0; j < entradas; j++){
                nivel[j] = scan.nextInt();
            }

            for(int j = 0; j < pokemon.length; j++){

                int gran = -1;
                int granValor = 0;

                for(int k = 0; k < pokemon.length; k++){
                    if(j != k) {
                        if (pokemon[j] == pokemon[k]) {
                            if (nivel[j] > nivel[k] && nivel[j] > granValor) {
                                gran = j;
                                granValor = nivel[j];
                            }
                        } else {
                            cont++;
                        }
                    }
                }

                if(gran != -1 && !lista.contains(pokemon[gran])){
                    lista.add(pokemon[gran]);
                }
                if(cont == pokemon.length-1){
                    lista.add(pokemon[j]);
                }
                cont = 0;
            }

            for(int j = 0; j < lista.size(); j++){
                System.out.print(lista.get(j)+" ");
            }

            System.out.println();
            lista.clear();

        }
    }
}
