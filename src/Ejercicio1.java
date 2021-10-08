
/*
    Ejercicio 1 : Diseñar una aplicación que declare una tabla de 10 elementos 
    enteros. Leer mediante el teclado 8 números. Después de debe pedir un número
    y una posición, insertarlo en la posición indicada desplazando los que estén
    detrás.
 */

import java.util.Scanner;

/**
 * @author Aylen
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        MetodosVectores vector = new MetodosVectores();
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10]; // Creamos el arreglo de 10 enteros
        int numero, posicion;

        System.out.println("Ingrese valores para su arreglo:");
        vector.llenarVector(arreglo, 10);

        System.out.print("\nDigite un número: ");
        numero = entrada.nextInt();
        System.out.print("\nDigite una posición: ");
        posicion = entrada.nextInt();

        // Desplazar una posición los elementos detras de la
        // posición que el usuario quiere;
        for (int i = 7; i >= posicion; i--) {
            arreglo[i + 1] = arreglo[i];
        }

        // insertamos el número en la posición requerida
        arreglo[posicion] = numero;

        System.out.println("El nuevo arreglo es: ");
        vector.mostrarVector(arreglo);
    }
}
