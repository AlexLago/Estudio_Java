package acceso_ficheros;

import java.io.File;

public class Eliminar {
    
    public static void main(String[] args) {
        
        File ruta = new File("acceso_ficheros" + File.separator + "prueba_texto.txt");

        ruta.delete();

    }

}
