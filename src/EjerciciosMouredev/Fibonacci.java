package EjerciciosMouredev;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Fibonacci {
    public static void main(String[] args) {
        long primer = 0;
        long segundo = 1;
        long resultado = 0;
        for(int i = 0; i < 50; i++){
            resultado = primer+ segundo;
            primer = segundo;
            segundo = resultado;
            System.out.println(resultado);
        }
    }
}
