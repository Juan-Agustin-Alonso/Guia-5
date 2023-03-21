/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        //Lleno matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int num = (int) (Math.random() * 10);
                matriz[i][j] = num;

            }

        }
        //Imprimo matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);     
                
            }
            System.out.println("");
          
        }
        System.out.println("*******************************************************");
        //Matriz TRanspuesta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]);
                
            }
            
             System.out.println("");
        }
        
    }

}
