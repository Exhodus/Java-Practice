package Proyectos;

public class damas {
    public static void main(String[] args) {
        String[][] tablero = new String[17][17];
        llenarTablero(tablero);
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }

    }

    private static void llenarTablero(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[0].length; j++){
                if(j % 2 != 0){
                    if(i% 2 == 1 && j % 2 == 1){
                        tablero[i][j] = "   ";
                    } else {
                        tablero[i][j] = "---";
                    }
                } else {
                    if(i% 2 == 1 && j % 2 == 1){
                        tablero[i][j] = " ";
                    } else if (j%2 == 0 && i % 2 == 1 ){
                        tablero[i][j] = "|";
                    } else {
                        tablero[i][j] = "·";
                    }
                }
            }
        }

    }
}
