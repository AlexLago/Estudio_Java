package acceso_ficheros;

import java.io.*;

public class AccesoBytes {
    
    public static void main(String[] args) {

        int byteCounter = 0;

        int inputData[] = new int[45268];

        try {
            
            FileInputStream readFile = new FileInputStream("acceso_ficheros//willowTree.jpg");

            boolean end = false;
            

            while(!end){

                int byteInput = readFile.read();

                if(byteInput != -1)
                inputData[byteCounter] = byteInput;
                
                else
                end = true;

                System.out.println(inputData[byteCounter]);

                byteCounter++;

            }

            readFile.close();

        } catch (IOException e) {}

        System.out.println(byteCounter);

    }

}
