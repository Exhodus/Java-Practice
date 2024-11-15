package Joel.Arrays;

import java.util.Scanner;

public class Fanatico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int casos = scan.nextInt();
        int entradas,contFanatic = 0, contOtros = 0;
        String partido;

        for(int i = 0; i < casos; i++){
            entradas = scan.nextInt();
            scan.nextLine();
            for(int j = 0; j< entradas;j++){
                partido = scan.nextLine();
                String[] equipos = partido.split(" - ");

                if(equipos[0].equals("Fnatic") && !equipos[1].equals("Fnatic") ||
                        !equipos[0].equals("Fnatic") && equipos[1].equals("Fnatic")) {
                    if (equipos[0].equals("Fnatic")) {
                        contFanatic++;
                    } else {
                        contOtros++;
                    }
                }
            }

            System.out.println(contFanatic+" "+contOtros);
            contFanatic = 0;
            contOtros = 0;
        }
    }
}
