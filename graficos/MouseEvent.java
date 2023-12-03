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

        Mouse mouse_event = new Mouse();

        addMouseListener(mouse_event);

    }

}

class Mouse implements MouseListener {

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        System.out.println("You just clicked");
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        System.out.println("Click pressed");
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        System.out.println("You just released the mouse");
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        System.out.println("Entered");
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        System.out.println("Exited");
    }


    
}