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

    }

}

class LaminaConFiguras extends JPanel {

    public void paintComponent(Graphics g) {

        

    }

}