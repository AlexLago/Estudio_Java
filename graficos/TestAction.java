package graficos;

import java.awt.Graphics;

import javax.swing.*;

public class TestAction {
    
    public static void main(String[] args) {
        
        ActionFrame myframe = new ActionFrame();

        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);

    }

}

class ActionFrame extends JFrame {

    public ActionFrame() {

        setTitle("Actions test");
        setBounds(600, 350, 600, 300);

        ActionPanel mypanel = new ActionPanel();

        add(mypanel);

    }

}

class ActionPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);


    }

}