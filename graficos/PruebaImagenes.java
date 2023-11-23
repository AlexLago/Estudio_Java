package graficos;

import javax.swing.*;
import java.awt.*;

public class PruebaImagenes {
    
    public static void main(String[] args) {
        

        

    }

}

class MarcoImagen extends JFrame {

    public MarcoImagen() {

        setTitle("Marco con Imagen");
        setBounds(750,300,300,200);

    }

}

class LaminaConImagen extends JTable {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

    }

}