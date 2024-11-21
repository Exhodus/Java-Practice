package Joel.Strings;

import java.util.Scanner;

public class Aperitivos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int suyos,cont = 1;
        String aperitivos;


        for(int i = 0; i < casos; i++){

            suyos = scan.nextInt();
            scan.nextLine();
            aperitivos = scan.nextLine();
            String[] separados = aperitivos.split(" ");

            for(int j = 0; j < separados.length; j++){
                if(cont != suyos){
                    System.out.print(separados[j]+" ");
                    cont++;
                } else {
                    cont = 1;
                }
            }
            System.out.println();
            cont = 1;
        }
    }
}
