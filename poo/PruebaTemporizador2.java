package poo;

import javax.swing.Timer;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Toolkit;

public class PruebaTemporizador2 {
    
    public static void main(String[] args) {

        Reloj mi_reloj = new Reloj(3000, true);

        mi_reloj.enMarcha();

        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar.");

        System.exit(0);
        
    }
}

class Reloj {

    private int intervalo;
    private boolean sonido;

    public Reloj(int intervalo, boolean sonido) {

        this.intervalo = intervalo;
        this.sonido = sonido;

    }

    public void enMarcha() {

        ActionListener oyente = new DameLaHora2();
        Timer mi_temporizador = new Timer(intervalo, oyente);

        mi_temporizador.start();
    }

    private class DameLaHora2 implements ActionListener {

        public void actionPerformed(ActionEvent evento) {

            Date ahora = new Date();

            System.out.println("Te pongo la hora cada 3 segundos | " + ahora);

            if(sonido) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}