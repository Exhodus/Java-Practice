package Lliga2425;

import java.util.Scanner;

public class NombreUsuario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nombre = scan.nextLine();
        StringBuilder usuario = new StringBuilder("");
        boolean igual = false;
        int cont = 0;

        for(int i = 0; i < nombre.length(); i++){
            for(int j = 0; j < nombre.length(); j++){
                if(nombre.charAt(i) == nombre.charAt(j)){
                    igual = true;
                }
            }

            if(!igual){
                usuario.append(nombre.charAt(i));
                cont++;
            }
        }

        if(usuario.length() < 9){
            usuario.insert(cont,"0"+usuario);
        } else if(usuario.length() > 9){
            for(int i = 11; i <usuario.length(); i++){
                usuario.delete(i,i+1);
            }
        }

        System.out.println(usuario);

    }
}
