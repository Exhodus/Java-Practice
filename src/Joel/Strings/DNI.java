package Joel.Strings;

import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String dni;
        String numDNI = "";
        boolean caracter = false;

        for(int i = 0; i < casos; i++){
            dni = scan.nextLine();
            char letra = dni.charAt(dni.length()-1);

            for(int j = 0; j < dni.length()-1; j++){
                numDNI+= dni.charAt(j);
            }

            int numero = Integer.parseInt(numDNI);

            switch (numero%23){
                case 0:
                    if(letra != 'T'){
                        caracter = true;
                    }
                    break;
                case 1:
                    if(letra != 'R'){
                        caracter = true;
                    }
                    break;
                case 2:
                    if(letra != 'W'){
                        caracter = true;
                    }
                    break;
                case 3:
                    if(letra != 'A'){
                        caracter = true;
                    }
                    break;
                case 4:
                    if(letra != 'G'){
                        caracter = true;
                    }
                    break;
                case 5:
                    if(letra != 'M'){
                        caracter = true;
                    }
                    break;
                case 6:
                    if(letra != 'Y'){
                        caracter = true;
                    }
                    break;
                case 7:
                    if(letra != 'F'){
                        caracter = true;
                    }
                    break;
                case 8:
                    if(letra != 'P'){
                        caracter = true;
                    }
                    break;
                case 9:
                    if(letra != 'D'){
                        caracter = true;
                    }
                    break;
                case 10:
                    if(letra != 'X'){
                        caracter = true;
                    }
                    break;
                case 11:
                    if(letra != 'B'){
                        caracter = true;
                    }
                    break;
                case 12:
                    if(letra != 'N'){
                        caracter = true;
                    }
                    break;
                case 13:
                    if(letra != 'J'){
                        caracter = true;
                    }
                    break;
                case 14:
                    if(letra != 'Z'){
                        caracter = true;
                    }
                    break;
                case 15:
                    if(letra != 'S'){
                        caracter = true;
                    }
                    break;
                case 16:
                    if(letra != 'Q'){
                        caracter = true;
                    }
                    break;
                case 17:
                    if(letra != 'V'){
                        caracter = true;
                    }
                    break;
                case 18:
                    if(letra != 'H'){
                        caracter = true;
                    }
                    break;
                case 19:
                    if(letra != 'L'){
                        caracter = true;
                    }
                    break;
                case 20:
                    if(letra != 'C'){
                        caracter = true;
                    }
                    break;
                case 21:
                    if(letra != 'K'){
                        caracter = true;
                    }
                    break;
                case 22:
                    if(letra != 'E'){
                        caracter = true;
                    }
                    break;
            }

            if(caracter){
                System.out.println("invalid");
            } else {
                System.out.println("valid");
            }

            caracter = false;
            numDNI = "";
        }
    }
}