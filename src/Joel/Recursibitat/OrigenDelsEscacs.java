package Joel.Recursibitat;

import java.util.Scanner;

public class OrigenDelsEscacs {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        long num;
        long res = 0;
        for(int i = 0; i < casos; i++){
            num = scan.nextInt();
            long result = contar(num);
            System.out.println(result);
        }
    }

    private static long contar(long num) {
        if (num == 1){
            return 1;
        } else {
            return (long) (Math.pow(2,num) + contar(num-1));
        }
    }
}
