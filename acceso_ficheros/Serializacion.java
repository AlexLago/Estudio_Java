package acceso_ficheros;

import java.util.*;
import java.io.*;

public class Serializacion {
    


}

class Empleado {

    String nombre;
    double sueldo;
    int mes, ano, dia;

    public Empleado(String nombre, double sueldo, int ano, int mes, int dia) {

        this.nombre = nombre;
        this.sueldo = sueldo;

        GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);

    }

}