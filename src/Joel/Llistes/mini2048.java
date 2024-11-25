package Joel.Llistes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class mini2048 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entrades;
        ArrayList<Integer> camp = new ArrayList<>();
        String direccio;
        boolean ojo = false;

        for(int i = 0; i < casos; i++){
            entrades = scan.nextInt();

            for(int j= 0; j < entrades; j++){
                camp.add(scan.nextInt());
            }

            scan.nextLine();
            direccio = scan.nextLine();

            if(direccio.equals("L")){
                for(int j =0; j < camp.size()-1; j++) {
                    if (camp.get(j) == 0) {
                        Collections.swap(camp, j, j + 1);
                    }

                }
                for(int j =0; j < camp.size()-1; j++){
                    if(camp.get(j)==camp.get(j+1)){
                        int suma = camp.get(j) + camp.get(j+1);
                        camp.set(j,suma);
                        camp.remove(j+1);
                        camp.add(0);

                    }
                }


                    for (int j = 0; j < camp.size()-1; j++) {
                        if (camp.get(j) == 0) {
                            Collections.swap(camp, j, j + 1);
                        }
                    }
            } else {
                for(int j =camp.size()-1; j >0; j--) {
                    if (camp.get(j) == 0) {
                        Collections.swap(camp, j, j - 1);
                    }
                }

                for(int j = camp.size()-1; j > 0; j--){
                    if(camp.get(j)==camp.get(j-1) && camp.get(j) != 0){
                        int suma = camp.get(j) + camp.get(j-1);
                        camp.set(j,suma);
                        camp.remove(j-1);
                        camp.add(0,0);
                    }
                }


                while(camp.get(camp.size()-1) == 0) {
                    for (int j = camp.size() - 1; j > 0; j--) {
                        if (camp.get(j) == 0) {
                            Collections.swap(camp, j, j - 1);
                        }
                    }
                }
            }

            for(int j = 0; j < camp.size();j++){
                System.out.print(camp.get(j)+" ");
            }
            System.out.println();
            camp.clear();
            ojo = false;
        }
    }
}
