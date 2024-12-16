package Joel.Matrius;

import java.util.Scanner;

public class JocDeLaVida {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int files = scan.nextInt();
        int columnes = scan.nextInt();
        int[][] tablero = new int[files][columnes];
        int[][] fin = new int[files][columnes];
        String[] sep = new String[columnes];
        int[] numeros = new int[columnes];
        scan.nextLine();

        for(int k = 0; k < files; k++){
            String num = scan.nextLine();
            sep = num.split("");
            for(int i = 0; i < columnes; i++){
                tablero[k][i] = Integer.parseInt(sep[i]);
            }
        }

        for(int i = 0; i < fin.length; i++){
            for(int j =0  ; j < fin[0].length; j++){
                fin[i][j] = 0;
            }
        }

        int cont = 0;

        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                //Recorro la matriz a 1 espacio de radio por cada posicion
                for(int k = i-1; k < i+2; k++){
                    for(int l = j-1; l < j+2 ; l++){
                        boolean estoyFuerisima = ohno(tablero,k,l);
                        if(!estoyFuerisima && tablero[k][l] == 1 && (tablero[k][l] != tablero[i][j])){
                            cont++;
                        }
                    }
                }

                if(tablero[i][j] == 1){
                    if(cont > 3 || cont < 2){
                        fin[i][j] = 0;
                    }
                } else {
                    if(cont == 3 || cont == 2){
                        fin[i][j] = 1;
                    }
                }
                cont = 0;
            }
        }

        printamEsta(fin);
    }

    private static void printamEsta(int[][] fin) {
        for(int i = 0; i < fin.length; i++){
            for(int j = 0; j < fin[0].length; j++){
                System.out.print(fin[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean ohno(int[][] tablero,  int k, int l) {
        if(k < 0 || k > tablero.length-1 || l < 0 || l > tablero[0].length-1){
            return true;
        } else {
            return false;
        }
    }
}
