
package ejercicio1;

import java.util.Scanner;

/**
 * @author Aylen
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; // Creamos el arreglo de 10 enteros
        int numero, posicion;
        
        System.out.println("Ingrese valores para su arreglo:");
        for(int i = 0; i < 8; i++) {
            System.out.print((i) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.print("\nDigite un número: ");
        numero = entrada.nextInt();
        System.out.print("\nDigite una posición: ");
        posicion = entrada.nextInt();
        
        // Desplazar una posición los elementos detras de la
        // posición que el usuario quiere;
        
        for(int i = 7; i >= posicion; i--) {
            arreglo[i+1] = arreglo[i];
        }
        
        // insertamos el número en la posición requerida
        arreglo[posicion] = numero;
        
        System.out.println("El nuevo arreglo es: ");
        for(int i = 0; i < 9; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
