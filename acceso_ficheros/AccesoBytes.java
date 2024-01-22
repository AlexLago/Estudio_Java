package acceso_ficheros;

import java.io.*;

public class AccesoBytes {
    
    public static void main(String[] args) {
        
        try {
            
            FileInputStream readFile = new FileInputStream("acceso_ficheros//willowTree.jpg");

            boolean end = false;

            while(!end){

                int byteInput = readFile.read();
                
                if(byteInput == -1)
                end = true;

                System.out.print(byteInput);

            }

            readFile.close();

        } catch (IOException e) {}

    }

}
