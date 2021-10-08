
import java.util.Scanner;

/*
    Ejercicio 5: Leer por teclado un arreglo de 10 elementos numéricos enteros y
    una posición (entre 0 y 9). Eliminar el elemento situado en la posición dada
    sin dejar huecos.
 */

/**
 *
 * @author Aylen
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        MetodosVectores vector = new MetodosVectores();
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int posicion;
        
        System.out.println("LLenar el vector: ");
        vector.llenarVector(arreglo, 10);
        
        // Pedimos la posicion en un rango de 0 a 9
        do {
            System.out.print("\nDigite la posición a eliminar: ");
            posicion = entrada.nextInt();
        } while(posicion < 0 || posicion > 9);
        
        // Eliminando el elemento en la posicion indicada
        for (int i = posicion; i < 9; i++) {
             arreglo[i] = arreglo[i+1];           
        }
        
        System.out.println("\nVector resultante:");
        vector.mostrarVector(arreglo, 9);
    }
    
}
