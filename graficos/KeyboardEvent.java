package graficos;

import javax.swing.*;
import java.awt.event.*;

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

        KeyboardListener key = new KeyboardListener();

        addKeyListener(key);

    }

}

class KeyboardListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int code = e.getKeyCode();

        System.out.println(code);

    }

    @Override
    public void keyReleased(KeyEvent e) {}

}