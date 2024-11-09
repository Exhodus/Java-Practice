package Joel.Strings;

import java.util.Scanner;

public class Raid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        int min = 0;
        String hores;

        for (int i = 0; i < casos; i++){

            hores = scan.nextLine();
            String[] separats = hores.split(":");


            min += Integer.parseInt(separats[0]) * 60;
            min += Integer.parseInt(separats[1]);


            if(min >= 1350 || min <= 30 ){
                System.out.println("RAID");
            } else {

                min = 1350 - min;
                System.out.println(min);
            }

            min = 0;
        }
    }
}
