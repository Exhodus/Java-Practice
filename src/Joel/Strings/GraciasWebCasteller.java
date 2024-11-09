package Joel.Strings;

import java.util.Scanner;

public class GraciasWebCasteller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String user,web,holder = "";

        for( int i = 0; i< casos; i++){
            user = scan.nextLine();
            web = scan.nextLine();

            if(user.length() < web.length()){
                for(int j = 0; j < user.length(); j++){
                    if(web.charAt(j) == user.charAt(j)){
                       holder += user.charAt(j);
                    }
                }
            } else if(user.length() >= web.length()) {
                for(int j = 0; j < web.length(); j++){
                    if(web.charAt(j) == user.charAt(j)){
                        holder += user.charAt(j);
                    }
                }

            }
            double webLargo = web.length();
            double userLargo = user.length();
            double holderLargo = holder.length();

            if(webLargo > userLargo) {
                if (holder.isEmpty() || holderLargo < webLargo/2){
                    System.out.println("WEBCASTELLER ESTA TRAVIESO HOY");
                } else {
                    System.out.println("GRACIES WEBCASTELLER");
                }
            } else{
                if(holder.isEmpty() || holderLargo < userLargo/2){
                    System.out.println("WEBCASTELLER ESTA TRAVIESO HOY");
                } else {
                    System.out.println("GRACIES WEBCASTELLER");
                }
            }
            holder = "";

        }
    }
}
