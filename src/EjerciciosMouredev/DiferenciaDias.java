package EjerciciosMouredev;

import java.util.Scanner;

/*
 * Crea una función que calcule y retorne cuántos días hay entre dos cadenas
 * de texto que representen fechas.
 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * - La función recibirá dos String y retornará un Int.
 * - La diferencia en días será absoluta (no importa el orden de las fechas).
 * - Si una de las dos cadenas de texto no representa una fecha correcta se
 *   lanzará una excepción.
 */
public class DiferenciaDias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fecha1 = scan.nextLine();
        String fecha2 = scan.nextLine();
        int resultado = compararFechas(fecha1, fecha2);
        System.out.println(resultado);
    }

    private static int compararFechas(String fecha1, String fecha2) {
        int resultado = 0;
        String[] fecha1Sep = fecha1.split("/");
        String[] fecha2Sep = fecha2.split("/");
        int[] fecha1Int = new int[3];
        int[] fecha2Int = new int[3];
        for(int i = 0; i < 3; i++){
            fecha1Int[i] = Integer.parseInt(fecha1Sep[i]);
            fecha2Int[i] = Integer.parseInt(fecha2Sep[i]);
        }

        if(fecha1Int[2] >= fecha2Int[2]){
            if(fecha1Int[1] >= fecha2Int[1]){
                if(fecha1Int[0] >= fecha2Int[0]){
                    resultado += fecha1Int[0] - fecha2Int[0];
                } else {
                    resultado += fecha2Int[0] - fecha1Int[0];
                }

                resultado += (fecha1Int[1]- fecha2Int[1])* 30;
            }  else {
                if(fecha1Int[0] >= fecha2Int[0]){
                    resultado += fecha1Int[0] - fecha2Int[0];
                } else {
                    resultado += fecha2Int[0] - fecha1Int[0];
                }
                resultado += (fecha2Int[1]- fecha1Int[1])* 30;
            }

            resultado += (fecha1Int[2] - fecha2Int[2]) * 360;
        } else {
            if(fecha1Int[1] >= fecha2Int[1]){
                if(fecha1Int[0] >= fecha2Int[0]){
                    resultado += fecha1Int[0] - fecha2Int[0];
                } else {
                    resultado += fecha2Int[0] - fecha1Int[0];
                }

                resultado += (fecha1Int[1]- fecha2Int[1])* 30;
            }  else {
                if(fecha1Int[0] >= fecha2Int[0]){
                    resultado += fecha1Int[0] - fecha2Int[0];
                } else {
                    resultado += fecha2Int[0] - fecha1Int[0];
                }
                resultado += (fecha2Int[1]- fecha1Int[1])* 30;
            }
            resultado += (fecha2Int[2] - fecha1Int[2]) * 360;
        }


        return resultado;
    }
}
