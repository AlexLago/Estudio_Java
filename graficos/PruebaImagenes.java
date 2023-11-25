package graficos;

import javax.swing.*;
import java.awt.*;
import java.io.*;

import javax.imageio.*;

public class PruebaImagenes {
    
    public static void main(String[] args) {
        
        MarcoImagen mi_marco = new MarcoImagen();
        
        mi_marco.setVisible(true);
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoImagen extends JFrame {

    public MarcoImagen() {

        setTitle("Marco con Imagen");
        setBounds(500,50,300,200);

        LaminaConImagen mi_lamina = new LaminaConImagen();

        add(mi_lamina);

    }

}

class LaminaConImagen extends JPanel {

    private Image imagen;

    public LaminaConImagen() {
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

        for(int i=0; i<300;i++) {

            for(int j=0; j<200; j++) {

                g.copyArea(0, 0, 50, 50, i*50, j*50);

            }

        }

    }

}