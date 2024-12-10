package Joel.Matrius;

import java.util.Scanner;

public class GatoEnRaya {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int filas, columnas;

        for( int k = 0; k < casos; k++){
            filas = scan.nextInt();
            columnas = scan.nextInt();
            int[][] tablero = new int[filas][columnas];
            int cont3 = 0;

            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[0].length; j++){
                    tablero[i][j] = scan.nextInt();
                }
            }



            //Por Columnas.

            for(int i = 0; i < tablero.length-2; i++){
                for(int j = 0; j < tablero[0].length; j++){
                    if (tablero[i][j] == 1) {
                        if(tablero[i + 1][j] == 1 && tablero[i + 2][j] == 1) {
                            cont3++;
                            tablero[i][j] = 0;
                            tablero[i + 1][j] = 0;
                            tablero[i + 2][j] = 0;
                        }
                    }
                }
            }

            //Por filas:
            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[0].length-2; j++){
                    if (tablero[i][j] == 1 && tablero[i][j + 1] == 1 && tablero[i][j+2] == 1) {
                        cont3++;
                        tablero[i][j] = 0;
                        tablero[i][j+1] = 0;
                        tablero[i][j+2] = 0;
                    }
                }
            }

            //Diagonal direccion inferior derecha.

//            for(int i = 0; i < tablero.length-2; i++){
//                for(int j = 0; j < tablero[0].length-2; j++){
//                    if (tablero[i][j] == 1) {
//                        if(tablero[i + 1][j] == 1 && tablero[i + 2][j] == 1)
//                            cont3++;
//                        tablero[i][j] = 0;
//                        tablero[i+1][j] = 0;
//                        tablero[i+2][j] = 0;
//                    }
//                }
//            }


            //Salida y comprobación
            System.out.println(cont3);
            System.out.println("------------------------");
            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[0].length; j++){
                    System.out.print(tablero[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
}
