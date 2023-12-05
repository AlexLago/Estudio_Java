package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class FocusWindow extends JFrame implements WindowFocusListener{

    @Override
    public void windowGainedFocus(WindowEvent e) {}

    @Override
    public void windowLostFocus(WindowEvent e) {}
    
}
