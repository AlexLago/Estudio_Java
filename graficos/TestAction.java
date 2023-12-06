package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;

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

    public ActionPanel() {

        /*JButton yellowButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButton = new JButton("Red");

        add(yellowButton);
        add(blueButton);
        add(redButton);*/

        ActionColor actionYellow = new ActionColor("Yellow", new ImageIcon("graficos/material/imagen.gif"), Color.YELLOW);
        ActionColor actionBlue = new ActionColor("Blue", new ImageIcon("graficos/material/imagen.gif"), Color.BLUE);
        ActionColor actionRed = new ActionColor("Red", new ImageIcon("graficos/material/imagen.gif"), Color.RED);

        //JButton btnYellow = new JButton(actionYellow);
        //add(btnYellow);

        add(new JButton(actionYellow));
        add(new JButton(actionBlue));
        add(new JButton(actionRed));

    }

}

class ActionColor extends AbstractAction {

    public ActionColor(String name, Icon icon, Color btnColor){

        putValue(Action.NAME, name);
        putValue(Action.SMALL_ICON, icon);
        putValue(Action.SHORT_DESCRIPTION, "Set the background with the color " + name);
        putValue("Background_Color", btnColor);

    }

    @Override
    public void actionPerformed(ActionEvent e) {



    }

}