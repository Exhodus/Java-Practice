package Joel.Matrius;

import javax.swing.*;
import java.util.Scanner;

public class BestAthenaEUW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int files, columnes;

        for(int i = 0; i < casos; i++){

            files = scan.nextInt();
            columnes = scan.nextInt();

            int[][] terreny = new int[files][columnes];

            for(int j = 0; j < terreny.length; j++){
                for(int k = 0; k < terreny[0].length; k++){
                    terreny[j][k] = scan.nextInt();
                }
            }

            int coordY = scan.nextInt();
            int coordX = scan.nextInt();



        }
    }
}
