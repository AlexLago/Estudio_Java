package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {
    
    public static void main(String[] args) {

        Persona[] personas = new Persona[2];

        personas[0] = new Empleado2("Javier", 50000, 2009, 02, 25);
        personas[1] = new Alumno("Alejandro", "Programador");

        for (Persona p : personas) {
            System.out.println(p.getNombre() + ", " + p.getDescripcion());  //  Y aquí mostraremos el contenido de los métodos abstractos haciendo uso del polimorfismo
        }

    }
}

abstract class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String getDescripcion(); // Método abstracto. Este nos obligará a transformar la clase Persona en abstracta, puesto cualquier clase con metodos abstráctos se vuelve en uno tambien
}

class Empleado2 extends Persona{

    public Empleado2(String nombre, double sueldo, int year, int month, int day) {

        super(nombre);

        this.sueldo = sueldo;

        id_siguiente++;
        id = id_siguiente;

        GregorianCalendar calendario = new GregorianCalendar(year, month-1, month);

        alta_contrato = calendario.getTime();

    }

    public String getDescripcion() {    //  Aquí sobreescribimos el método getDescripcion puesto a que nos obligan al este ser un método abstracto de su padre Persona
        return "Este empleado tiene un ID: " + id + " con un sueldo: " + sueldo;
    }

    public void subeSueldo(double porcentaje) {

        double aumento = sueldo * porcentaje / 100;

        sueldo += aumento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getAlta() {
        return alta_contrato;
    }

    private int id;
    private static int id_siguiente;
    private double sueldo;
    private Date alta_contrato;
}

class Alumno extends Persona {

    private String carrera;

    public Alumno(String nombre, String carrera) {

        super(nombre);

        this.carrera = carrera;
    }

    public String getDescripcion() {
        return "Este alumno está estudiando la carrera de " + carrera;
    }
}