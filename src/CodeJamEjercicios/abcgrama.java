package CodeJamEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class abcgrama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entradas = scan.nextInt();
        scan.nextLine();
        boolean mal = false;
        ArrayList<String> palabras = new ArrayList<>();
        for(int i = 0; i < entradas; i++){
            palabras.add(scan.nextLine());
        }

//        for(int i = 0; i < palabras.size()-1; i++){
//            if(palabras.get(i).charAt(0) != 'ñ' && palabras.get(i+1).charAt(0) != 'ñ') {
//                if (palabras.get(i).charAt(0)+1 > palabras.get(i + 1).charAt(0) || palabras.get(i).charAt(0)+1 < palabras.get(i + 1).charAt(0)) {
//                    mal = true;
//                } else if (palabras.get(i).charAt(0) == 'z' && palabras.get(i+1).charAt(0) == 'a'){
//                    mal = false;
//                }
//            }
//        }

        if(mal || entradas == 0){
            System.out.println("NO");
        } else {
            System.out.println("SI");
        }
    }
}
