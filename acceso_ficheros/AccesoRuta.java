package acceso_ficheros;

import java.io.*;

public class AccesoRuta {
    
    public static void main(String[] args) {

        File ruta = new File("acceso_ficheros");

        String[] nombre_archivos = ruta.list();

        for (String string : nombre_archivos) {

            System.out.println(string);

            File f = new File(ruta.getAbsolutePath(), string);

            if(f.isDirectory()) {

                String[] archivos_subcarpeta = f.list();

                for (String string2 : archivos_subcarpeta)
                    System.out.println(string2);
                

            }

        }

    }

}
