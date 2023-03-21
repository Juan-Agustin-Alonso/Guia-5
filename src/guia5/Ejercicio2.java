/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a 
buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido.
 */
package guia5;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            int numeroAzar = (int) (Math.random() * 10);
            vector[i] = numeroAzar;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);

        }
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero a buscar dentro del vector");
        int num = leer.nextInt();
        int contador = 0;
        // Me fijo si esta repetido:
        for (int i = 0; i < vector.length; i++) {

            if (vector[i] == num) {
                contador = contador + 1;
            }
        }
        // Si no esta repetido:
        if (contador == 1) {
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] == num) {
                    System.out.println("El numero no se encuentra repetido y esta en la posicion " + (i + 1));
                }

            }
        } else {
            //Si esta repetido:
            System.out.print("El numero esta repetido y se encuentra en las posiciones ");
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] == num) {
                    System.out.print((i + 1) + " - ");
                }

            }
        }

    }
}
