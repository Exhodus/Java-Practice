package Proyectos;

import java.util.Scanner;

public class Ahorcado {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String palabra;
        String letra = "";
        String letrasUsadas = "";
        String[][] ahorcado = new String[10][10];
        Integer error = 0;
        boolean fi = false;

        dibujoAhorcado(ahorcado);

        System.out.println("Escribe la palabra: ");
        palabra = scan.nextLine().toUpperCase();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        printAhorcado(ahorcado);

        StringBuilder vacio = new StringBuilder();
        for(int i = 0; i < palabra.length(); i++){
            vacio.append("_");
        }

        while (!fi) {
            System.out.print("Entra una lletra: ");
            letra = scan.next().toUpperCase();
            int vigilarError = error;
            error = entrarLletra(letra,vacio,palabra,error);
            letrasUsadas += letra+" ";

            if(palabra.equals(vacio.toString())){
                fi = true;
                System.out.println("Enhorabona!");
            } else {
                if (error < 7) {
                    addDibujo(ahorcado, error, fi);
                    printAhorcado(ahorcado);
                    System.out.print(vacio + "  ");
                    System.out.println("Errores: " + error+"/7");
                    System.out.println("Letras usadas: " + letrasUsadas);
                }else {
                    fi = true;
                    System.out.println("Has Perdido. Mejor suerte en la próxima!");
                }
            }
        }

    }




    private static int entrarLletra(String letra, StringBuilder vacio, String palabra, Integer error) {

        boolean esta = false;
        for(int i = 0; i < palabra.length(); i++){
            if(palabra.charAt(i) == letra.charAt(0)){
                vacio.setCharAt(i,letra.charAt(0));
                esta = true;
            }
        }

        if(!esta){
            error++;
        }
        return error;
    }

    private static void addDibujo(String[][] ahorcado, int error, boolean fi) {
        switch (error){
            case 1:
                mastil(ahorcado);
                break;
            case 2:
                paloHorizontal(ahorcado);
                break;
            case 3:
                soga(ahorcado);
                break;
            case 4:
                cap(ahorcado);
                break;
            case 5:
                cos(ahorcado);
                break;
            case 6:
                extremitats(ahorcado);
                break;

        }
    }

    private static void extremitats(String[][] ahorcado) {
        ahorcado[6][5] = "  /";
        ahorcado[6][7] = "\\ ";
        ahorcado[7][5] = "  /";
        ahorcado[7][7] = "\\ ";
    }

    private static void cos(String[][] ahorcado) {
        ahorcado[6][6] = " | ";
    }

    private static void cap(String[][] ahorcado) {
        ahorcado[5][6] = " O ";
    }

    private static void soga(String[][] ahorcado) {
        ahorcado[3][6] = " |";
        ahorcado[4][6] = " | ";
    }

    private static void paloRefuerzo(String[][] ahorcado) {
        ahorcado[3][4] = " / ";
        ahorcado[4][4] = " / ";
    }

    private static void printAhorcado(String[][] ahorcado) {
        for(int i = 0; i < ahorcado.length; i++){
            for(int j = 0; j < ahorcado[0].length; j++){
                System.out.print(ahorcado[i][j]);
            }
            System.out.println();
        }
    }

    private static void dibujoAhorcado(String[][] ahorcado) {
        for(int i = 0; i < ahorcado.length; i++){
            for(int j = 0; j < ahorcado[0].length; j++){
                if(i == 0 || i == ahorcado.length-1){
                    ahorcado[i][j] = "---";
                } else if (j == 0 ){
                    ahorcado[i][j] = " ( ";
                } else {
                    ahorcado[i][j] = "   ";
                }
            }
        }

    }

    private static void paloHorizontal(String[][] ahorcado) {
       for(int i = 3; i < 7; i++) {
           ahorcado[2][i] = " __";
       }
    }

    private static void mastil(String[][] ahorcado) {
        for(int i = 2; i < ahorcado.length-1; i++){
            ahorcado[i][3] = " | ";
        }
    }


}
