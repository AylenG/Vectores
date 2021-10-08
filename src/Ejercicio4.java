
import java.util.Scanner;


/*
    Ejercicio 4: Leer 5 elementos numéricos que se introducirán ordenados de 
    forma creciente. Éstos los guardaremos en una tabla de tamaño 10. Leer un 
    número N, e insertarlo en el lugar adecuado para que la tabla continúe 
    ordenada.
*/

/**
 * @author Aylen
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        MetodosVectores vector = new MetodosVectores();
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int numero;
        boolean creciente = true;
        
        System.out.println("Llenar el arreglo:");
        do {
            //LLenando el arreglo
            vector.llenarVector(arreglo, 5);
            
            // Comprobar si el arreglo está ordenado de forma creciente
            for (int i = 0; i < 4; i++) {
                if(arreglo[i] <= arreglo[i+1]) { // Creciente
                    creciente = true;
                } else {
                    creciente = false;
                    break;
                }
            }
            
            if(!creciente) {
                System.out.println("\nEl arreglo no está ordenado en forma "
                        + "creciente.\nVuelva a digitar.");
            }
        } while(!creciente);
        
        System.out.println("\nDigite un elemento a insertar: ");
        numero = entrada.nextInt();
        
        for(int i = 4; i > 0; i--) {
            if(numero < arreglo[i]) {
                arreglo[i+1] = arreglo[i];
            }
            else {
                arreglo[i+1] = numero;
                break;
            }
        }
        
        System.out.println("\nVector resultante: ");
        vector.mostrarVector(arreglo, 6);
    }
}
