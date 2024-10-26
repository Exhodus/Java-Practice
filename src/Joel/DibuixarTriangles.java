package Joel;

import java.util.Scanner;

//Enter a number and make a triangle from 1 to the number
//1
//1, 2
//1, 2, 3
//1, 2, 3, 4
//1, 2, 3, 4, 5
public class DibuixarTriangles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            for (int j = i; j > 0; j--){
                if(j == 1){
                    System.out.print(j);
                } else {
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }
    }
}
