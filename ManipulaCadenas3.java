public class ManipulaCadenas3 {
    public static void main(String[] args) {

        String alumno1, alumno2;

        alumno1 = "David";
        alumno2 = "david";

        System.out.println(alumno1.equals(alumno2)); // El método "equals" de la clase String nos permite comparar (Mayusculas incluidas) si dos textos son iguales o no devolviendo booleans
    
        System.out.print(alumno1.equalsIgnoreCase(alumno2)); // Este método ignora la regla de las mayusculas, comparando únicamente el texto
    }

}
