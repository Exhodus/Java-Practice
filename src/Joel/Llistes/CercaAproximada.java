package Joel.Llistes;

import java.util.Scanner;

public class CercaAproximada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades;
        int mida,marge;
        int cont = 0;

        for(int i = 0; i < casos; i++){

            entrades = scan.nextInt();
            int[] sabates = new int[entrades];

            for(int j =0; j < sabates.length; j++){
                sabates[j] = scan.nextInt();
            }

            mida = scan.nextInt();
            marge = scan.nextInt();

            int midaGran = mida+marge;
            int midaPetit = mida-marge;

            for(int j = 0; j < sabates.length; j++){
                if(sabates[j] >= midaPetit && sabates[j] <= midaGran){
                    cont++;
                }
            }

            System.out.println(cont);

            cont = 0;

        }
    }
}
