package graficos;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PruebaColores {
    
    public static void main(String[] args) {

        MarcoConColor mi_marco = new MarcoConColor();

        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mi_marco.setVisible(true);

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

        g2.setPaint(Color.RED);
        g2.fill(rectangulo);
        //g2.draw(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();

        elipse.setFrame(rectangulo);

        //g2.setPaint(Color.BLACK);
        g2.setPaint(new Color(0,140,255).brighter());
        g2.fill(elipse);
        //g2.draw(elipse);

    }

}