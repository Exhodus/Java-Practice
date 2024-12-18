package Joel.CosasAtrasadas;

import java.util.Scanner;

public class LaVenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();

        int velJo, velAmic, velEne, distanciaEne, distanciaTorre;

        for(int i = 0; i < casos; i++){
            velJo = scan.nextInt();
            velAmic = scan.nextInt();
            velEne = scan.nextInt();
            distanciaEne = scan.nextInt();
            distanciaTorre = scan.nextInt();
            int tornsJo = 0;
            int tornsAmic = 0;
            int tornsEne = 0;

            for(int j = velJo; j < distanciaTorre; j+=velJo ){
                tornsJo++;
            }

            System.out.println(tornsJo);

            for(int j = velAmic; j < distanciaTorre; j+=velAmic ){
                tornsAmic++;
            }

            System.out.println(tornsAmic);
            if(velEne > velJo) {
                for (int j = velEne; j < distanciaEne; j = velEne - velJo) {
                    tornsEne++;
                }
            }else{
                for (int j = velEne; j < distanciaEne; j = velJo-velEne) {
                    tornsEne++;
                }
            }
            System.out.println(tornsEne);
            if(tornsJo < tornsEne && tornsAmic < tornsEne){
                System.out.println("SALVATS");
            } else if (tornsJo < tornsEne && tornsAmic > tornsEne){
                System.out.println("LA VENDA");
            } else {
                System.out.println("MORTS");
            }
        }
    }
}
