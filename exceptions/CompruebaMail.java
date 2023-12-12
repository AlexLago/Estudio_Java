package exceptions;

import javax.swing.JOptionPane;

public class CompruebaMail {
    
    public static void main(String[] args) {
        
        String mail = JOptionPane.showInputDialog("Introduce email");

        try {
            examinaEmail(mail);
        } catch (Exception e) {

            System.out.println("La dirección email no es correcta");

            e.printStackTrace();

        }
        

    }

    static void examinaEmail(String mail) throws LongitudMailErronea {

        int arroba = 0;
        boolean punto = false;

        if(mail.length() <= 3) {

            /*ArrayIndexOutOfBoundsException excepcion = new ArrayIndexOutOfBoundsException();

            throw excepcion;*/

            throw new LongitudMailErronea("El mail es demasiado corto");

        } else {

            for( int i=0; i<mail.length(); i++) {

                if(mail.charAt(i) == '@') {
                    arroba++;
                }

                if(mail.charAt(i) == '.') {
                    punto = true;
                }

            }

            if(arroba == 1 && punto == true) {
                System.out.println("Es correcto");
            } else {
                System.out.println("No es correcto");
            }

        }

    }

}

class LongitudMailErronea extends Exception {

    public LongitudMailErronea() {}

    public LongitudMailErronea(String msj_error) {
        super(msj_error);
    }

}