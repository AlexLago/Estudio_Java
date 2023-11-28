package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        LaminaBotones milamina = new LaminaBotones();

        add(milamina);

    }

}

class LaminaBotones extends JPanel implements ActionListener{

    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotones() {

        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);

        botonAzul.addActionListener(this);
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {

        Object botonPulsado = e.getSource();

        switch (botonPulsado.getClass().getName()) {
            
            case "botonAzul":
                
                setBackground(Color.BLUE);

                break;
        
            case "botonAmarillo":

                setBackground(Color.YELLOW);

                break;

            case "botonRojo":

                setBackground(Color.RED);

                break;

            default:
                break;
        }
    }

}