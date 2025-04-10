package Joel.Llistes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ActivitatsCampaments {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int numActivitats = 0;
        int alumnesActivitat = 0;

        for(int i = 0; i  < casos; i++){
            scan.nextLine();
            ArrayList<String> alumnes = new ArrayList<>(List.of(scan.nextLine().split(" ")));
            numActivitats = scan.nextInt();
            int numAlumnesQuedan = alumnes.size();
            ArrayList<String> alumnesCadaActivitat = new ArrayList<>();
            for(int j = 0; j < numActivitats; j++){
                alumnesActivitat = scan.nextInt();
                while(alumnesActivitat > 0) {
                        alumnesCadaActivitat.add(alumnes.get(0));
                        alumnes.remove(0);
                        alumnesActivitat--;
                }
                System.out.println("Activitat " + (j+1) + ": " + alumnesCadaActivitat);
                alumnesCadaActivitat.clear();
            }
            if(alumnes.isEmpty()){
                System.out.println("Tots els nens han estat assignats.");
            } else {
                System.out.println("Nens sobrants: "+ alumnes);
            }
        }
    }
}
