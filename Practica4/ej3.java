package Practica4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) throws IOException {
        String v1[] = crearVectorDni("src/Practica4/dniCensoOrdenado.txt");
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

    public static int contarCoincidencias(String[] v1, String[] v2){ //Coste -> O(n+i), n = v1.length, i = v2.length
        int contador = 0;
        int i1 = 0, i2 = 0, i3 = 0;
        // Repetir mientras queden datos en los dos vectores.
        while (i1 < v1.length && i2 < v2.length)
            if (v1[i1].equals(v2[i2])){
                i1++;
                i2++;
                contador++;
            }
            else if (v1[i1].compareTo(v2[i2]) < 0)
                i1++;
            else
                i2++;
        return contador;
    }
}
