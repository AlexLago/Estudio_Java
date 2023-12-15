package exceptions;

import javax.swing.JOptionPane;

public class Aleatorios {
    
    public static void main(String[] args) {
        
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));
        int random_num[] = new int[elementos];
        
        for(int i=0; i<random_num.length; i++) {
            random_num[i] = (int) (Math.random()*100);
        }

        for (int elem : random_num) {
            System.out.println(elem);
        }

    }

}
