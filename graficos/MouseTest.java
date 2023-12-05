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

    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("You clicked in the coordinates X: " + e.getX() + " and Y: " + e.getY());

        System.out.println("Consecutive clicks in row: " + e.getClickCount());

    }

    @Override
    public void mousePressed(MouseEvent e) {

        if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            System.out.println("You used the left click");
        } else if(e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
            System.out.println("You used the wheel button");
        } else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
            System.out.println("You used the right click");
        }

    }

}