package Joel.Matrius;

import java.util.Scanner;

public class Pescaminas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas,filas,columnas;
        int indiceFilas,indiceColumnas;
        int contMinas = 0;

        for(int k = 0; k < casos; k++){
            entradas = scan.nextInt();
            filas = scan.nextInt();
            columnas = scan.nextInt();

            int[][] tablero = new int[filas][columnas];

            for(int i = 0; i < tablero.length; i++){
                for(int j = 0; j < tablero[0].length; j++){
                    tablero[i][j] = scan.nextInt();
                }
            }

            indiceFilas = scan.nextInt();
            indiceColumnas = scan.nextInt();

            if(tablero[indiceFilas][indiceColumnas] == 1){
                System.out.println("BOOM");
            } else {
                if(indiceFilas >= 1 && indiceColumnas >= 1) {
                    for (int i = indiceFilas - 1; i <= indiceFilas+1; i++) {
                        for (int j = indiceColumnas - 1; j <= indiceColumnas+1; j++) {
                            if (tablero[i][j] == 1) {
                                contMinas++;
                            }
                        }
                    }
                } else if(indiceFilas == 0 && indiceColumnas >= 1){
                    for (int i = indiceFilas; i <= indiceFilas+1; i++) {
                        for (int j = indiceColumnas - 1; j <= indiceColumnas+1; j++) {
                            if (tablero[i][j] == 1) {
                                contMinas++;
                            }
                        }
                    }
                } else if (indiceFilas >= 1 && indiceColumnas == 0){
                    for (int i = indiceFilas-1; i <= indiceFilas+1; i++) {
                        for (int j = indiceColumnas; j <= indiceColumnas+1; j++) {
                            if (tablero[i][j] == 1) {
                                contMinas++;
                            }
                        }
                    }
                } else {
                    for (int i = indiceFilas; i <= indiceFilas+1; i++) {
                        for (int j = indiceColumnas; j <= indiceColumnas+1; j++) {
                            if (tablero[i][j] == 1) {
                                contMinas++;
                            }
                        }
                    }
                }

                System.out.println(contMinas);
            }

            contMinas = 0;
        }
    }
}
