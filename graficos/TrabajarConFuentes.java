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
        
    }

}
