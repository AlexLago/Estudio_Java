package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusTest {
    
    public static void main(String[] args) {
        
        FocusFrame myframe = new FocusFrame();

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class FocusFrame extends JFrame {

    public FocusFrame() {

        setVisible(true);
        setBounds(300, 300, 600, 450);

        add(new FocusPanel());

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
        
        box1.setBounds(120, 10, 150, 20);
        box2.setBounds(120, 50, 150, 20);

        add(box1);
        add(box2);

        Focus f = new Focus();

        box1.addFocusListener(f);
        box2.addFocusListener(f);

    }

    private class Focus implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            System.out.println("Obtained the focus");
        }

        @Override
        public void focusLost(FocusEvent e) {

            String email = box1.getText();
            boolean check = false;

            for(int i=0; i<email.length(); i++) {

                if(email.charAt(i) == '@') {
                    check = true;
                }

            }

            if(check) {
                System.out.println("It's correct");
            } else {
                System.out.println("Your email doesn't contain an @");
            }

        }

    }

}

