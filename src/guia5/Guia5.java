/*
Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre 
por pantalla en orden descendente.
 */
package guia5;

public class Guia5 {

    public static void main(String[] args) {
        int [] vector = new int [100];
        String aux = "";
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i ;
             }
        for (int i = vector.length - 1; i >= 0; i--) {
                System.out.println(vector[i]);
            }
     
    }
    
}
