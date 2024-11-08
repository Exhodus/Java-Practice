package Joel.Arrays;

import java.util.Scanner;

public class EscalaReal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();

        int[] arrayCartes = new int[7];
        int[] cartesOrdenades = new int[7];
        boolean flagReal = false, flagNormal = false;

        for(int i = 0 ; i < casos; i++){

            int gran = 0;
            int cont = 0;
            for(int j = 0; j < arrayCartes.length; j++){
                arrayCartes[j] = scan.nextInt();
            }

            //Le doy la vuelta al array
            for(int j = 0; j < cartesOrdenades.length; j++){

                for(int k = 0; k < arrayCartes.length; k++){
                    if (arrayCartes[k] > gran || gran == 0){
                        cartesOrdenades[j] = arrayCartes[k];
                        gran = arrayCartes[k];
                        cont = k;
                    }
                }

                arrayCartes[cont] = 0;
                gran = 0;
            }

            cont = 0;
            //Una vez ordenado como haces para saber si 2 numeros están seguidos.

            for(int j = cartesOrdenades.length -1; j > 0 ; j--){
                if(cartesOrdenades[j] == cartesOrdenades[j-1]){
                    cont++;
                }
            }

            //una vez eso como compruebas que sea real o no
            if(cartesOrdenades[0] == 13 && cartesOrdenades[1] == 12 && cartesOrdenades[2] == 11 &&
                cartesOrdenades[3] == 10 && cartesOrdenades[6] == 1){
                flagReal = true;
            } else if(cont > 4) {
                flagNormal = true;
            }

            if(flagReal){
                System.out.println("ESCALA REAL");
            } else if( flagNormal) {
                System.out.println("ESCALA");
            } else {
                System.out.println("NO");
            }

            cont = 0;
            flagReal = false;
            flagNormal = false;
        }
    }
}
