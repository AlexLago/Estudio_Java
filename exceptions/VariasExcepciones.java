package exceptions;

import javax.swing.JOptionPane;

public class VariasExcepciones {
    
    public static void main(String[] args) {
        
        
        try {
            division();
        } catch (ArithmeticException e) {
            System.out.println("Estás dividiendo por 0");
        } catch (NumberFormatException e) {
            System.out.println("No has introducido un número entero");
        }

    }

    static void division() {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));

        System.out.println("El resultado es: " + num1/num2);

    }

}
