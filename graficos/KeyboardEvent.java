package graficos;

import javax.swing.JFrame;

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