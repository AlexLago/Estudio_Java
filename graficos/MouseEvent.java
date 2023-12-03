package graficos;

import javax.swing.*;
import java.awt.event.*;

public class MouseEvent {
    
    public static void main(String[] args) {
        
        MouseFrame myframe = new MouseFrame();

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MouseFrame extends JFrame {

    public MouseFrame() {

        setVisible(true);
        setBounds(700, 300, 600, 450);

    }

}

class Mouse implements MouseListener {


    
}