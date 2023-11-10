package poo;

public class PruebaConstantesStatic {
    
    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Marcos");
        Empleados trabajador2 = new Empleados("Patroclo");
        Empleados trabajador3 = new Empleados("Aitor");
        Empleados trabajador4 = new Empleados("Helena");

        trabajador1.setSeccion("RRHH");
        //trabajador1.setNombre("Maria");

        System.out.println(trabajador1.getDatos());

       //Empleados.id++;

        System.out.println(trabajador2.getDatos());

        //Empleados.id++;

        System.out.println(trabajador3.getDatos());
        System.out.println(trabajador4.getDatos());

        System.out.println(Empleados.getIdSiguiente());
    }
}

class Empleados {

    private  final String NOMBRE;
    private String seccion;

    private int id;
    private static int id_siguiente = 1;

    public Empleados(String NOMBRE) {

        this.NOMBRE = NOMBRE;

        seccion = "Administración";

        id = id_siguiente; // <------ Revisar mas adelante para comprender mejor

        id_siguiente++;

    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    /*public void setNombre(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }*/

    public String getDatos() {
        return "El NOMBRE es: " + NOMBRE + " , la sección es " + seccion + " y el ID = " + id;
    }

    public static String getIdSiguiente() {
        return "El Próximo ID será: " +id_siguiente;
    }
}