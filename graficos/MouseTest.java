package graficos;

import javax.swing.*;
import java.awt.event.*;

public class MouseTest {
    
    public static void main(String[] args) {
        
        TestFrame test = new TestFrame();

        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class TestFrame extends JFrame {

    public TestFrame() {

        setVisible(true);
        setBounds(700, 300, 600, 450);

    }

}

class MouseActions extends MouseAdapter {



}