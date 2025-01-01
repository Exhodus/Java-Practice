public class pruebas {
    public static void main(String[] args) {
        StringBuilder numespacio = new StringBuilder("9     .");
        String numadd = "9     .";

        System.out.println(numespacio);

        numadd += "X";
        System.out.println(numadd);

        numespacio.setCharAt(numespacio.length()-1,'X');
        System.out.println(numespacio);


        StringBuilder[][] hola = new StringBuilder[2][2];

        for(int i = 0; i < hola.length; i++){
            for(int j = 0; j < hola[0].length; j++){
                System.out.print(hola[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0; i < hola.length; i++){
            for(int j = 0; j < hola[0].length; j++){
                hola[i][j] = new StringBuilder();
            }
        }

        for(int i = 0; i < hola.length; i++){
            for(int j = 0; j < hola[0].length; j++){
                hola[i][j].append("9       ") ;
            }
        }

        for(int i = 0; i < hola.length; i++){
            for(int j = 0; j < hola[0].length; j++){
                System.out.print(hola[i][j]+" ");
            }
            System.out.println();
        }
    }
}
