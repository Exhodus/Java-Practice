package Joel.Recursibitat;

import java.util.Scanner;

public class PotenciaDeUnNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        int base = scan.nextInt();
        System.out.println("Introduce la potencia: ");
        int potencia = scan.nextInt();
        int resultado = recursividad(base,potencia);
        System.out.println("El resultado de "+base+" elevado a "+potencia+" es: "+ resultado);
    }

    private static int recursividad(int base, int potencia) {
        if(potencia == 0){
            return 1;
        } else {
            return base*recursividad(base,potencia-1);
        }
    }
}
