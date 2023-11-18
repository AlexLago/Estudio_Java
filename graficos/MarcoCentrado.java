package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

public class MarcoCentrado {
    
    public static void main(String[] args) {
        
        CreandoMarcoCentrado mi_marco = new CreandoMarcoCentrado();

        mi_marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mi_marco.setVisible(true);

    }
}

class CreandoMarcoCentrado extends JFrame {

    public CreandoMarcoCentrado() {

        Toolkit mi_pantalla = Toolkit.getDefaultToolkit();
        Dimension tamano_pantalla = mi_pantalla.getScreenSize();

        int altura_pantalla = tamano_pantalla.height;
        int ancho_pantalla = tamano_pantalla.width;

        setSize(ancho_pantalla/2, altura_pantalla/2);
        setLocation(ancho_pantalla/4 , altura_pantalla/4);
        setTitle("MarcoCentrado");

        Image mi_icono = mi_pantalla.getImage("icono.gif");

    }

}
