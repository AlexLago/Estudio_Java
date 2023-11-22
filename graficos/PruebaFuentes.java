package graficos;

import java.awt.GraphicsEnvironment;

public class PruebaFuentes {
    
    public static void main(String[] args) {
        
        String [] nombres_de_fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String nombre_fuente : nombres_de_fuentes) {
            
            System.out.println(nombre_fuente);

        }

    }

}
