package Joel.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class EmmagatzematgePokemon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int capacitat = scan.nextInt();
        int gran = -1;
        int[] pokedex = new int[capacitat];
        int[] nivell = new int[capacitat];
        ArrayList<Integer> fi = new ArrayList<Integer>();

        for(int i = 0; i < casos; i++) {

            for(int j = 0; j < pokedex.length; j++){
                pokedex[j] = scan.nextInt();
            }

            for(int j = 0; j < nivell.length; j++){
                nivell[j] = scan.nextInt();
            }

            for(int j = 0; j < pokedex.length; j++){
                for(int k = j+1; k < nivell.length; k++){
                    if(pokedex[j] == pokedex[k]){
                        if(nivell[j] > nivell[k] || gran == -1 ){
                            fi.add(pokedex[j]);
                            gran = nivell[j];
                        } else if(nivell[k] > nivell[j] || gran == -1){
                            fi.add(pokedex[k]);
                            gran = pokedex[k];
                        }
                    }
                }
            }
        }
    }
}
