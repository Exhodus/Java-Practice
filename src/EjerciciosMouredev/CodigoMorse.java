package EjerciciosMouredev;

/*
 * Crea un programa que sea capaz de transformar texto natural a código
 * morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar
 *   la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
 *   o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en
 *   https://es.wikipedia.org/wiki/Código_morse.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodigoMorse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String,String> diccionario = new HashMap<>();

        initDiccionario(diccionario);
        String entrada = scan.nextLine().toUpperCase();

        if(entrada.matches(".*[a-zA-Z].*")){
            String salida = nomalMorse(entrada,diccionario);
            System.out.println(salida);
        } else {
            String salida = morseNormal(entrada,diccionario);
            System.out.println(salida);
        }


    }

    private static String morseNormal(String entrada, HashMap<String, String> diccionario) {
        String devuelta = "";
        String[] sep1 = entrada.split("  ");
        for(int i = 0; i < sep1.length; i++){
            String[] sep2 = sep1[i].split(" ");
            for(int j = 0; j < sep2.length; j++){
                for(Map.Entry<String,String> entry : diccionario.entrySet()){
                    if(entry.getValue().equals(sep2[j])){
                        devuelta += entry.getKey();
                    }
                }
            }
            devuelta += " ";
        }
        return devuelta;
    }

    private static String nomalMorse(String entrada, HashMap<String, String> diccionario) {
        String separado[] = entrada.split("");
        String devuelta = "";

        for(int i = 0; i < separado.length; i++){
            if(!separado[i].equals(" ")) {
                devuelta += diccionario.get(separado[i])+" ";
            } else {
                devuelta += "  ";
            }

        }

        return devuelta;
    }

    private static void initDiccionario(HashMap<String, String> diccionario) {
        diccionario.put("A",".-");
        diccionario.put("B","-...");
        diccionario.put("C","-.-.");
        diccionario.put("CH","----");
        diccionario.put("D","-..");
        diccionario.put("E",".");
        diccionario.put("F","..-.");
        diccionario.put("G","--.");
        diccionario.put("H","....");
        diccionario.put("I","..");
        diccionario.put("J",".---");
        diccionario.put("K","-.-");
        diccionario.put("L",".-..");
        diccionario.put("M","--");
        diccionario.put("N","-.");
        diccionario.put("Ñ","--.--");
        diccionario.put("O","---");
        diccionario.put("P",".--.");
        diccionario.put("Q","--.-");
        diccionario.put("R",".--");
        diccionario.put("S","...");
        diccionario.put("T","-");
        diccionario.put("U","..-");
        diccionario.put("V","...-");
        diccionario.put("W",".--");
        diccionario.put("X","-..-");
        diccionario.put("Y","-.--");
        diccionario.put("Z","--..");
        diccionario.put("0","-----");
        diccionario.put("1",".----");
        diccionario.put("2","..---");
        diccionario.put("3","...--");
        diccionario.put("4","....-");
        diccionario.put("5",".....");
        diccionario.put("6","-....");
        diccionario.put("7","--...");
        diccionario.put("8","---..");
        diccionario.put("9","----.");

    }
}
