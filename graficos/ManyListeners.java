package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ManyListeners {
    

    public static void main(String[] args) {
        


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

    public MainPanel() {

        JButton btnNew = new JButton("New");

        add(btnNew);

    }

}