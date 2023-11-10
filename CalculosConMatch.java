public class CalculosConMatch {
    public static void main(String[] args) {
         
        double raiz = Math.sqrt(9); // Con el método 'sqrt' de la clase 'Math' podemos obtener la raiz cuadrada del argumento introducido

        System.out.println(raiz);

        float num1 = 5.85F;    // Introducimos una "F" al final del número para indicar a Java que es un float

        int resultado = (int) Math.round(num1);

        System.out.println(resultado);

        double base = 5;
        double exponente = 3;

        int resultado2 = (int) Math.pow(base, exponente);

        System.out.print("El resultado de " + base + " elevado a " + exponente + " es " + resultado2);
    }
}
