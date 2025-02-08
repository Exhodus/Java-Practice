package Joel.Recursibitat;

import java.util.Scanner;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        int numDig = 0;
        System.out.println("El numero "+num+" tiene "+contar(num,numDig)+" digitos.");
    }

    private static int contar(String num, int numDig) {
        if(numDig == num.length()){
            return 0;
        } else {
            return contar(num, numDig+1)+1;
        }
    }
}
