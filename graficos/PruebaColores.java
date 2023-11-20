package graficos;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PruebaColores {
    
    public static void main(String[] args) {

        MarcoConColor mi_marco = new MarcoConColor();

    }

}

class MarcoConColor extends JFrame {

    public MarcoConColor() {

        setTitle("Prueba con colores");
        setSize(400, 400);

        LaminaConColor mi_lamina = new LaminaConColor();

        add(mi_lamina);

    }

}

class LaminaConColor extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);

        g2.draw(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();

        elipse.setFrame(rectangulo);

        g2.draw(elipse);

    }

}