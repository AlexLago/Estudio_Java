package graficos;

import javax.swing.*;

public class CreandoMarcos {    // Prueba simple con JFrames
    
    public static void main(String[] args) {

        miMarco marco1 = new miMarco();

    }
}

class miMarco extends JFrame{

    public miMarco() {

        setSize(500, 300); 
        setLocation(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
