package ExamenProvaBucles;

import java.util.Scanner;

public class Exercici_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int sumPuntsA = 0, sumPuntsB = 0, sumEdatB = 0, sumEdatJ = 0;
        int[] entrades = new int[8];
        boolean flagError = false;

        for(int i = 0; i < casos; i++){
            System.out.println("Entra la "+(i+1)+" ronda: ");
            for(int j = 0; j < entrades.length; j++){
                entrades[j] = scan.nextInt();
            }
            if( entrades[0] < entrades[1] || entrades[2]< entrades[3] ||
                    entrades[4] < entrades[5] || entrades[6] < entrades[7]){
                flagError = true;
            } else {
                sumPuntsA += (entrades[1] + entrades[3]);
                sumPuntsB += (entrades[5] + entrades[7]);
                sumEdatB += (entrades[1] + entrades[5]);
                sumEdatJ += (entrades[3] + entrades[7]);
            }

        }
        if(flagError){
            System.out.println("ERROR");
        } else {
            if( sumPuntsB > sumPuntsA){
                System.out.println("B");
            } else {
                System.out.println("A");
            }
            if(sumEdatJ > sumEdatB){
                System.out.println("JOVES");
            } else {
                System.out.println("BOOMERS");
            }
        }
    }
}
