package Joel.Strings;

import java.util.Scanner;

public class Frasindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String frase = scan.nextLine();
        boolean flag = false;
        while(!frase.equals(".")){
            String[] separats = frase.split(" ");

            for(int i = 0; i < separats.length; i++) {
                if (!separats[i].equals(separats[separats.length-(i+1)])) {
                    flag = true;
                }
            }

            if(flag){
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
            flag = false;
            frase = scan.nextLine();
        }
    }
}
