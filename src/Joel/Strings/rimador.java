package Joel.Strings;

import java.util.Scanner;

public class rimador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String rimas;
        String letras1 ="", letras2 = "",fin = "",holder ="";
        boolean parar = false;

        for(int i = 0; i < casos; i++){

            rimas = scan.nextLine();
            String[] separats = rimas.split(", ");

            for(int j = separats[0].length()-1; j >= 0; j--){
                letras1 += separats[0].charAt(j);
            }

            for(int j = separats[1].length()-1; j >= 0; j--){
                letras2 += separats[1].charAt(j);
            }


            if(letras1.length() > letras2.length()){
                for(int j = 0; j < letras2.length(); j++){
                    if(letras1.charAt(j) == letras2.charAt(j) && !parar){
                        holder += letras1.charAt(j);
                    } else {
                        parar = true;
                    }
                }
            } else {
                for(int j = 0; j < letras1.length(); j++){
                    if(letras1.charAt(j) == letras2.charAt(j) && !parar){
                        holder += letras1.charAt(j);
                    } else {
                        parar = true;
                    }
                }
            }

            if(!holder.isEmpty()) {
                for (int j = holder.length() - 1; j >= 0; j--) {
                    fin += holder.charAt(j);
                }
            }

            if(fin.isEmpty()){
                System.out.println("#");
            } else {
                System.out.println(fin);
            }
            letras1 = "";
            letras2 = "";
            fin = "";
            holder = "";
            parar = false;

        }
    }
}
