package Joel.Recursibitat;

import java.util.Scanner;

public class SumarDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        String[] sep = num.split("");
        int i = sep.length-1;
        int resultado = sumar(sep,i);
        System.out.println(resultado);
    }

    private static int sumar(String[] sep, int i) {
        if(i == 0){
            return Integer.parseInt(sep[0]);
        } else {
            return Integer.parseInt(sep[i])+sumar(sep,i-1);
        }
    }
}
