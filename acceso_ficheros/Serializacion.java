package acceso_ficheros;

import java.util.*;
import java.io.*;

public class Serializacion {
    


}

class Empleado {

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