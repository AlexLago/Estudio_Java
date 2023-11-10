package poo;

//import javax.swing.JOptionPane;

public class UsoVehiculo {
    
    public static void main(String[] args) {

        /*
        Coche miCoche = new Coche(); // Esto sería Instanciar una clase. Ejemplar de clase

        miCoche.setColor(JOptionPane.showInputDialog("Inserta el color del vehículo"));

        System.out.println(miCoche.getAll());

        System.out.println(miCoche.getColor());

        miCoche.setAsientos(JOptionPane.showInputDialog("¿Posee el vehículo asientos de cuero?"));

        System.out.println(miCoche.getAsientos());

        miCoche.setClimatizador(JOptionPane.showInputDialog("¿Posee el vehículo climatizador?"));

        System.out.println(miCoche.getClimatizador());

        System.out.println(miCoche.getSetPesoTotal());

        System.out.println("El precio final del coche es: " + miCoche.getPrecioCoche());
        */

        Coche miCoche = new Coche();

        miCoche.setColor("Azul");

        Furgoneta miFurgoneta = new Furgoneta(7, 580);

        miFurgoneta.setColor("Verde");

        miFurgoneta.setAsientos("Si");

        miFurgoneta.setClimatizador("Si");

        System.out.println(miCoche.getAll() + " | " + miCoche.getColor());
        System.out.println(miFurgoneta.getAll() + " | " + miFurgoneta.getFurgoneta());
    }
}
