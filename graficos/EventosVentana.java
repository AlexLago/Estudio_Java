package graficos;

import javax.swing.*;
import java.awt.event.*;

public class EventosVentana {
    
    public static void main(String[] args) {
        
        MarcoVentana frameVentana = new MarcoVentana("Ventana 1", 300, 300, 500, 350);
        MarcoVentana frameVentana2 = new MarcoVentana("Ventana 2", 800, 150, 600, 500);

        frameVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameVentana2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

}

class MarcoVentana extends JFrame{

    public MarcoVentana(String titulo, int x, int y, int width, int height) {

        setTitle(titulo);
        setBounds(x, y, width, height);
        setVisible(true);

        //M_Ventana oyenteVentana = new M_Ventana();

        addWindowListener(new M_Ventana());

    }

}

class M_Ventana extends WindowAdapter /*implements WindowListener*/{

    /*public void windowActivated(WindowEvent e){
        System.out.println("FOR THE EMPEROOOOOOOOOOOR!!!");
    }

    public void windowClosed(WindowEvent e){
        System.out.println("FOR ATOOMAAAAAAA!!!");
    }

    public void windowClosing(WindowEvent e){
        System.out.println("Sangre para el dios de la sangre");
    }

    public void windowDeactivated(WindowEvent e){
        System.out.println("Ventana desactivada");
    }

    public void windowDeiconified(WindowEvent e){
        System.out.println("Ventana restaurada");
    }

    public void windowIconified(WindowEvent e){
        System.out.println("Ventana minimi... nimini... MINIMIZADA!!!");
    }*/

    public void windowOpened(WindowEvent e){
        System.out.println("Ehh, hola");
    }

}