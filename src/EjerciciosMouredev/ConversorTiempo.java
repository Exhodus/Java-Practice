package EjerciciosMouredev;

import java.util.Scanner;

/*
 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 */
public class ConversorTiempo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Intorduce los dias: ");
        int dias = scan.nextInt();
        System.out.println("Intorduce las horas: ");
        int horas = scan.nextInt();
        System.out.println("Intorduce los minutos: ");
        int minutos = scan.nextInt();
        System.out.println("Intorduce los segundos: ");
        int segundos = scan.nextInt();

        long milisegundos = calcularSegundos(segundos);
        milisegundos += calcularMinutos(minutos);
        milisegundos += calcularHoras(horas);
        milisegundos += calcularDias(dias);

        System.out.println(milisegundos);
    }

    private static long calcularDias(int dias) {
        return (((dias * 24L) * 60) * 60) * 1000;
    }

    private static long calcularHoras(int horas) {
        return ((horas * 60L) * 60) * 1000;
    }

    private static long calcularMinutos(int minutos) {
        return (minutos * 60L) * 1000;
    }

    private static long calcularSegundos(int segundos) {
        return segundos* 1000L;
    }
}
