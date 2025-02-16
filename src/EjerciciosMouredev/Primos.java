package EjerciciosMouredev;

/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        boolean flag = false;

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                flag = true;
            }
        }

        if(flag){
            System.out.println("No es primo.");
        } else {
            System.out.println("Es primo.");
        }

        flag = false;

        for(int i = 1; i < 100; i++){
            for(int j = 2; j < i; j++){
                if( i % j == 0){
                    flag = true;
                }
            }

            if(!flag){
                System.out.println(i);
            }

            flag = false;
        }
    }
}
