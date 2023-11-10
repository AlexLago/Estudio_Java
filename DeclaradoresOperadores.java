public class DeclaradoresOperadores {
    public static void main(String[] args) {
        
        final byte A = 5; // Al añadir 'final' "a" pasó a ser una constante, por lo que no se podrá modificar su contenido
        byte b;
        
        b = 7;

        byte c =  (byte) (A + b); // Recogemos dos variables e inicializamos otra variable recogiendo la información de la operación de suma

        c++; // Añadimos una unidad mas

        c+=6; // Y le añadimos 6 unidades mas

        System.out.println(c);

        //  Vamos a calcular cuantas pulgadas tienen "x" centímetros 

        final double PULGADAS = 2.54; //    Creamos una constante para recoger el valor general de las pulgadas en centímetros

        double cm = 6; // Introducimos la cantidad de centímetros que queremos pasar a pulgadas
 
        System.out.print(String.format("%.2f", cm/PULGADAS)); 
        
        /* Usamos (String.format) para obtener mostrar sólo los dos primeros decimales y hacemos el cálculo
        mostrandolo en el terminal */
    }
}
