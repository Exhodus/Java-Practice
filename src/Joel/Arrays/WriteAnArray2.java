package Joel.Arrays;

import java.util.Scanner;

public class WriteAnArray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entrades = scan.nextInt();
        int index;
        scan.nextLine();
        String[] frases = new String[entrades];
        for (int i = 0; i < frases.length; i++){
            frases[i] = scan.nextLine();
        }
        index = scan.nextInt() ;

        for (int i = 0; i < frases.length; i++){
            System.out.println(frases[i]);
        }
        System.out.println(frases[index]);
    }
}
