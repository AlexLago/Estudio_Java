package graficos;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class PruebaDibujo {
    
    public static void main(String[] args) {
        
        MarcoConDibujos mi_marco = new MarcoConDibujos();

    }

}

class MarcoConDibujos extends JFrame {

    public MarcoConDibujos() {

        setTitle("Prueba de Dibujo");
        setSize(400, 400);

    }

}
