package graficos;

import java.awt.*;
import javax.swing.*;

public class PruebaEventos {
    
    public static void main(String[] args) {
        
        MarcoBotones mimarco = new MarcoBotones();

        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoBotones extends JFrame{

    public MarcoBotones() {

        setTitle("Botones y Eventos");
        setBounds(700, 300, 500, 300);

    }

}

class LaminaBotones extends JPanel{



}