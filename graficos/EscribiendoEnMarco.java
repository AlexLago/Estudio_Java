package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

    public static void main(String[] args) {
        
        MarcoConTexto mi_marco = new MarcoConTexto();

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