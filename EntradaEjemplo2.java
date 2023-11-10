import javax.swing.JOptionPane;

public class EntradaEjemplo2 {
    
    public static void main(String[] args) {

        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");

        String edad = JOptionPane.showInputDialog("Intoduce la edad, por favor");

        int edad_usuario = Integer.parseInt(edad);

        System.out.print("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad_usuario + 1) + " años.");
    }
}
