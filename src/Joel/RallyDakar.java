package Joel;

import java.util.Scanner;

public class RallyDakar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        int velMax = 0,march = 0,vel = 0,cont = 0;
        String marchas;

        for(int i = 0; i < casos; i++){
            marchas = scan.nextLine();
            String[] arrMarchas = marchas.split(" ");

            velMax = Integer.parseInt(arrMarchas[0]);

            for(int j = 1; j < arrMarchas.length; j++){
                march = Integer.parseInt(arrMarchas[j]);
                cont++;

                switch (march){
                    case 1:
                        vel += velMax;
                        break;
                    case 2:
                        vel += velMax/2;
                        break;
                    case 3:
                        vel += velMax/4;
                        break;
                }
            }
            vel = vel/cont;
            System.out.println(vel);

            vel = 0;
            cont = 0;
        }
    }
}
