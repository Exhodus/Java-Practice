package Joel.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class PincheFurro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> furros = new ArrayList<>();
        int casos = scan.nextInt();
        scan.nextLine();
        String ruidos;
        boolean pana = false;
        int contR = 0;

        for(int i = 0; i < casos; i++){
            ruidos = scan.nextLine();
            String[] expresiones = ruidos.split(" ");

            for(int j = 0; j < expresiones.length; j++){
                switch (expresiones[j].charAt(0)){
                    case 'm':
                        if(expresiones[j].contains("meow")){
                            furros.add(expresiones[j]);
                        }
                        break;
                    case 'g':
                        for(int k = 0; k < expresiones[j].length(); k++){
                            if (expresiones[j].charAt(k) == 'r'){
                                contR++;
                            }
                        }

                        if(contR == 3){
                            furros.add(expresiones[j]);
                        }
                        break;
                    case 'w':
                        if(expresiones[j].contains("woof")){
                            furros.add(expresiones[j]);
                        }
                        break;
                    case 'H':
                        if(expresiones[j].equals("Hector")){
                            pana = true;
                        }
                }
            }

            if(pana){
                System.out.println("Gato pasando por el campo de batalla");
            } else {
                if(furros.isEmpty()){
                    System.out.println("No hay Furros cerca");
                } else {
                    System.out.println(furros);
                }
            }

            pana = false;
            furros.clear();
            contR = 0;
        }
    }
}
