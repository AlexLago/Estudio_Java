import java.util.Scanner;

public class EntradaEjemplo {

    public static void main(String[] args) {

        /* Hay dos tipos de métodos (Métodos y Constructores) la diferencia es que los constructores son métodos especiales teniendo el mismo nombre de la clase a la que pertenece
         * Por ejemplo. En la clase Math, teníamos métodos como sqrt y round. Pero en Scanner se llamarían Scanner.método y varían segun los argumentos que le des cambiará su uso
        */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");

        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduce edad, por favor");

        int edad = entrada.nextInt();

        entrada.close();

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años.");
    }
}
