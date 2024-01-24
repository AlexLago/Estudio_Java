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
                inputData[byteCounter] = byteInput; // Recoger el byte e introducirlo en el array si no es el final(-1)
                
                else
                end = true;

                System.out.println(inputData[byteCounter]);

                byteCounter++;

            }

            
            readFile.close();

        } catch (IOException e) {
            System.out.println("Error. File not found");
        }

        System.out.println(byteCounter);
        
        createFile(inputData);

    }

    static void createFile(int data_newFile[]) {

        try {
            
            FileOutputStream newFile = new FileOutputStream("acceso_ficheros//willowTreeCopy.jpg");

            for(int i=0; i<data_newFile.length; i++) {

                newFile.write(data_newFile[i]);

            }

            newFile.close();

        } catch (IOException e) {
            System.out.println("Error creating file.");
        }

    }

}
