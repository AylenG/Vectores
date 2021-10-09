/*
    Ejercicio 7: Leer dos series de 10 enteros, que estarán ordenados 
    crecientemente. Copiar (fusionar) los dos vectores en un tercero, de forma 
    que sigan ordenados.
 */

/**
 *
 * @author Aylen
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        MetodosVectores vecMetodo = new MetodosVectores();
        int primerVec[] = new int[10];
        int segVec[] = new int[10];
        int fusionVec[] = new int[20];
        boolean creciente = true;
        
        System.out.println("Llenar el arreglo:");
        do {
            //LLenando los vectores
            vecMetodo.llenarVector(primerVec, 10);
            vecMetodo.llenarVector(segVec, 10);
            
            // Comprobar si están ordenados de forma creciente
            for (int i = 0; i < 9; i++) {
                if(primerVec[i] <= primerVec[i+1] && segVec[i] <= segVec[i+1]) {
                    creciente = true;
                } else {
                    creciente = false;
                    break;
                }
            }
            
            if(!creciente) {
                System.out.println("\nLos vectores no están ordenados en forma"
                        + " creciente.\nVuelva a digitar.");
            }
        } while(!creciente);
        
        // Iteradores
        int pri = 0;
        int seg = 0;
        int fusion = 0;
        
        // Fusionamos ambos vectores (y que sigan ordenados de forma creciente)
        while(pri < 10 && seg < 10) {
            if(primerVec[pri] < segVec[seg]) {
                fusionVec[fusion] = primerVec[pri];
                pri++;
            } else {
                fusionVec[fusion] = segVec[seg];
                seg++;
            }
            fusion++;
        }
        
        // Al salir del while, significa que o pri o seg es menor a 10
        if(pri == 10) {
            while(seg < 10) { // Ya copiamos todo de primerVec
                fusionVec[fusion] = segVec[seg];
                fusion++;
                seg++;
            }
        } else {
            while(pri < 10) { // Ya copiamos todo de segVec
                fusionVec[fusion] = primerVec[pri];
                fusion++;
                pri++;
            }
        }
        
        System.out.println("\nPrimer vector:");
        vecMetodo.mostrarVector(primerVec);
        
        System.out.println("\nSegundo vector:");
        vecMetodo.mostrarVector(segVec);
        
        System.out.println("\nFusion ordenada:");
        vecMetodo.mostrarVector(fusionVec);
        
        
        // Prueba
        // 1 3 5 7 9 11 13 15 17 19
        // 0 2 4 6 8 10 12 14 16 18
    }
}
