package acceso_ficheros;

import java.io.*;

public class Creando {
    
    public static void main(String[] args) {

        File ruta = new File("acceso_ficheros" + File.separator + "Nuevo_Directorio");

        ruta.mkdir();

    }

}
