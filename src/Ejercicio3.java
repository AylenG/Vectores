
/*
    Ejercicio 3:  Crear un programa que lea por teclado una tabla de 10 números
    enteros y desplace N posiciones en el arreglo (N es digitado por el usuario).
*/

import java.util.Scanner;

/**
 *
 * @author Aylen
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; // Arreglo con 10 elementos enteros
        int n_posicion, ultimo;
        
        System.out.println("LLenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.println("\nDigite la cantidad de posiciones a desplazar: ");
        n_posicion = entrada.nextInt();
        
        for(int vuelta = 1; vuelta <= n_posicion; vuelta++) {
            ultimo = arreglo[9]; //gurdamos el último
            for (int i = 8; i >= 0; i--) { // Desplazando una posicion
                arreglo[i+1] = arreglo[i];
            }
            arreglo[0] = ultimo;
        }
        
        System.out.println("\nEl arreglo resultante es:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i] + " "); 
        }
    }
}
