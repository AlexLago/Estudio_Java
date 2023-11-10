public class ManipulaCadenas {
    public static void main(String[] args) {

        String nombre = "Alejandro Lago Pereira";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras");

        System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));

        int ultimaLetra;

        ultimaLetra = nombre.length()-1;

        System.out.print("La última letra es la " + nombre.charAt(ultimaLetra));
    }
}
