package exceptions;

import java.util.Scanner;

public class EntradaDatos {
    
    public static void main(String[] args) {
        
        System.out.println("¿Que deseas hacer?");
        System.out.println("1. Introducir datos");
        System.out.println("2. Salir del programa");

        Scanner entrada = new Scanner(System.in);

        int decision = entrada.nextInt();

        if(decision == 1) {

        } else {

            System.out.println("Adios");
            System.exit(0);

        }

        entrada.close();

    }

}
