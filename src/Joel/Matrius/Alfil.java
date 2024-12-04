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


            int cont = 1;
            int suma = 0;

            //Diagonal superior Derecha

            while((filas-cont >= 0 && filas < tablero.length) && (columnas >= 0 && columnas+cont  < tablero[0].length)){
                cont++;
                suma ++;
            }

            //Diagonal Inferior Derecha

            cont = 1;
            while((filas >= 0 && filas+cont < tablero.length) && (columnas >= 0 && columnas+cont< tablero[0].length)){

                cont++;
                suma ++;
            }

            //Diagonal Inferior Izquierda

            cont = 1;
            while((filas >= 0 && filas+cont < tablero.length) && (columnas-cont >= 0 && columnas< tablero[0].length)){

                cont++;
                suma ++;
            }

            //Diagonal Superior Izquierda

            cont = 1;
            while((filas-cont >= 0 && filas < tablero.length) && (columnas-cont >= 0 && columnas< tablero[0].length)){

                cont++;
                suma ++;
            }

            System.out.println(suma);

            suma = 0;
        }
    }
}
