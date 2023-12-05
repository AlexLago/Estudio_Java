package graficos;

import java.awt.event.*;
import javax.swing.JFrame;

public class FocusWindow extends JFrame implements WindowFocusListener{

    FocusWindow frame1;
    FocusWindow frame2;

    public static void main(String[] args) {
        


    }

    public void start() {

        frame1 = new FocusWindow();
        frame2 = new FocusWindow();

        frame1.setVisible(true);
        frame2.setVisible(true);

        frame1.setBounds(300, 100, 600, 350);
        frame2.setBounds(1200, 100, 600, 350);

        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void windowGainedFocus(WindowEvent e) {}

    @Override
    public void windowLostFocus(WindowEvent e) {}
    
}
