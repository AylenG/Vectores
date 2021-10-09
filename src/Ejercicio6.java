
/*
    Ejercicio 6: Leer 10 enteros en un vector. Guardar en otro arreglo los 
    elementos pares de la primera, y a continuación los elementos impares.
*/

/**
 *
 * @author Aylen
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        MetodosVectores vector = new MetodosVectores();
        int vec[] = new int[10];
        int contPares = 0;
        int contImpares = 0;
        
        System.out.println("LLenar vector: ");
        vector.llenarVector(vec, 10);
        
        for(int i = 0; i < 10; i++) {
            if(vec[i] % 2 == 0) {
                contPares++;
            }
            else {
                contImpares++;
            }
        }
        
        //Creo los arreglos (sin perder espacio en memoria)
        int par[] = new int[contPares];
        int impar[] = new int[contImpares];
        
        // Reutilizo estas variables como iteradores para cada vector
        contPares = 0;
        contImpares = 0;
        
        for(int i = 0; i < 10; i++) {
            if(vec[i] % 2 == 0) {
                par[contPares] = vec[i];
                contPares++;
            } else {
                impar[contImpares] = vec[i];
                contImpares++;
            }
        }
        
        System.out.println("\nVector original: ");
        vector.mostrarVector(vec);
        
        System.out.println("\nVector pares: ");
        vector.mostrarVector(par);
        
        System.out.println("\nVector impares: ");
        vector.mostrarVector(impar);
    }
}
