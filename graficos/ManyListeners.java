package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ManyListeners {
    

    public static void main(String[] args) {
        
        MainFrame myframe = new MainFrame();

        myframe.setVisible(true);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MainFrame extends JFrame {

    public MainFrame() {

        setTitle("Listeners Test");
        setBounds(1300, 100, 300, 200);

        MainPanel panel = new MainPanel();

        add(panel);

    }

}

class MainPanel extends JPanel {

    JButton btnClose;

    public MainPanel() {

        JButton btnNew = new JButton("New");
        btnClose = new JButton("Close");

        add(btnNew);
        add(btnClose);

    }

    private class NewListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {}

    }

}

class NewFrame extends JFrame {

    private static int counter;

    public NewFrame() {

        counter++;

        setTitle("Window " + counter);
        setBounds(40*counter, 40*counter, 300, 150);

    }

}