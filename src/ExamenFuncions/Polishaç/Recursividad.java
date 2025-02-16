package ExamenFuncions.Polishaç;

import java.util.Scanner;

public class Recursividad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String combo = scan.nextLine();
        int cont = 0;
        if(combaso(combo,cont)){
            System.out.println("SUPER COMBASO GALAXIAAL!!");
        } else{
            System.out.println("Casi");
        }
    }

    private static boolean combaso(String combo, int cont) {
        if(combo.length()== 1){
            return true;
        } else if (combaso(combo,cont-1) )
    }
}
