package Joel.Llistes;

import java.util.ArrayList;
import java.util.Scanner;

public class Frequencia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        int casos = scan.nextInt();
        int entrades;
        int[] repes = new int[10];

        for(int i = 0; i < casos; i++){
            entrades = scan.nextInt();

            for(int j = 0; j < entrades; j++){
                nums.add(scan.nextInt());
            }

            for(int j = 0; j < nums.size(); j++){
                switch (nums.get(j)){
                    case 0:
                        repes[0]++;
                        break;
                    case 1:
                        repes[1]++;
                        break;
                    case 2:
                        repes[2]++;
                        break;
                    case 3:
                        repes[3]++;
                        break;
                    case 4:
                        repes[4]++;
                        break;
                    case 5:
                        repes[5]++;
                        break;
                    case 6:
                        repes[6]++;
                        break;
                    case 7:
                        repes[7]++;
                        break;
                    case 8:
                        repes[8]++;
                        break;
                    case 9:
                        repes[9]++;
                        break;

                }
            }

            for(int j = 0; j < repes.length; j++){
                System.out.print(repes[j]+" ");
                repes[j] = 0;
            }

            nums.clear();
            System.out.println();

        }
    }
}
