package Practica1;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args){
        int num;
        boolean primo;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = numero.nextInt();
        primo = esPrimo(num);

        if (primo) System.out.println("Es primo");
        else System.out.println("No es primo");
    }

    static boolean esPrimo(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
