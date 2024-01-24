package acceso_ficheros;

import java.util.*;
import java.io.*;

public class Serializacion {
    
    public static void main(String[] args) {
        
        Administrador jefe = new Administrador("Alejandro", 80000, 2024, 1, 24);

        jefe.setIncentivo(5000);

        Empleado[] personal = new Empleado[3];

        personal[0] = jefe;
        personal[1] = new Empleado("Ruben", 4, 2008, 3, 15);
        personal[2] = new Empleado("Lucas", 18000, 2012, 9, 2);

        try {
            
            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("acceso_ficheros\\empleado.dat")); // Le damos al objeto una dirección donde se guardará el resultado

            escribiendo_fichero.writeObject(personal);  // Usamos el flujo de datos para transferir el array "personal"
            escribiendo_fichero.close();

            ObjectInputStream leyendo_fichero = new ObjectInputStream(new FileInputStream("acceso_ficheros\\empleado.dat"));

            Empleado[] personal_recuperado = (Empleado[]) leyendo_fichero.readObject();

            leyendo_fichero.close();

            for (Empleado empleado : personal_recuperado) {
                System.out.println(empleado);
            }

        } catch (Exception e) {}

    }

}

class Empleado implements Serializable {

    private static final long SerialVersionUID = 1L;

    private String nombre;
    private double sueldo;
    private Date fechaContrato;
    private int mes, ano, dia;

    public Empleado(String nombre, double sueldo, int ano, int mes, int dia) {

        this.nombre = nombre;
        this.sueldo = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);

        fechaContrato = calendario.getTime();

    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void subirSueldo(double porcentaje) {
        
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;

    }

    public String toString() {
        return "Nombre " + nombre + ", sueldo + " + sueldo + ", fecha de contrato " + fechaContrato;
    }

}

class Administrador extends Empleado {

    private int incentivo;

    public Administrador(String nombre, double sueldo, int ano, int mes, int dia) {

        super(nombre, sueldo, ano, mes, dia);
        
        incentivo = 0;
        
    }

    @Override
    public double getSueldo() {

        double sueldoBase = super.getSueldo();

        return sueldoBase + incentivo;
    }

    public void setIncentivo(int incentivo) {
            this.incentivo = incentivo;
    }

    @Override
    public String toString() {
        return super.toString() + " Incentivo = " + incentivo;
    }
}