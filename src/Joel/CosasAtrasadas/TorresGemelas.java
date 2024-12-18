package Joel.CosasAtrasadas;

import java.util.Scanner;

public class TorresGemelas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numero = scan.nextLine();
        float torre1 = Float.parseFloat(numero);
        numero = scan.nextLine();
        float torre2 = Float.parseFloat(numero);

        if(torre1 > torre2){
            if(torre1-torre2 > 5){
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
        } else if( torre2 > torre1){
            if(torre2-torre1 > 5){
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
        } else {
            System.out.println("SI");
        }
    }
}
