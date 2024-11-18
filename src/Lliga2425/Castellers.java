package Lliga2425;

import java.util.Scanner;

public class Castellers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int[] collaA = new int[4];
        int[] collaB = new int[4];
        boolean error = false;
        int equipA = 0, equipB = 0, equipBoomer = 0, equipJoves = 0;

        for (int i = 0; i < casos; i++){

            for(int j = 0; j < collaA.length; j++){
                collaA[j] = scan.nextInt();
            }
            for(int j = 0; j < collaB.length; j++){
                collaB[j] = scan.nextInt();
            }

            if( collaA[0] < collaA[1] || collaA[2] < collaA[3] || collaB[0] < collaB[1]||
                    collaB[2] < collaB[3]){
                error = true;
            } else {
                equipA += collaA[1] + collaA[3];
                equipB += collaB[1] + collaB[3];
                equipBoomer += collaA[1] + collaB[1];
                equipJoves += collaA[3] + collaB[3];
            }

        }

        if(error){
            System.out.println("ERROR");
        } else {
            if (equipA > equipB){
                System.out.println("A");
            } else {
                System.out.println("B");
            }

            if(equipBoomer > equipJoves){
                System.out.println("BOOMERS");
            } else {
                System.out.println("MILENIALS");
            }
        }

    }
}
