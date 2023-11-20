package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PruebaDibujo {
    
    public static void main(String[] args) {
        
        MarcoConDibujos mi_marco = new MarcoConDibujos();

        mi_marco.setVisible(true);
        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoConDibujos extends JFrame {

    public MarcoConDibujos() {

        setTitle("Prueba de Dibujo");
        setSize(400, 400);

        LaminaConFiguras mi_lamina = new LaminaConFiguras();

        add(mi_lamina);

    }

}

class LaminaConFiguras extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        /*g.drawRect(50, 50, 200, 200); // No es una línea. Es un rectángulo
        g.drawLine(50, 50, 250, 250); // Esto sí que es una línea recta
        g.drawArc(50, 50, 200, 200, 100, 150);*/

        Graphics2D g2 = (Graphics2D) g;

        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150 );

        g2.draw(rectangulo);

        Ellipse2D elipse = new Ellipse2D.Double();

        elipse.setFrame(rectangulo);

        g2.draw(elipse);

        g2.draw(new Line2D.Double(100, 100, 300, 250));

        double centro_en_x = rectangulo.getCenterX();
        double centro_en_y = rectangulo.getCenterY();

    }

}