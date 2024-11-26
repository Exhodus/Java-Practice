package Joel.Matrius;

import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int[][] notes;
        int alumnes, nota;

        for(int i = 0; i < casos; i++){
            alumnes = scan.nextInt();
            nota = scan.nextInt();
            notes = new int[alumnes][nota];

            for(int j = 0; j < notes.length; j++){
                for(int k = 0; k < notes[0].length; k++){
                    notes[i][j] = scan.nextInt();
                }
            }

            int suma = 0;
            for(int j = 0; j < notes.length; j++){
                for(int k = 0; k < notes[0].length; k++){
                    suma += notes[i][j];
                }
                System.out.println(suma/nota);
            }

        }
    }
}
