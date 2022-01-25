package Practica1;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args){
        int num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        num = numero.nextInt();

        System.out.println(num + "# = " + primorial(num));

        numero.close();
    }
    public static long primorial(int n) {
        //Caso final
        if(n == 2) {
            return 2;
        }
        if(esPrimo(n)) {
            return n * primorial(n-1);
        }
        return primorial(n-1);
    }
    public static boolean esPrimo(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
