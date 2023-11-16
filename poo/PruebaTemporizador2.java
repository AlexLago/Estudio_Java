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

}