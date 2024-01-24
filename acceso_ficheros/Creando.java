package acceso_ficheros;

import java.io.*;

public class Creando {
    
    public static void main(String[] args) {

        File ruta = new File("acceso_ficheros" + File.separator + "prueba_texto.txt");

        //ruta.mkdir();

        try {
            ruta.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
