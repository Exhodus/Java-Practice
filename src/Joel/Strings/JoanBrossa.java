package Joel.Strings;

import java.util.Scanner;

public class JoanBrossa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt(),gran = -1;
        scan.nextLine();
        String frase;
        int[] vocals = new int[5];

        for(int j = 0; j < casos; j++){
            frase = scan.nextLine();

            for(int k = 0; k < frase.length(); k++){
                switch (frase.charAt(k)){
                    case 'a':
                        vocals[0]++;
                        break;
                    case 'e':
                        vocals[1]++;
                        break;
                    case 'i':
                        vocals[2]++;
                        break;
                    case 'o':
                        vocals[3]++;
                        break;
                    case 'u':
                        vocals[4]++;
                        break;
                }
            }

            for(int i = 0; i < vocals.length; i++){
                if(vocals[i] > gran || gran == -1){
                    gran = i;
                }
            }
            if(gran == 0){
                System.out.println("Vocal guanyadora: a");
            } else if(gran == 1){
                System.out.println("Vocal guanyadora: e");
            } else if (gran == 2) {
                System.out.println("Vocal guanyadora: i");
            } else if(gran == 3){
                System.out.println("Vocal guanyadora: o");
            } else {
                System.out.println("Vocal guanyadora: u");
            }

            vocals[0] = 0;
            vocals[1] = 0;
            vocals[2] = 0;
            vocals[3] = 0;
            vocals[4] = 0;
            gran = -1;
        }
    }
}
