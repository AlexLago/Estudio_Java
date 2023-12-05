package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.event.FocusListener;

public class FocusEvent {
    
    public static void main(String[] args) {
        
        FocusFrame myframe = new FocusFrame();

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class FocusFrame extends JFrame {

    public FocusFrame() {

        setVisible(true);
        setBounds(300, 300, 600, 450);

    }

}

class FocusPanel extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        

    }

}

class Focus implements FocusListener {

    @Override
    public void focusGained(java.awt.event.FocusEvent e) {}

    @Override
    public void focusLost(java.awt.event.FocusEvent e) {}

}