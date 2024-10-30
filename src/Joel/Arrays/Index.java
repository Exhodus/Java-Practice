package Joel.Arrays;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades,index, cont = -1;
        boolean flag = false;


        for( int i = 0; i < casos; i++){
            entrades = scan.nextInt();
            int[] num = new int[entrades];

            for(int j = 0; j < num.length; j++){
                num[j] = scan.nextInt();
            }

            index = scan.nextInt();

            for(int j = 0; j < num.length; j++){
                if(num[j] == index && !flag){
                    cont = j;
                    flag = true;
                }
            }

            System.out.println(cont);
            cont = -1;
            flag = false;

        }
    }
}
