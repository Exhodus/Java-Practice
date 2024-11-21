package Joel;

import java.util.Scanner;

public class PALADINDELASTORMENTAS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int ac,numDados,tipoDado,dmgMod;
        int  minDmg, dany,maxDmg;
        String entradaDau;
        String[] numDausICoses;
        String[] tipusIMod;

        for(int i = 0; i < casos ;i++){

            ac = scan.nextInt();
            scan.nextLine();
            entradaDau = scan.nextLine();
            numDausICoses = entradaDau.split("d");
            tipusIMod = numDausICoses[1].split(" \\+ ");
            numDados = Integer.parseInt(numDausICoses[0]);
            tipoDado = Integer.parseInt(tipusIMod[0]);
            dmgMod = Integer.parseInt(tipusIMod[1]);
            dany = scan.nextInt();

            maxDmg = ((numDados*tipoDado) + dmgMod)*2;
            minDmg = 0;

            if(dany <=maxDmg && dany >= minDmg){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
