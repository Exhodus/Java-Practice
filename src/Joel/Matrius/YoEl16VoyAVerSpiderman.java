package Joel.Matrius;

import java.util.Scanner;

public class YoEl16VoyAVerSpiderman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int filas = scan.nextInt();
        int columnas = scan.nextInt();
        scan.nextLine();
        boolean esta = false;
        int filaSpid = 0, colSpid = 0;

        String[][] horari = new String[filas][columnas];

        for(int i = 0; i < horari.length; i++){
            for(int j = 0; j < horari[0].length; j++){
                horari[i][j] = scan.next();
            }
        }

        for(int i = 0; i < horari.length; i++){
            for(int j = 0; j < horari[0].length; j++){
                if(horari[i][j].equals("SPIDERMAN")){
                    esta = true;
                    filaSpid = i;
                    colSpid = j;
                }
            }
        }

        if(esta && filaSpid != 0){
            System.out.println(horari[filaSpid-1][colSpid]);
        }else{
            System.out.println("NO");
        }
    }
}
