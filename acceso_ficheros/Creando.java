package acceso_ficheros;

import java.io.*;

public class Creando {
    
    public static void main(String[] args) {

        File ruta = new File("acceso_ficheros" + File.separator + "prueba_texto.txt");

        //ruta.mkdir();

        String archivo_destino = ruta.getAbsolutePath();

        try {
            ruta.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Crear accede_es = new Crear();

        accede_es.escribir(archivo_destino);
        
    }

}

class Crear {

    public void escribir(String ruta) {
        
        String frase = "Esto es un ejemplo. Espero que salga.";

        try {

            FileWriter escritura = new FileWriter(ruta);

            for(int i=0; i<frase.length(); i++){
                escritura.write(frase.charAt(i));
            }
            

            escritura.close();

        } catch (IOException e) {}
    }

}