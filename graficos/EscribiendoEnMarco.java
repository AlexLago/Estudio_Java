package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

    public static void main(String[] args) {
        
        MarcoConTexto mi_marco = new MarcoConTexto();

        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}

class MarcoConTexto extends JFrame {

    public MarcoConTexto() {

        setVisible(true);
        setSize(600, 450);
        setLocation(400, 200);
        setTitle("Título");

    }

}

class Lamina extends JPanel {

    public void paintComponent(Graphics grafico) {
        
        

    }

}