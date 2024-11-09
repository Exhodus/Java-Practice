package Joel.Strings;

import java.util.Scanner;

public class WebCasteller2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        boolean flagMal = false;
        String user,web;

        for(int i = 0; i < casos; i++){
            user = scan.nextLine();
            web = scan.nextLine();
            int cont = 0;

            String[] userArr = user.split(" ");
            String[] webArr = web.split(" ");

            for(int j = 0; j < userArr.length; j++){
                for(int k = 0; k < userArr[j].length(); k++){
                    if(userArr[j].charAt(k) == webArr[j].charAt(k)){
                        cont++;
                    }
                }

                if(cont < userArr[j].length()/2){
                    flagMal = true;
                }
                cont = 0;
            }

            if(flagMal){
                System.out.println("WEBCASTELLER ESTA TRAVIESO HOY");
            } else {
                System.out.println("GRACIES WEBCASTELLER");
            }

            flagMal = false;

        }
    }
}
