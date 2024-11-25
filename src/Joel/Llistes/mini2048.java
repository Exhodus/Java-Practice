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
                for(int j = 1; j < camp.size()-1; j++){
                    if(camp.get(j-1) == 0 && camp.get(j) != 0){
                        if(camp.get(j) == camp.get(j+1)){
                            int suma = camp.get(j)+camp.get(j+1);
                            camp.set(j-1, suma);
                            camp.remove(camp.get(j));
                            camp.remove(camp.get(j));
                        }
                    } else if(camp.get(j-1) == camp.get(j) && camp.get(j) != 0){
                        int suma = camp.get(j)+camp.get(j+1);
                        camp.set(j-1, suma);
                        camp.remove(camp.get(j));
                        j--;
                    } else if(camp.get(j+1) == camp.get(j) && camp.get(j) != 0){
                        int suma = camp.get(j)+camp.get(j+1);
                        camp.set(j, suma);
                        camp.remove(camp.get(j+1));

                    }
                    for(int k = camp.size(); k < entrades; k++){
                        camp.add(0);
                    }
                }
            } else {
                Collections.reverse(camp);
                for(int j = 1; j < camp.size()-1; j++){
                    if(camp.get(j-1) == 0 && camp.get(j) != 0){
                        if(camp.get(j) == camp.get(j+1)){
                            int suma = camp.get(j)+camp.get(j+1);
                            camp.set(j-1, suma);
                            camp.remove(camp.get(j));
                            camp.remove(camp.get(j));
                            ojo = true;
                        }
                    } else if(camp.get(j-1) == camp.get(j) && camp.get(j) != 0){
                        int suma = camp.get(j)+camp.get(j+1);
                        camp.set(j-1, suma);
                        camp.remove(camp.get(j));
                        j--;
                        ojo = true;
                    } else if(camp.get(j+1) == camp.get(j) && camp.get(j) != 0){
                        int suma = camp.get(j)+camp.get(j+1);
                        camp.set(j, suma);
                        camp.remove(camp.get(j+1));
                        ojo = true;
                    }
                    for(int k = camp.size(); k < entrades; k++){
                        camp.add(0);
                    }
                }

                if(ojo) {
                    Collections.reverse(camp);
                }
            }

            System.out.println(camp);
            camp.clear();
        }
    }
}
