package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

    JTextField box1;
    JTextField box2;

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        setLayout(null);

        box1 = new JTextField();
        box2 = new JTextField();
        
    }

}

class Focus implements FocusListener {

    @Override
    public void focusGained(java.awt.event.FocusEvent e) {}

    @Override
    public void focusLost(java.awt.event.FocusEvent e) {}

}