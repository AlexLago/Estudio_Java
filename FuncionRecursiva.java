public class FuncionRecursiva {
    public static void main(String[] args) {
        int numero = 5;
        int factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    // Función recursiva para calcular el factorial
    public static int calcularFactorial(int n) {
        // Caso base
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Caso recursivo
            return n * calcularFactorial(n - 1);
        }
    }
}

