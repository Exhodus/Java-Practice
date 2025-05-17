package Joel.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class IAmLordVoldemort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < casos; i++){
            String frase1 = scan.nextLine();
            String frase2 = scan.nextLine();
            ArrayList<Character> frase1Junt = new ArrayList<>();
            ArrayList<Character> frase2Junt = new ArrayList<>();

            for(int j = 0; j < frase1.length(); j++){
                if(frase1.charAt(j) != ' '){
                    frase1Junt.add(frase1.charAt(j));
                }
            }
            for(int j = 0; j < frase2.length(); j++){
                if(frase2.charAt(j) != ' '){
                    frase2Junt.add(frase2.charAt(j));
                }
            }
            boolean flag = false;
            if(frase1Junt.size() == frase2Junt.size()){
                for(int j = 0; j < frase2Junt.size(); j++){
                    boolean trobada = false;
                    for(int k = 0; k < frase1Junt.size(); k++){
                        if(frase2Junt.get(j) == frase2Junt.get(k)){
                            trobada = true;
                        }
                    }

                    if(!trobada){
                        flag = true;
                    }
                }
            }

            if(flag){
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }

        }
    }
}
