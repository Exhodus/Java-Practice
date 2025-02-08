package Joel.Recursibitat;

import java.util.Scanner;

public class SumarArrya {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[6];
        System.out.println("introduce 6 numeros: ");
        array[0] = scan.nextInt();
        array[1] = scan.nextInt();
        array[2] = scan.nextInt();
        array[3] = scan.nextInt();
        array[4] = scan.nextInt();
        array[5] = scan.nextInt();
        int i = array.length-1;

        System.out.println("La suma de los numeros es: "+ sumar(array,i));
    }

    private static int sumar(int[] array, int i) {
        if(i == 0){
            return array[i];
        } else {
            return array[i]+sumar(array,i-1);
        }
    }
}
