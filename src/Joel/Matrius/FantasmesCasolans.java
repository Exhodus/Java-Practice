package Joel.Matrius;

import java.util.Scanner;

public class FantasmesCasolans {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int filas,columnas,fantasmas;
        int indiceFila, indiceColumna;
        int indiceFilaMio = 0, indiceColumnaMio=0;

        boolean asalvo = false;


        for(int k = 0; k < casos; k++){

            filas = scan.nextInt();
            columnas = scan.nextInt();
            fantasmas = scan.nextInt();

            String[][] tablero = new String[filas][columnas];

            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[0].length; j++){
                    if( i == 0 || i == tablero.length-1){
                        tablero[i][j] = "-";
                    } else if (j == 0|| j == tablero[0].length-1){
                        tablero[i][j] = "|";
                    } else {
                        tablero[i][j] = "0";
                    }
                }
            }

            for(int i = 0; i < fantasmas; i++){
                indiceFila = scan.nextInt();
                indiceColumna = scan.nextInt();

                if( i == 0) {
                    tablero[indiceFila][indiceColumna] = "1";
                    indiceColumnaMio = indiceColumna;
                    indiceFilaMio = indiceFila;
                } else {
                    tablero[indiceFila][indiceColumna] = "2";
                }
            }

           if(tablero[indiceFilaMio-1][indiceColumnaMio].equals("0")){
                asalvo = true;
            } else if(tablero[indiceFilaMio][indiceColumnaMio-1].equals("0")){
                asalvo = true;
            } else if(tablero[indiceFilaMio][indiceColumnaMio+1].equals("0")){
                asalvo = true;
            } else if(tablero[indiceFilaMio+1][indiceColumnaMio].equals("0")){
                asalvo = true;
            }


            if(asalvo){
                System.out.println("THIS IS FINE");
            } else {
                System.out.println("OH NO");
            }

            asalvo = false;
        }
    }
}
