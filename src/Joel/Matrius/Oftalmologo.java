package Joel.Matrius;

import java.util.Scanner;

public class Oftalmologo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String orient = scan.nextLine();
        String[] pasos = orient.split("");

        int[][] mat = new int[2][2];

        mat[0][0] = 1;
        mat[0][1] = 2;
        mat[1][0] = 3;
        mat[1][1] = 4;

        int aux = 0;

        for(int i = 0; i < pasos.length; i++){
            if(pasos[i].equals("H")){
                aux = mat[0][0];
                mat[0][0] = mat[1][0];
                mat[1][0] = aux;
                aux = mat[0][1];
                mat[0][1] = mat[1][1];
                mat[1][1] = aux;
            } else if (pasos[i].equals("V")){
                aux = mat[0][0];
                mat[0][0] = mat[0][1];
                mat[0][1] = aux;
                aux = mat[1][0];
                mat[1][0] = mat[1][1];
                mat[1][1] = aux;

            }

        }

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
