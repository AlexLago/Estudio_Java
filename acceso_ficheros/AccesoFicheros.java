package acceso_ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AccesoFicheros {
    
    public static void main(String[] args) {
        
        LeerFichero accediendo = new LeerFichero();

        accediendo.lee();

        Escribiendo escritura = new Escribiendo();

        escritura.escribir();

    }

}

class LeerFichero {

    public void lee() {

        try {

            FileReader entrada = new FileReader("acceso_ficheros\\ejemplo.txt");
            int c = entrada.read();

            while (c != -1) {
                
                c = entrada .read();

                char letra = (char) c; // Repasar en el futuro comas, ñ y otras letras especiales

                System.out.print(letra);

            }

            entrada.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo.");
        } catch(IOException e) {
            System.out.println("Fallo al leer el archivo.");
        }

    }

}

class Escribiendo {

    public void escribir() {

        String frase = "Esto es una prueba de escritura.";

        try {

            FileWriter escritura = new FileWriter("acceso_ficheros\\nuevo_texto.txt");

            for(int i=0; i<frase.length(); i++) {
                escritura.write(frase.charAt(i));
            }

            escritura.close();

        } catch (IOException e) {
            System.out.println("No se ha encontrado la carpeta.");
        }

    }

}