package poo;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

    public static void main(String[] args) {

        /*Empleado empleado1 = new Empleado("Javier Sanchez", 85000, 1990, 12, 17);
        Empleado empleado2 = new Empleado("Daniel Neruda", 95000, 1995, 6, 2);
        Empleado empleado3 = new Empleado("Paula Gutierrez", 105000, 2002, 3, 15);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println("Nombre: " + empleado1.getNombre() + " | Sueldo: " + empleado1.getSueldo() + " | Fecha de alta: " + empleado1.getAlta());
        System.out.println("Nombre: " + empleado2.getNombre() + " | Sueldo: " + empleado2.getSueldo() + " | Fecha de alta: " + empleado2.getAlta());
        System.out.println("Nombre: " + empleado3.getNombre() + " | Sueldo: " + empleado3.getSueldo() + " | Fecha de alta: " + empleado3.getAlta());
        */
        
        Jefatura jefe_RRHH = new Jefatura("Alejandro", 55000, 2023, 3, 5); //   Al ser definido primero, la id estática lo nombrará primero antes de los demas

        jefe_RRHH.setIncentivo(2570);

        Empleado[] empleados = new Empleado[6];

        //String[] array = new String[3]; Alternativa de array

        empleados[0] = new Empleado("Javier Sanchez", 85000, 1990, 12, 17);
        empleados[1] = new Empleado("Daniel Neruda", 95000, 1995, 6, 2);
        empleados[2] = new Empleado("Paula Gutierrez", 105000, 2002, 3, 15);
        empleados[3] = new Empleado("Helena Pereira");

        empleados[4] = jefe_RRHH; //    Polimorfismo en acción. Principio de sustitución

        empleados[5] = new Jefatura("María", 95000, 1999, 5, 26);

        Jefatura jefa_finanzas = (Jefatura) empleados[5];   // Aquí se esta aplicando la Refundición/Casting. De esta manera pasa de ser un objeto de tipo Empleado a uno de tipo Jefactura
        
        // El que podamos hacerle una Refundición/Casting se debe a que es una clase heredada de Empleado

       // Jefatura jefe_compras = (Jefatura) empleados[1];  Aquí dará error puesto a que un empleado no siempre es un jefe, pero un jefe siempre es un empleado

        jefa_finanzas.setIncentivo(55000);

        /*for(int i=0; i<3; i++) {
            empleados[i].subeSueldo(5);
        }

        for(int i=0; i<3; i++) {
            System.out.println("Nombre: " + empleados[i].getNombre() + " | Sueldo: " + empleados[i].getSueldo() + " | Fecha de alta: " + empleados[i].getAlta());
        }*/

        /*Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 5, 5);

        Comparable ejemplo = new Empleado("Elisabeth", 95000, 2011, 6, 07);

        if(director_comercial instanceof Empleado) {  // Con instanceof puedes saber si esta instancia pertenece a esa clase o no
            System.out.println("Es de tipo Jefatura");
        }
        
        if(ejemplo instanceof Comparable) {
            System.out.println("Implementa la interfaz comparable");
        }
        */

        System.out.println("El jefe " + jefa_finanzas.getNombre() + " tiene un bonus de: " + jefa_finanzas.setBonus(500));

        System.out.println(empleados[3].getNombre() + " tiene un bonus de: " + empleados[3].setBonus(200));

        System.out.println(jefa_finanzas.tomarDecisiones("Dar más días de vacaciones a los empleados"));

        Arrays.sort(empleados); // Usamos el método sort para ordenar el array y de este modo, las ID estarán ordenadas

        for (Empleado e : empleados) {
            
            e.subeSueldo(5);

            System.out.println("Nombre: " + e.getNombre() + " | Sueldo: " + e.getSueldo() + " | Fecha de alta: " + e.getAlta()); // Aquí tambien se está aplicando el polimorfismo

            // Esto se debe a que cuando lee que el objeto pasa a ser de tipo Jefactura, el objeto e pasa a ser Jefactura para esa llamada. A esto se le llama Enlazado dinámico

        }

    }
    
}

class Empleado implements Comparable, Trabajadores{

    public double setBonus(double gratificacion) {
        return Trabajadores.bonus_base + gratificacion;
    }

    public int compareTo(Object mi_objeto) {    // Método de la interfaz Comparable para el uso del Arrays.sort REPASAR

        Empleado otro_empleado = (Empleado) mi_objeto;

        if(this.id < otro_empleado.id) {
            return -1;

        } else if(this.id > otro_empleado.id) {
            return 1;

        } else {
            return 0;

        }
    }

    public Empleado(String nombre, double sueldo, int year, int month, int day) {

        this.nombre = nombre;
        this.sueldo = sueldo;

        id_siguiente++;
        id = id_siguiente;

        //id_siguiente++;

        GregorianCalendar calendario = new GregorianCalendar(year, month-1, month);

        alta_contrato = calendario.getTime();

    }

    public Empleado(String nombre) {    //Sobrecarga de constructores
        //this.nombre = nombre;
        this(nombre, 30000, 2000, 01,01);
    }

    public String getNombre() { 
        return nombre + " | ID: " + id;
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
    private String nombre;
    private double sueldo;
    private Date alta_contrato;
}

final class Jefatura extends Empleado implements Jefes{

    private double incentivo;

    public double setBonus(double gratificacion) {

        double prima = 2000;

        return Trabajadores.bonus_base + gratificacion + prima;
    }

    public String tomarDecisiones(String decision) {
        return "Un miembro de la dirección ha tomado la decisión de: " + decision;
    }

    public Jefatura(String nombre, double sueldo, int year, int month, int day) {

        super(nombre, sueldo, year, month, day);

    }
    
    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public double getSueldo() {

        double sueldoJefe = super.getSueldo();

        return sueldoJefe + incentivo;
    }
}