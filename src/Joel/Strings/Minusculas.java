package Joel.Strings;

import java.util.Scanner;

public class Minusculas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        int num = 0;
        String palabra;

        for(int i = 0; i < casos; i++){
            palabra = scan.nextLine();

            for(int j = 0; j < palabra.length(); j++){
                char lletra = palabra.charAt(j);

                if(lletra >= 'a' && lletra <= 'z'){
                    num++;
                }
            }

            System.out.println(num);

            num = 0;
        }
    }
}
