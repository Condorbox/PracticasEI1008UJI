package Practica1;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args){
        String texto;
        int palabras;

        texto = " Hola          Buenos días como  estan   ustedes c";

        palabras = contarPalabras(texto);
        System.out.println(palabras);
    }

    private  static int contarPalabras(String texto){
        int palabras = 1;
        for (int i = 0; i<texto.length(); i++){
            if (i == texto.length() - 1){
                break;
            }
            if(texto.charAt(i) != ' ' && texto.charAt(i+1) == ' '){
                if (i+1 == texto.length() - 1) break;
                palabras++;
            }
        }
        return palabras;
    }
}
