
package ejercicio2;

import java.util.Scanner;

/**
 * @author Aylen
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; // Creamos arreglos de 10 elementos enteros
        int ultimo;
        
        System.out.println("Llenar el arreglo:");
        for(int i = 0; i < 10; i++) {
            System.out.println(i + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        ultimo = arreglo[9]; //Guardamos el último elemento
        
        for(int i = 8; i >= 0; i--) {
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[0] = ultimo; // Ponemos el ultimo elemento como primero
        
        System.out.println("\nEl nuevo arreglo:");
        for(int i = 0; i < 10; i++) {
            System.out.print(arreglo[i] + " ");
        }
        
        System.out.println("\n\n");
    }
}
