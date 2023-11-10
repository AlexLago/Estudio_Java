

public class ArraysBidimensionales {
   
    public static void main(String[] args) {

        /*int[][] matriz = new int[4][5];

        matriz[0][0] = 15;
        matriz[0][1] = 21;
        matriz[0][2] = 18;
        matriz[0][3] = 9;
        matriz[0][4] = 15;

        matriz[1][0] = 10;
        matriz[1][1] = 52;
        matriz[1][2] = 17;
        matriz[1][3] = 19;
        matriz[1][4] = 7;

        matriz[2][0] = 19;
        matriz[2][1] = 2;
        matriz[2][2] = 19;
        matriz[2][3] = 17;
        matriz[2][4] = 7;

        matriz[3][0] = 92;
        matriz[3][1] = 13;
        matriz[3][2] = 13;
        matriz[3][3] = 32;
        matriz[3][4] = 41;
        */

        int[][] matriz = {
                {10,15,18,19,21},
                {5,25,377,41,15},
                {7,19,32,14,90},
                {85,2,7,41,27}
        };

        for(int[] fila:matriz) {

            System.out.println();

            for(int z:fila) {

                System.out.print(z + " ");
                
            }
        }

        /*for (int i=0; i<4; i++) {

            System.out.print(" |" + i + "| ");

            for (int j=0; j<5;j++) {

                System.out.print(matriz[i][j] + " ");

            }

        }*/

        //System.out.println("Valor almacenado en la posición 2,3 es " + matriz[2][3]);
    }
}
