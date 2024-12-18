package Joel.CosasAtrasadas;

import java.util.Scanner;

public class SumaPatates1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrades = scan.nextInt();
        int suma = 0;
        for(int i = 0; i < entrades; i++){
            suma += scan.nextInt();
        }
        System.out.println( suma    );
    }
}
