package graficos;

import javax.swing.*;

public class CreandoMarcos {
    
    public static void main(String[] args) {

        miMarco marco1 = new miMarco();

        marco1.setVisible(true);

    }
}

class miMarco extends JFrame{

    public miMarco() {

        setSize(500, 300);

    }

}
