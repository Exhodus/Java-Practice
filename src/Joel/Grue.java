package Joel;

import java.util.Scanner;

public class Grue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas, x = 0, y = 0;

        for(int i = 0; i < casos; i++){

            entradas = scan.nextInt();

            int[] input = new int[entradas];
            int[] output = new int[entradas];

            for(int j = 0; j < entradas; j++){
                input[j] = scan.nextInt();
            }
            for(int j = 0; j < entradas; j++){
                output[j] = scan.nextInt();
            }

            for(int j = 0; j < input.length; j++){
                switch (input[j]){
                    case 1:
                        if(output[j] == 0){
                            y++;
                        } else if (output[j] == -1){
                            y = 0;
                            x = 0;
                        }
                        break;
                    case 2:
                        if(output[j] == 0){
                            y--;
                        } else if (output[j] == -1){
                            y = 0;
                            x = 0;
                        }
                        break;
                    case 3:
                        if(output[j] == 0){
                            x--;
                        } else if (output[j] == -1){
                            x = 0;
                            y = 0;
                        }
                        break;
                    case 4:
                        if(output[j] == 0){
                            x++;
                        } else if (output[j] == -1){
                            x = 0;
                            y = 0;
                        }
                        break;
                }
            }

            System.out.println(x+","+y);

            x = 0;
            y = 0;
        }
    }
}
