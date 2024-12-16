import java.util.Scanner;

public class ProvaGrau {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer[][] tauler = new Integer[input.nextInt()][input.nextInt()];
        input.nextLine();
        //introduccion de datos.
        for (int row = 0; row < tauler.length; row++) {
            String[] fila = input.nextLine().split("");
            for (int column = 0; column < tauler[0].length; column++) {
                tauler[row][column] = Integer.parseInt(fila[column]);
            }
        }

        //Cosa de mirar.
        for (int row = 0; row < tauler.length; row++) {
            for (int column = 0; column < tauler[0].length; column++) {
                int num_1s = 0;
                if (esticDintre(tauler, row - 1, column) && tauler[row - 1][column] == 1) {
                    num_1s++;
                }
                if (esticDintre(tauler, row + 1, column) && tauler[row + 1][column] == 1) {
                    num_1s++;
                }
                if (esticDintre(tauler, row, column - 1) && tauler[row][column - 1] == 1) {
                    num_1s++;
                }
                if (esticDintre(tauler, row, column + 1) && tauler[row][column + 1] == 1) {
                    num_1s++;
                }

                if (num_1s == 2 || num_1s == 3) {
                    tauler[row][column] = 1;
                } else {
                    tauler[row][column] = 0;
                }
            }
        }
        for (int row = 0; row < tauler.length; row++) {
            for (int column = 0; column < tauler[0].length; column++) {
                System.out.print(tauler[row][column]);
            }
            System.out.println();
        }
    }

    private static boolean esticDintre(Integer[][] mat, int x, int y) {
        if (0 <= x && x < mat.length && 0 <= y && y < mat[0].length) {
            return true;
        } else {
            return false;
        }
    }
}
