package Lliga2425;

import java.util.Scanner;

public class Bus47 {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       int casos = scan.nextInt();
       int entradas;
       String bus ="";
       boolean ojo = false;

       for(int i = 0; i < casos; i++){

           entradas = scan.nextInt();

           bus = scan.nextLine();
           String[] buses = bus.split(" ");

           for (int j = 1; j < buses.length; j++){
               if(buses[j].equals("47")){
                   ojo = true;
               }
           }

           if(ojo){
               System.out.println("SI");
           } else {
               System.out.println("NO");
           }

           ojo = false;
       }
    }
}
