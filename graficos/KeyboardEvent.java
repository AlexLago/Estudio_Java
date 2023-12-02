package graficos;

import javax.swing.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardEvent {
    

    public static void main(String[] args) {
        
        FrameWithKeys myframe = new FrameWithKeys();

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class FrameWithKeys extends JFrame {

    public FrameWithKeys() {

        setVisible(true);
        setBounds(700, 300, 600, 450);

    }

}

class KeyboardListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}



}