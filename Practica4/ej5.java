package Practica4;

import java.util.Arrays;

public class ej5 {
    public static void main(String[] args) {
        permutaciones(4);
    }
    public static void permutaciones(int n) {
        int[] disponibles = new int[n];
        for(int i = 0; i<disponibles.length;i++){
            disponibles[i] = i+1;
        }
        permutaciones(disponibles, "");
    }
    private static void permutaciones(int[] disponibles, String prefijo){
        if (disponibles.length == 0){
            System.out.print(prefijo+", ");
        }
        else { // Caso general
            int[] auxiliar = new int[disponibles.length-1];
            for (int e: disponibles) {
                int j = 0;
                for (int i=0;i<disponibles.length;i++){
                    if (disponibles[i]!= e){
                        auxiliar[j++] = disponibles[i];
                    }
                }
                permutaciones(auxiliar, prefijo + e);
            }
        }
    }
}

