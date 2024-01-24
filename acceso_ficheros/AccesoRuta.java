package acceso_ficheros;

import java.io.*;

public class AccesoRuta {
    
    public static void main(String[] args) {

        File ruta = new File("acceso_ficheros");

        String[] nombre_archivos = ruta.list();

        for (String string : nombre_archivos) {
            System.out.println(string);
        }

    }

}
