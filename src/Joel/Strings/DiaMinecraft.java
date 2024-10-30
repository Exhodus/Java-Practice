package Joel.Strings;

import java.util.Scanner;

public class DiaMinecraft {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades,cont = 0;
        String cosas;

        for(int i = 0; i < casos; i++){
            entrades = scan.nextInt();
            scan.nextLine();
            for(int j = 0; j < entrades; j++){
                cosas = scan.nextLine();

                for(int k = 0; k < cosas.length()-1; k++){
                    if(cosas.charAt(k) == '{' && cosas.charAt(k+1) == '}'){
                        cont++;
                    }
                }
            }
            System.out.println(cont);
            cont = 0;
        }
    }
}
