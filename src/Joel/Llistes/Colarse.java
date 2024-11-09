package Joel.Llistes;

import java.util.Scanner;
import java.util.ArrayList;

public class Colarse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades, valor, indice, enters;
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < casos; i++){

            entrades = scan.nextInt();

            for (int j = 0; j < entrades; j++){
                enters = scan.nextInt();
                nums.add(enters);
            }

            valor = scan.nextInt();
            indice = scan.nextInt();

            nums.add(indice, valor);

            for(int j = 0; j < nums.size(); j++){
                System.out.print(nums.get(j)+" ");
            }

            nums.clear();
        }
    }

}