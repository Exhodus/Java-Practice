package Joel.Arrays;

import java.sql.SQLType;
import java.util.Scanner;

public class eleccionsPatata {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int opcions, gran = 0,posicio = 0;

        for(int i = 0; i < casos;i++){

            opcions = scan.nextInt();
            int[] entrades = new int[opcions];

            for(int j = 0; j < entrades.length;j++){
                entrades[j] = scan.nextInt();
            }

            for(int j = 0; j < entrades.length;j++){
                if(entrades[j] > gran || gran == 0){
                    gran = entrades[j];
                    posicio = j+1;
                }
            }

            System.out.println(posicio);
            gran = 0;
            posicio = 0;
        }
    }
}
