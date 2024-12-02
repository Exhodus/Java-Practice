package Joel.Matrius;

import java.util.Scanner;

public class EleccionsConsellEscolar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        String[][] bulleti = new String[num][num];

        for(int i = 0; i < bulleti.length; i++){
            for(int j = 0; j < bulleti[0].length; j++){
                if(i == 0 || i == bulleti.length-1){
                    bulleti[i][j] = "X";
                }else if(j == 0 || j == bulleti[0].length-1){
                    bulleti[i][j] = "X";
                } else if( j == i || i == bulleti[0].length-(j+1)) {
                    bulleti[i][j] = "X";
                } else {
                    bulleti[i][j] = ".";
                }
            }
        }

        for(int i = 0; i < bulleti.length; i++){
            for(int j = 0; j < bulleti[0].length; j++){
                System.out.print(bulleti[i][j]);
            }
            System.out.println();
        }
    }
}
