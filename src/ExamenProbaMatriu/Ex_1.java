package ExamenProbaMatriu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int entradas = scan.nextInt();
        HashMap<String,Integer> clases = new HashMap<>();
        scan.nextLine();

        for(int i = 0; i < entradas; i++){
            String[] separats = scan.nextLine().split(" ");
            clases.put(separats[0],Integer.parseInt(separats[1]));
        }

        for(Map.Entry<String,Integer> entry : clases.entrySet()){
            if(entry.getValue() > 0){
                System.out.println(entry.getKey());
            }
        }
    }
}
