import java.util.Scanner;

public class aparcament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ampCoche = scan.nextInt();


        int cont = 0, posicio = 0, holder = 0;

        while (ampCoche != 0) {

            int espInicio = scan.nextInt();
            while (espInicio != 0) {
                int espFin = scan.nextInt();

                if ((espFin - espInicio) >= ampCoche + ampCoche / 2) {
                    cont++;
                    if (holder == 0) {
                        holder = espFin - espInicio;
                        posicio = cont;
                    } else {
                        if (holder > espFin - espInicio) {
                            holder = espFin - espInicio;
                            posicio = cont;
                        } else if (holder == ampCoche) {
                            posicio = cont;
                        }
                    }

                }
                espInicio = scan.nextInt();
            }

            if (cont != 0) {
                System.out.println("SI " + cont);
            } else {
                System.out.println("NO");
            }

            cont = 0;
            posicio = 0;
            holder = 0;
            ampCoche = scan.nextInt();
        }
    }
}