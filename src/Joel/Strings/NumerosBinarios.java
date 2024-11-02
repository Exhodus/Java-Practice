package Joel.Strings;

import java.util.Scanner;

public class NumerosBinarios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int total = 0, centenas = 0,holder = 0, decenas = 0, unidades = 0;
        scan.nextLine();
        String entrada;
        String result = "";

        for(int i = 0; i < casos; i++){
            entrada = scan.nextLine();
            String[] separat = entrada.split(" ");

            if(separat[1].equals("+")){
                total = Integer.parseInt(separat[0]) + Integer.parseInt(separat[2]);
            } else {
                total = Integer.parseInt(separat[0]) - Integer.parseInt(separat[2]);

            }

            for(int j = total; j > 0; j /= 2){
                if( j % 2 == 0){
                    result += "0";
                } else {
                    result += "1";
                }
            }

            String reversed ="";

            for(int j = result.length()-1; j >= 0; j--){
                reversed += result.charAt(j);
            }

            if(reversed.isEmpty()){
                System.out.println(0);
            } else {
                System.out.println(reversed);
            }

            result = "";
            total = 0;
        }



    }
}
