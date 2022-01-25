package Practica1;

import java.util.Locale;

public class ej13 {
    public static void main(String[] args){
        int n1 = 0,n2 = 1;
        int resultado;
        try {
            resultado = n1 / n2;
            System.out.println("Uno");
        } catch (ArithmeticException e) {
            System.out.println("Dos");
        } catch (Exception e) {
            System.out.println("Tres");
        } finally {
            System.out.println("Cuatro");
        }
        System.out.println("Cinco");
    }
}