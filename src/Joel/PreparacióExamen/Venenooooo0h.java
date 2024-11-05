package Joel.PreparacióExamen;

import java.util.Scanner;

public class Venenooooo0h {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int vidaMax, vida, dañoRammus, dañoTwitch;
        int contRammus = 0, conTwitch = 0;
        boolean flagRam = false, flagTwi = false;

        for(int i = 0; i < casos; i++){
            vidaMax = scan.nextInt();
            dañoRammus = scan.nextInt();
            dañoTwitch = scan.nextInt();

            while (vidaMax > 0){
                vidaMax -= dañoRammus;
                contRammus++;
                if(vidaMax > 0){
                    vidaMax -= dañoTwitch;
                    conTwitch++;
                    if(vidaMax <= 0){
                        flagTwi = true;
                    }
                } else {
                    flagRam = true;
                }
            }

            if (flagRam) {
                System.out.println("RAMMUS "+contRammus);
            } else if (flagTwi){
                System.out.println("TWITCH "+ conTwitch);
            }

            contRammus = 0;
            conTwitch = 0;
            flagTwi = false;
            flagRam = false;
        }
    }
}
