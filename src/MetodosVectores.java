
import java.util.Scanner;

/**
 * @author Aylen
 */
public class MetodosVectores {
    public void llenarVector(int arr[], int cantElem) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < cantElem; i++) {
            System.out.println(i + ". Digite un numero: ");
            arr[i] = entrada.nextInt();
        }
    }
    
    public void mostrarVector(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
    }
    
    public void mostrarVector(int arr[], int cantElem) {
        for (int i = 0; i < cantElem; i++) {
            System.out.print(arr[i] + " "); 
        }
    }
}
