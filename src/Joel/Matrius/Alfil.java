package Joel.Matrius;

import javax.swing.text.Style;
import java.util.Scanner;

public class Alfil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String entrada;
        for(int i = 0; i < casos; i++){
            int[][] tablero = new int[8][8];

            entrada = scan.nextLine();

            String[] filasCol = entrada.split("");

            int filas = 0;
            switch (filasCol[0]){
                case "a":
                    filas = 0;
                    break;
                case "b":
                    filas = 1;
                    break;
                case "c":
                    filas = 2;
                    break;
                case "d":
                    filas = 3;
                    break;
                case "e":
                    filas = 4;
                    break;
                case "f":
                    filas = 5;
                    break;
                case "g":
                    filas = 6;
                    break;
                case "h":
                    filas = 7;
                    break;
            }
            
            int columnas = Integer.parseInt(filasCol[1])-1;
            int cont = 0;

            for(int j = 0; j < tablero.length; j++){
                for(int k = 0; k < tablero[0].length; k++) {
                    if (j == filas && k == columnas) {
                        System.out.print("X ");
                    } else{
                        System.out.print(". ");
                    }
                }
                System.out.println();

            }

            System.out.println("----------c ");

//            for(int j = 0; j < tablero.length; j++){
//                for(int k = 0; k < tablero[0].length; k++) {
//                    if ((j != filas && k != columnas) && j == k ) {
//                        System.out.print("X ");
//                    } else if((tablero.length-j != filas && tablero[0].length-k != columnas) && j == tablero[0].length-k) {
//                        System.out.print("X ");
//                    } else{
//                        System.out.print(". ");
//                    }
//                }
//                System.out.println();
//            }

            for(int j = 0; j < tablero.length; j++ ){
                for(int k = 0; k < tablero[0].length; k++){
                    if(j == k){
                        System.out.print("X ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println();
            }

            System.out.println(cont);
        }
    }
}
