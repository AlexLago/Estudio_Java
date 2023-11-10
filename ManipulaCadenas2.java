public class ManipulaCadenas2 {
    public static void main(String[] args) {

        String frase = "Hoy es un estupendo día para programar en Java"; // Recogemos un string para poder interactuar con él

        String frase_resumen = frase.substring(0, 29) + " irnos a la playa y olvidarnos de todo...."; /* Usamos el método de la clase String "substring"
                                                                                                                             que nos permite limpiar las letras segun el indice indicado*/

        System.out.print(frase_resumen);
    }
}
