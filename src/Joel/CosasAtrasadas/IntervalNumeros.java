package Joel.CosasAtrasadas;

import java.util.Scanner;

public class IntervalNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1 >= num2){
            for(int i = num1; i >= num2; i--){
                System.out.println(i);
            }
        } else {
            System.out.println("El segon numero no es mes petit que el primer");
        }
    }
}
