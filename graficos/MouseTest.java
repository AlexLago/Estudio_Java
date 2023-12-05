package graficos;

import javax.swing.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

        MouseActions event = new MouseActions();

        addMouseListener(event);

    }

}

class MouseActions extends MouseAdapter {

    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked in the coordinates X: " + e.getX() + " and Y: " + e.getY());
    }

}