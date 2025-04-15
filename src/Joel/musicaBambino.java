package Joel;

import java.util.*;

public class musicaBambino {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        scan.nextLine();
        String entrada = "";
        String[] octavas = {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B"};

        for(int i = 0; i < casos; i++){
            entrada = scan.nextLine();
            String[] sep = entrada.split(" ");
            HashMap<String, Integer> notas = new HashMap<>();
            int cont = 0;
            int suma = 0;
            for(int j = 0; j < octavas.length; j++){
                boolean acabado = false;
                if(octavas[j].equals(sep[0])){
                    for(int k = j+1; k < octavas.length; k++){
                        if(octavas[k].equals(sep[1])){
                            cont++;
                            suma += cont;
                            cont = 0;
                        } else if(octavas[k].equals(sep[2])){
                            cont++;
                            suma += cont;
                            cont = 0;
                        } else if (octavas[k].equals(sep[3])){
                            cont++;
                            suma += cont;
                            acabado = true;
                            k = 11;
                        } else {
                            cont++;
                        }
                        if(k == 11 && !acabado){
                            k = 0;
                        }
                    }
                }
            }

            System.out.println(suma);
            /*

            for(int j = 0; j < sep.length; j++){
                for(int k = 0; k < octavas.length; k++){
                    if(sep[j].equals(octavas[k])){
                        notas.put(sep[j], k);
                    }
                }
            }

            int suma = 0;
            for (int j = 1; j < notas.size(); j++) {
                if(notas.get(j) > notas.get(j-1)){
                    suma += notas.get(j-1)+ notas.get(j);
                } else {

                }
            }
            System.out.println(suma);
            System.out.println(notas);

             */
        }
    }
}
