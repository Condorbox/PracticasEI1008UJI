package Practica4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) throws IOException  {
        String v1[] = crearVectorDni("src/Practica4/dniCenso.txt");
        String v2[] = crearVectorDni("src/Practica4/dniClientesOrdenado.txt");

        System.out.println(contarCoincidencias(v1,v2));
    }
    public static String[] crearVectorDni(String rutaFichero) throws IOException {
        Scanner fichero = new Scanner(new File(rutaFichero));
        int tamaño = fichero.nextInt();
        String[] dniArray = new String[tamaño];
        int i = 0;
        while (fichero.hasNext() && i < dniArray.length){
            dniArray[i++] = fichero.next();
        }
        return dniArray;
    }

    public static Boolean buscarDni(String dni, String[] v){ //Coste -> O(log n), n = v.length
        int inicio = 0;
        int fin = v.length - 1;
        while (inicio <= fin){
            int medio = (inicio + fin) / 2;
            if (v[medio].compareTo(dni) < 0)
                inicio = medio + 1; // Examinar mitad derecha
            else if (v[medio].compareTo(dni) > 0)
                fin = medio - 1; // Examinar mitad izquierda
            else // Encontrado
                return true;
        }
        return false;
    }

    public static int contarCoincidencias(String[] v1, String[] v2){ //Coste -> O(n*log i), n = v1.length, i = v2.length
        int coincidencias = 0;
        for (int i = 0; i<v1.length; i++){
            if (buscarDni(v1[i], v2)){
                coincidencias++;
            }
        }
        return coincidencias;
    }
}
