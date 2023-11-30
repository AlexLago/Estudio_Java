package graficos;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

//import java.awt.event.*;
import javax.swing.*;

public class ChangeState {
    
    public static void main(String[] args) {

        StateFrame myframe = new StateFrame();

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class StateFrame extends JFrame {

    public StateFrame() {

        setVisible(true);
        setBounds(300, 300, 500, 350);

        StateListener newstate = new StateListener();

        addWindowStateListener(newstate);

    }

}

class StateListener implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent e) {

        System.out.println("The window has changed it's state");
        //System.out.println(e.getNewState());

        if(e.getNewState() == 6) {
            System.out.println("The window it's in fullscreen");
        }

    }

}