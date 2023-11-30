package graficos;

import java.awt.*;
import javax.swing.*;

public class ChangeState {
    
    public static void main(String[] args) {

        StateFrame myframe = new StateFrame();

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class StateFrame extends JFrame {

    public StateFrame() {

        setVisible(true);
        setBounds(300, 300, 500, 350);

    }

}