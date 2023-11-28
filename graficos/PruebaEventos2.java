package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaEventos2 {
    
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

        LaminaBotones milamina = new LaminaBotones();

        add(milamina);

    }

}

class LaminaBotones extends JPanel{

    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones() {

        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        botonAzul.addActionListener();
        botonAmarillo.addActionListener();
        botonRojo.addActionListener();

    }

}

class ColorFondo implements ActionListener{

    

}