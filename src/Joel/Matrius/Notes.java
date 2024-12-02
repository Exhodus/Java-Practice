package Joel.Matrius;

import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int[][] notes;
        int files, columnes;

        for(int i = 0; i < casos; i++){
            files = scan.nextInt();
            columnes = scan.nextInt();
            notes = new int[files][columnes];
            int suma = 0;
            int result;

            for(int j = 0; j < notes.length; j++){
                for(int k = 0; k < notes[0].length; k++){
                    notes[j][k] = scan.nextInt();
                    suma += notes[j][k];
                }
                result = suma/notes[j].length;
                System.out.print(result+" ");
                suma = 0;
            }

            System.out.println();


        }
    }
}
