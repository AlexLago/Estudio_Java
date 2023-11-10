import javax.swing.JOptionPane;

public class PesoIdeal {
    
    public static void main(String[] args) {

        String genero = "";

        do{

            genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");

        } while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));

        int PesoIdeal = 0;

        if(genero.equalsIgnoreCase("H")) {

            PesoIdeal = altura - 110;


        } else if(genero.equalsIgnoreCase("M")) {

            PesoIdeal = altura - 120;
        }

        System.out.println("Tu peso ideal es " + PesoIdeal + "kg");

    }
}
