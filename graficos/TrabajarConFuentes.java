package graficos;

import javax.swing.*;
import java.awt.*;

public class TrabajarConFuentes {
    
    public static void main(String[] args) {
        
        MarcoConFuentes mi_marco = new MarcoConFuentes();

        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mi_marco.setVisible(true);

    }

}

class MarcoConFuentes extends JFrame {

    public MarcoConFuentes() {

        setTitle("Prueba con Fuentes");
        setSize(400,400);

        LaminaConFuentes mi_lamina = new LaminaConFuentes();

        add(mi_lamina);

    }

}

class LaminaConFuentes extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        Font mi_fuente = new Font("Arial", Font.BOLD, 26);

        g2.setFont(mi_fuente);
        g2.setColor(Color.CYAN);
        g2.drawString("Juan", 100, 100);

    }

}