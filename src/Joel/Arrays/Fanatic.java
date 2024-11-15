package Joel.Arrays;

import java.util.Scanner;

public class Fanatic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jornades = scan.nextInt();
        int numPartits, fnatic = 0, altres = 0;
        String partit;

        for(int i = 0; i < jornades; i++){
            numPartits = scan.nextInt();
            scan.nextLine();

            for(int j = 0; j < numPartits; j++){

                partit = scan.nextLine();
                String[] equips = partit.split(" - ");

                if(equips[0].equals("Fnatic") || equips[1].equals("Fnatic")) {
                    if (equips[0].equals("Fnatic")) {
                        fnatic++;
                    }
                    if (equips[1].equals("Fnatic")) {
                        altres++;
                    }
                }

            }

            System.out.println(fnatic+" "+altres);

            fnatic = 0;
            altres = 0;
        }

    }
}
