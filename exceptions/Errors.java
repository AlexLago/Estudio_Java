package exceptions;

public class Errors {
    
    public static void main(String[] args) {
        
        int[] my_array = new int[5];

        my_array[0] = 5;
        my_array[1] = 38;
        my_array[2] = 15;
        my_array[3] = 92;
        my_array[4] = 71;

        for(int i=0; i<5; i++) {

            System.out.println("Position " + i + " = " + my_array[i]);

        }

    }

}
