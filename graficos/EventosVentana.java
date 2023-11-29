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

class M_Ventana implements WindowListener{

    public void windowActivated(WindowEvent e){}

    public void windowClosed(WindowEvent e){}

    public void windowClosing(WindowEvent e){}

    public void windowDeactivated(WindowEvent e){}

    public void windowDeiconified(WindowEvent e){}

    public void windowIconified(WindowEvent e){

        System.out.println("Ventana minimi... nimini... MINIMIZADA!!!");

    }

    public void windowOpened(WindowEvent e){}

}