package graficos;

import javax.swing.*;
import java.awt.*;
import java.io.*;

import javax.imageio.*;

public class PruebaImagenes2 {
    
    public static void main(String[] args) {
        
        MarcoImagen mi_marco = new MarcoImagen();
        
        mi_marco.setVisible(true);
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoImagen extends JFrame {

    public MarcoImagen() {

        setTitle("Marco con Imagen");
        setBounds(500,50,900,900);

        LaminaConImagen mi_lamina = new LaminaConImagen();

        add(mi_lamina);

    }

}

class LaminaConImagen extends JPanel {

    private Image imagen;

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        File mi_imagen = new File("Estudio_Java\\src\\graficos\\material\\imagen.png");

        try {
            imagen = ImageIO.read(mi_imagen);
        } catch (IOException e) {
            System.out.println("No se ha hallado la imagen deseada");
        }

        g.drawImage(imagen, 5, 5, null);

    }

}