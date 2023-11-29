package graficos;

import javax.swing.*;
import java.awt.event.*;

public class EventosVentana {
    
    public static void main(String[] args) {
        
        MarcoVentana frameVentana = new MarcoVentana();

        frameVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoVentana extends JFrame{

    public MarcoVentana() {

        setTitle("Respondiendo");
        setBounds(300, 300, 500, 350);
        setVisible(true);

    }

}