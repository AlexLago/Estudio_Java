package acceso_ficheros;

import java.io.*;

public class PruebaRutas {
    
    public static void main(String[] args) {

        File archivo = new File("ejemplo_archivo");
        
        System.out.println(archivo.getAbsolutePath());

    }

}
