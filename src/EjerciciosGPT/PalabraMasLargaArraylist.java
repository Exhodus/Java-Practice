package EjerciciosGPT;

import java.util.ArrayList;
import java.util.Scanner;

public class PalabraMasLargaArraylist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> frase = new ArrayList<>();
        ArrayList<String> palabras = new ArrayList<>();
        int largura = 0;

        System.out.println("Introduce 5 palabras separadas por un espacio: ");
        for(int i = 0; i < 5; i++){
            frase.add(scan.next());
        }

        for(int i = 0; i < frase.size(); i++){
            if(frase.get(i).length() >= largura || largura == 0){
                largura = frase.get(i).length();
            }
        }

        for(int i = 0; i< frase.size(); i++){
            if(frase.get(i).length() == largura){
                palabras.add(frase.get(i));
            }
        }

        System.out.println(palabras);

    }
}
