package graficos;

import java.awt.*;
import javax.swing.*;

public class ComprobarFuentes {
    
    public static void main(String[] args) {
        
        String fuente = JOptionPane.showInputDialog("Introduce fuente");
        String [] nombres_fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        boolean presencia_fuente = false;

        for (String nombres : nombres_fuentes) {
            
            if (nombres.equals(fuente)) {
                presencia_fuente = true;
            }
        }

        if (presencia_fuente) {
            System.out.println("Fuente instalada");
        } else {
            System.out.println("No está instalada la fuente");
        }

    }

}
