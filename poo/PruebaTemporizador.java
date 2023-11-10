package poo;

import javax.swing.Timer;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class PruebaTemporizador {
    
    public static void main(String[] args) {


        //ActionListener oyente = new DameLaHora();
        DameLaHora oyente = new DameLaHora();

        Timer mi_temporizador = new Timer(5*1000, oyente);

        mi_temporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");  // Rudimentario pero sirve de prueba

    }
}

class DameLaHora implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Date ahora = new Date();

        System.out.println("Te pongo la hora cada 5 segundos: " + ahora);
    }
}