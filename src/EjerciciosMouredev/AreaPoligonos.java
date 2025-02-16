package EjerciciosMouredev;

import java.util.Scanner;

/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */

public class AreaPoligonos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce la base de la figura: ");
        int base = scan.nextInt();
        System.out.print("Introduce la altura de la misma: ");
        int altura = scan.nextInt();

        System.out.println("Qué tipo de figura es? ");
        System.out.println("1- Triángulo");
        System.out.println("2- Cuadrado");
        System.out.println("3- Rectángulo");
        int poligono = scan.nextInt();

        int resultado = calcularArea(base,altura,poligono);

        System.out.println("El resultado es: "+ resultado);
    }

    private static int calcularArea(int base, int altura, int poligono) {
        if(poligono == 1){
            return (base*altura)/2;
        } else {
            return base*altura;
        }
    }
}
