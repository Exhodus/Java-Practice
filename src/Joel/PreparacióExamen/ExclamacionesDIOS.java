package Joel.PreparacióExamen;

import java.util.Scanner;

public class ExclamacionesDIOS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String entrada = scan.nextLine();
        int arriba = 0, abajo = 0;

        while (!entrada.equals("FIN")){
            for(int i = 0; i < entrada.length(); i++){
                if(entrada.charAt(i) == '!'){
                    abajo++;
                } else if( entrada.charAt(i) == '¡'){
                    arriba++;
                }
            }

            if(abajo == arriba){
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            arriba = 0;
            abajo = 0;
            entrada = scan.nextLine();
        }
    }
}
