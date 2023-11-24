package graficos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

// Un error extraño succede que al ejecutar este programa ocurren cosas anomalas, en cambio. Cuando uso la version original no ocurre ningun problema. Parece ser problema del IDE

public class PruebaImagen2 {
    
    public static void main(String[] args) {
        
        Frame frame = new Frame();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Frame extends JFrame {

    public Frame() {

        setTitle("Prueba Imagen");
        setBounds(200, 300, 300, 300);

        Lamina lamina = new Lamina();

        add(lamina);
    }

}

class Lamina extends JPanel {

    private Image imagen;

    public Lamina() {
        try {
            // Carga la imagen desde el recurso del proyecto
            imagen = ImageIO.read(getClass().getResource("/graficos/material/imagen.gif")); // Repasar esta estructura
        } catch (IOException e) {
            System.out.println("No se ha encontrado la imagen");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
    }

}