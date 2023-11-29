package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaEventos2 {
    
    public static void main(String[] args) {
        
        MarcoBotones2 mimarco = new MarcoBotones2();

        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MarcoBotones2 extends JFrame{

    public MarcoBotones2() {

        setTitle("Botones y Eventos");
        setBounds(700, 300, 500, 300);

        LaminaBotones milamina = new LaminaBotones();

        add(milamina);

    }

}

class LaminaBotones2 extends JPanel{

    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones2() {

        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        botonAzul.addActionListener(new ColorFondo(Color.BLUE));
        botonAmarillo.addActionListener(new ColorFondo(Color.YELLOW));
        botonRojo.addActionListener(new ColorFondo(Color.RED));

    }

    private class ColorFondo implements ActionListener{

        private Color c;

        public ColorFondo(Color c) {
            this.c = c;
        }

        public void actionPerformed(ActionEvent e) {
            setBackground(c);
        }

    }
}