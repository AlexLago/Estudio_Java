package exceptions;

import javax.swing.JOptionPane;

public class CompruebaMail {
    
    public static void main(String[] args) {
        
        String mail = JOptionPane.showInputDialog("Introduce email");

        examinaEmail(mail);

    }

    static void examinaEmail(String mail) {

        int arroba = 0;
        boolean punto = false;

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
