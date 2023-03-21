/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos,
etcétera (hasta 5 dígitos).
 */
package guia5;

public class Ejercicio3 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 10);
        int[] vector = new int[num];
        for (int i = 0; i < vector.length; i++) {
            int num2 = (int) (Math.random() * 20000) + 10;
            vector[i] = num2;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
            
        }
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        for (int elemento : vector) {
            int digitos = String.valueOf(elemento).length();
            switch (digitos) {
                case 1:
                    contador1 = contador1 + 1;
                    break;
                case 2:
                    contador2 = contador2 + 1;
                    break;
                case 3:
                    contador3 = contador3 + 1;
                    break;
                case 4:
                    contador4 = contador4 + 1;
                    break;
                case 5:
                    contador5 = contador5 + 1;
                    break;
            }
        }
        System.out.println("El vector tiene " + contador1 + " numeros de 1 digito " + contador2 + " numeros de 2 digitos " + contador3 + " numero de 3 digitos " + contador4 + " numeros de 4 digitos y " + contador5 + " numeros de 5 digitos.");

    }
}
