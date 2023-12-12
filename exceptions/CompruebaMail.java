package exceptions;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class CompruebaMail {
    
    public static void main(String[] args) {
        
        String mail = JOptionPane.showInputDialog("Introduce email");

        try {
            examinaEmail(mail);
        } catch (EOFException e) {
            System.out.println("La dirección email no es correcta");
        }
        

    }

    static void examinaEmail(String mail) throws EOFException {

        int arroba = 0;
        boolean punto = false;

        if(mail.length() <= 3) {

            /*ArrayIndexOutOfBoundsException excepcion = new ArrayIndexOutOfBoundsException();

            throw excepcion;*/

            throw new EOFException();

        } else {

            for( int i=0; i<mail.length(); i++) {

                if(mail.charAt(i) == '@') {
                    arroba++;
                }

                if(mail.charAt(i) == '.') {
                    punto = true;
                }

            }
        }

    }

}
