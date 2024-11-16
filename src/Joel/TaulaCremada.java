package Joel;

import java.util.ArrayList;
import java.util.Scanner;

public class TaulaCremada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrada1, entrada2;
        ArrayList<Integer> posicionX = new ArrayList<Integer>();
        ArrayList<Integer> posicionY = new ArrayList<Integer>();
        boolean lineaRecta = false;
        int cont = 0;

        while (casos > 0) {
            entrada1 = scan.nextInt();
            entrada2 = scan.nextInt();

            posicionX.add(entrada1);
            posicionY.add(entrada2);
            casos--;
        }

        for (int i = 0; i < posicionX.size(); i++) {
            for(int j = 0; j < posicionY.size(); j++) {
                if(posicionX.get(i) == posicionX.get(j-1)) {
                    cont++;
                }
            }
        }
    }
}
