import java.util.Scanner;

public class UsoTallas {

    //enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};

    enum Talla {

        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

        private String abreviatura;

        private Talla(String abreviatura) {

            this.abreviatura = abreviatura;

        }

        public String getAbreviatura() {
            return abreviatura;
        }
    }

    public static void main(String[] args) {

        /*String talla;

        talla = "Pequeña";
        talla = "Mediana";
        talla = "Grande";
        talla= "Azul";  //  Azul no es una talla, por lo que intentaremos usar enum para que eso no suceda
        */

        /*Talla S= Talla.MINI;
        Talla m = Talla.MEDIANO;
        Talla l = Talla.GRANDE;
        Talla xl = Talla.MUY_GRANDE;
        */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");

        String entrada_datos = entrada.next().toUpperCase();  //  Usando .next() el scanner quedará esperando al usuario hasta que escriba lo que deba

        Talla talla = Enum.valueOf(Talla.class, entrada_datos); 
        // El paso del enum.valueOf sirve porque en nuestro Scanner no tenemos ningun dato tipo enum, por lo que lo intercambiaremos si ambos son idénticos

        entrada.close();

        System.out.println("Talla = " + talla);

        System.out.println("Abreviatura = " + talla.getAbreviatura());
    }
}
