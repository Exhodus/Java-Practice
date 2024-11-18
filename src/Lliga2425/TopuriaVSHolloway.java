package Lliga2425;

import java.util.Scanner;

public class TopuriaVSHolloway {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rondas = 0;
        int minRondas = 0;
        int puntsTopura = 0, puntsHollow = 0;
        String lluitador, cop;
        boolean koTop = false, koHol = false;

        while  (rondas < 5 && (koTop == false && koHol == false)){

            lluitador = scan.nextLine();

            if(lluitador.equals("T")){
                cop = scan.nextLine();
                if(cop.equals("LK")){
                    puntsTopura +=2;
                    minRondas += 50;
                } else if (cop.equals("J")){
                    puntsTopura += 5;
                    minRondas += 150;
                } else if (cop.equals("G")){
                    puntsTopura += 10;
                    minRondas += 200;
                } else if (cop.equals("KO") && rondas >=2){
                    puntsTopura += 5000;
                    koTop = true;
                } else {
                    puntsTopura--;
                    minRondas += 120;
                }

            }else if (lluitador.equals("H")){
                cop = scan.nextLine();

                if(cop.equals("LK")){
                    puntsHollow +=2;
                    minRondas += 50;
                } else if (cop.equals("J")){
                    puntsHollow += 5;
                    minRondas += 150;
                } else if (cop.equals("G")){
                    puntsHollow += 10;
                    minRondas += 200;
                } else if (cop.equals("KO") && rondas >=2){
                    puntsHollow += 5000;
                    koHol = true;
                } else {
                    puntsHollow--;
                    minRondas += 120;
                }
            }

            if(minRondas >= 300){
                minRondas = 0;
                rondas++;
            }
        }

        if(koTop){
            System.out.println("Topuria WINS (KO)");
        } else if (koHol){
            System.out.println("Holloway WINS (KO)");
        } else {
            if(puntsTopura > puntsHollow){
                System.out.println("Topuria WINS "+puntsTopura+" - "+puntsHollow);
            } else if (puntsTopura < puntsHollow){
                System.out.println("Holloway WINS "+puntsHollow+" - "+puntsTopura);
            } else {
                System.out.println("DRAW "+puntsTopura+" - "+puntsHollow);
            }
        }
    }
}
