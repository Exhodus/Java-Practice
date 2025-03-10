package EjerciciosMouredev;

/*
 * Escribe una función que calcule si un número dado es un número de Armstrong
 * (o también llamado narcisista).
 * Si no conoces qué es un número de Armstrong, debes buscar información
 * al respecto.
 */

import Joel.Arrays.Index;

import java.util.ArrayList;
import java.util.Scanner;

public class NumeroAmstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //entrar numero
        //Separarlo
        //Encontrar el mas alto 0-9
        //Arraylist de numeros.
        //ir elevandolos.
        int numero = scan.nextInt();
        int numeroMasAlto = 0;
        ArrayList<Integer> numeros = new ArrayList<>();
        String numeroString = Integer.toString(numero);
        String[] numSep = numeroString.split("");
        for(int i = 0; i < numSep.length; i++){
            numeros.add(Integer.parseInt(numSep[i]));
            if(numeroMasAlto == 0 || numeros.get(i) > numeroMasAlto){
                numeroMasAlto = numeros.get(i);
            }
        }
        boolean flag = false;
        double sumaNumeros = 0;
        for(int i = 1; i < numeroMasAlto; i++){
            for(int j = 0; j < numeros.size(); j++){
                sumaNumeros +=  Math.pow(numeros.get(j),i);
            }
            if(sumaNumeros == numero){
                flag = true;
            }
            sumaNumeros = 0;
        }

        if(flag){
            System.out.println("Es un numero narcisita");
        } else {
            System.out.println("No es un numero narcisita");
        }
    }
}
