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

        M_Ventana oyenteVentana = new M_Ventana();

        addWindowListener(oyenteVentana);

    }

}

class M_Ventana implements WindowListener{

    public void windowActivated(WindowEvent e){
        System.out.println("FOR THE EMPEROOOOOOOOOOOR!!!");
    }

    public void windowClosed(WindowEvent e){}

    public void windowClosing(WindowEvent e){
        System.out.println("Sangre para el dios de la sangre");
    }

    public void windowDeactivated(WindowEvent e){
        System.out.println("Ventana desactivada");
    }

    public void windowDeiconified(WindowEvent e){}

    public void windowIconified(WindowEvent e){
        System.out.println("Ventana minimi... nimini... MINIMIZADA!!!");
    }

    public void windowOpened(WindowEvent e){}

}