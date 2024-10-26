package Joel;

import java.util.Scanner;

public class DibuixarTriangles2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                if(j == i){
                    System.out.print(j);
                } else {
                    System.out.print(j+", ");
                }
            }
            System.out.println();
        }
    }
}
