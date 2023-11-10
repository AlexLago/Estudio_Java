
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Areas {
    
    public static void main(String[] args) {

        int lado;
        int base;
        int altura;
        int radio;
        int figura;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");

        figura = entrada.nextInt();

        entrada.close();

        switch(figura) {

            case 1:

                lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

                System.out.println("El área del cuadrado es " + Math.pow(lado, 2));

            break;

            case 2:

                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));

                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                System.out.println("El área del rectángulo es " + base*altura);

            break;

            case 3:
        
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));

                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                System.out.println("El área del triángulo es " + (base*altura)/2);

            break;

            case 4:

                radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));

                System.out.print("El área del círculo es ");

                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));

            break;

            default:

                System.out.println("La opción no es correcta");

            break;
        }
    }
}
