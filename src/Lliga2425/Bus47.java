package Lliga2425;

import java.util.Scanner;

public class Bus47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades,num;
        String buses = "";
        boolean flag47 = false;

       for(int i = 0;i < casos; i++){
           entrades = scan.nextInt();
           scan.nextLine();
           for(int j = 0; j < entrades; j++){
               buses = scan.next();
               if(!buses.equals("B20")) {
                   num = Integer.parseInt(buses);
                   if (num == 47) {
                       flag47 = true;
                   }
               }

           }

           if(flag47){
               System.out.println("SI");
           } else {
               System.out.println("NO");
           }

           flag47 = false;
       }
    }
}
