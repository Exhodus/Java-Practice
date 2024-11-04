package Joel;

import java.util.Arrays;
import java.util.Scanner;

public class CodiDeBarres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int[] codi = new int[11];
        int sum = 0, cont = 0;

        for(int i = 0; i < casos; i++){

            for(int j = 0; j < codi.length; j++){
                codi[j] = scan.nextInt();
            }

            for(int j = 1; j < codi.length; j+=2){
                sum += codi[j];
            }
            sum *= 3;

            for(int j = 2; j <= codi.length; j+=2){
                sum += codi[j];
            }

            while (sum % 10 != 0){
                cont++;
                sum++;
            }

            System.out.println(Arrays.toString(codi) +" "+cont);
            cont = 0;
            sum = 0;
        }
    }
}
