package Joel.PreparaciÃ³Examen;

import java.util.Scanner;

public class BasketMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas, v = 0,l = 0;
        String cosa;

        for(int i = 0; i< casos;i++){
            entradas = scan.nextInt();
            scan.nextLine();
            for(int j = 0; j < entradas; j++){
                cosa = scan.nextLine();
                String[] separats = cosa.split(" ");
                if(separats[0].equals("L")){
                    l += Integer.parseInt(separats[1]);
                } else {
                    v += Integer.parseInt(separats[1]);
                }
            }
            if (l > v){
                System.out.println("L "+l+" "+v);
            } else if( v > l){
                System.out.println("V "+ l + " "+v);
            }else{
                System.out.println("E "+l+" "+v);
            }

            l = 0;
            v = 0;
        }
    }
}
