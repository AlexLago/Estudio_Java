package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {    // Prueba simple con JFrames
    
    public static void main(String[] args) {

        miMarco marco1 = new miMarco();

    }
}

class miMarco extends JFrame{

    public miMarco() {

        //setSize(500, 300); 
        //setLocation(500, 300);
        setBounds(500, 300, 250, 250);
        setVisible(true);
        //setResizable(false);
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
