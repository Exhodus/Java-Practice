package Swing;

import javax.swing.*;
import java.awt.*;

public class Ejercicio_1 {
    //Crear una ventana
    public static void main(String[] args) {
        //Ventana
        JFrame ventana = new JFrame("fraVentana");
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setLocation(400,200); //Centra la ventana relativo a la esquina superior izquierda.
        ventana.setSize(300,300);
        ventana.setMinimumSize(new Dimension(100,100));

        //Botones
        JButton btnArribaIzquierda = new JButton("botón 1");
        JButton btnArribaDrecha = new JButton("botón 2");
        JButton btnAbajoIzquierda = new JButton("botón 3");
        JButton btnAbajoDerecha = new JButton("botón 4");


        JPanel contenedorBoton1 = new JPanel(new FlowLayout(FlowLayout.LEADING,10,10));
        contenedorBoton1.add(btnArribaIzquierda);

        ventana.add(contenedorBoton1);

    }
}
