package graficos;

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

}

class NewFrame extends JFrame {

    public NewFrame() {

        

    }

}