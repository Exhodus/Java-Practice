package Joel.PilasCuas;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Gymcana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        int numEntradas;
        String entrada;

        for(int i = 0; i < casos; i++){
            numEntradas = scan.nextInt();
            scan.nextLine();

            entrada = scan.nextLine();
            String[] sep = entrada.split("");
            int cont = 1;
            ArrayDeque<Integer> cua = new ArrayDeque<>();
            for(int j = 0; j < numEntradas; j++){
                cua.add(cont);
                cont++;
            }
            for(int j = 0; j < sep.length; j++){
                switch (sep[j]){
                    case "S":
                        if(!cua.isEmpty()) {
                            cua.pop();
                        }
                        break;
                    case "N":
                        int aux = cua.pop();
                        cua.add(aux);
                        break;
                    case "E":
                        cua.add(cont);
                        cont++;
                        break;
                }
            }

            System.out.println(cua.pop());
        }
    }
}
