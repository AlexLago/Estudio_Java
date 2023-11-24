package graficos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class PruebaImagen2 {
    
    public static void main(String[] args) {
        


    }

}

class Frame extends JFrame {

    public Frame() {

        setTitle("Prueba Imagen");
        setBounds(200, 300, 300, 300);

    }

}

class Lamina extends JTable {

    private Image imagen;

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        File direccion = new File("Estudio_Java\\src\\graficos\\material\\imagen.gif");

        try {
            imagen = ImageIO.read(direccion);
        } catch (IOException e) {
            System.out.println("No se ha encontrado la imagen");
        }

        g.drawImage(imagen, 0, 0, null);

    }

}