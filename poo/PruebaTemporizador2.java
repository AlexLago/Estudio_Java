package poo;

import java.awt.event.ActionListener;
import java.util.Timer;

public class PruebaTemporizador2 {
    
    public static void main(String[] args) {


        
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