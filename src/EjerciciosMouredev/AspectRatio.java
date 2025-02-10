package EjerciciosMouredev;

/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo:
 *   https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */

import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class AspectRatio {
    public static void main(String[] args) {

        try {
            URL imageUrl = new URL("https://cadenaser.com/resizer/v2/IRPN65TC4ZA45C444FCRI2MV6I.JPG?auth=c5419cb9fe2f36ae6153a4035f278a695e4d1b846fa20d6fa9ef47d87f040c19&quality=70&width=1200&height=675&focal=366,227");
            BufferedImage image = ImageIO.read(imageUrl);

            int altura = image.getHeight();
            int ancho = image.getWidth();

            boolean flag = false;
            int cont = 2;

            while (!flag){
                if(cont < altura && cont < ancho) {
                    if (altura % cont == 0 && ancho % cont == 0) {
                        altura /= cont;
                        ancho /= cont;
                        cont = 2;
                    } else {
                        cont++;
                    }
                } else {
                    flag = true;
                }
            }

            System.out.println(altura +" "+ancho);

        } catch (IOException e){
            System.out.println("Error al obtener la imagen: " + e.getMessage());
        }
    }
}
