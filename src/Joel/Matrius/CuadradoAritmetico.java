package Joel.Matrius;

import java.util.Scanner;

public class CuadradoAritmetico {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] tablero = new int[3][3];
        boolean epa = false;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                tablero[i][j] = scan.nextInt();
            }
        }

        if(tablero[1][0] == tablero[0][0]*2 && tablero[2][0] == tablero[0][0]*3){
            if(tablero[1][1] == tablero[0][1]*2 && tablero[2][1] == tablero[0][1]*3){
                if(tablero[1][2] == tablero[0][2]*2 && tablero[2][2] == tablero[0][2]*3){
                    epa = false;
                }else {
                    epa = true;
                }
            } else {
                epa = true;
            }
        } else {
            epa = true;
        }

        if(epa){
            System.out.println("no");
        } else {
            System.out.println("si");
        }
    }
}
