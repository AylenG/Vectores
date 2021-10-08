
/*
    Ejercicio 2 : Crear un programa que lea por teclado una tabla de 10 números
    enteros y la desplace una posición hacia la derecha: el primero pasa a ser 
    el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último
    pasa a ser el primero.
*/

/**
 * @author Aylen
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        MetodosVectores vector = new MetodosVectores();
        int arreglo[] = new int[10]; // Creamos arreglos de 10 elementos enteros
        int ultimo;
        
        System.out.println("Llenar el arreglo:");
        vector.llenarVector(arreglo, 10);
        
        ultimo = arreglo[9]; //Guardamos el último elemento
        
        for(int i = 8; i >= 0; i--) {
            arreglo[i+1] = arreglo[i];
        }
        
        arreglo[0] = ultimo; // Ponemos el ultimo elemento como primero
        
        System.out.println("\nEl nuevo arreglo:");
        vector.mostrarVector(arreglo);
        
        System.out.println("\n\n");
    }
}
