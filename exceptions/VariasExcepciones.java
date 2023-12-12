package exceptions;

import javax.swing.JOptionPane;

public class VariasExcepciones {
    
    public static void main(String[] args) {
        
        division();

    }

    static void division() {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));

        System.out.println("El resultado es: " + num1/num2);

    }

}
