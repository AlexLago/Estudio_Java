package acceso_ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFicheros {
    
    public static void main(String[] args) {
        
        LeerFichero accediendo = new LeerFichero();

        accediendo.lee();

    }

}

class LeerFichero {

    public void lee() {

        try {

            FileReader entrada = new FileReader("acceso_ficheros\\ejemplo.txt");
            int c = entrada.read();

            while (c != -1) {
                
                c = entrada .read();

                char letra = (char) c;

                System.out.println(letra);

            }

            entrada.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo.");
        } catch(IOException e) {
            System.out.println("Fallo al leer el archivo.");
        }

    }

}