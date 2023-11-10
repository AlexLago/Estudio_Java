package poo;

public class ClaseGenericaEjemplo {
    
    public static void main(String[] args) {

        ListaEnlazada<Integer> listaEnteros = new ListaEnlazada();

        listaEnteros.agregar(1);
        listaEnteros.agregar(2);
        listaEnteros.agregar(3);

        listaEnteros.agregar(69);
        listaEnteros.agregar(29);

        System.out.println("Lista de enteros: ");

        listaEnteros.imprimir();

        ListaEnlazada<String> listaString = new ListaEnlazada<>();

        listaString.agregar("Hola");
        listaString.agregar("Mundo");
        listaString.agregar("Java");

        System.out.println("Lista de cadenas: ");
        
        listaString.imprimir();

    }
}

class Nodo<T> { // Investigar porque no puedo añadir el modificador de acceso public

    private T valor;
    private Nodo<T> siguiente;

    public Nodo(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

}

class ListaEnlazada<T> {    // Investigar porque no puedo añadir el modificador de acceso public

    private Nodo<T> cabeza;

    public void agregar(T valor) {

        Nodo<T> nuevNodo = new Nodo<>(valor);

        if(cabeza == null) {

            cabeza = nuevNodo;

        } else {

            Nodo<T> actual = cabeza;

            while(actual.getSiguiente() != null) {

                actual.getSiguiente();

            }

            actual.setSiguiente(nuevNodo);

        }
    }

    public void imprimir() {

        Nodo<T> actual = cabeza;

        while(actual != null) {

            System.out.println(actual.getValor() + " ");
            actual = actual.getSiguiente();

        }

        System.out.println();

    }
}

