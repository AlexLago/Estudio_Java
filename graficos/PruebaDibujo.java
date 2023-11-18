package graficos;

import javax.swing.*;
import java.awt.*;

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

        g.drawRect(50, 50, 200, 200); // No es una línea. Es un rectángulo
        g.drawLine(100, 100, 300, 200); // Esto sí que es una línea recta

    }

}