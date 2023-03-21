/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es 
antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica
si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas 
(o viceversa).
 */
package guia5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] matrizTranspuesta = new int[3][3];
        //Lleno matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese un numero para la posicion [" + i + "] [" + j + "]");
                int num = leer.nextInt();
                matriz[i][j] = num;

            }

        }
        //Imprimo matriz
        System.out.println("La matriz quedaría asi:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");

        }
        System.out.println("*******************************************************");
        //Genero la matriz Transpuesta:
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];

            }

        }
        //Imprimo matriz transpuesta:
        System.out.println("La matriz transpuesta quedaría asi:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               System.out.print("[" + matriz[j][i] + "]");
                
            }
            System.out.println("");
          
        }

        //Comparo filas con columnas, elemento a elemento:
        boolean antisimetrica = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != -matrizTranspuesta[j][i]) {
                    antisimetrica = true;
                }
            }
        }
        if (antisimetrica) {
            System.out.println("La matriz es antisimetrica.");
        } else {
            System.out.println("La matriz no es antisimetrica.");
        }
       

    }

}


    

