package Practica1;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args){
        int num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = numero.nextInt();
        System.out.println("El factorial doble de: " + num + " es " + dobleFactorial(num));
        numero.close();

    }

    private static long dobleFactorial(int n){
        long res = 1;
        for (int i = n; i >= 0; i = i-2)
        {
            if (i == 0 || i == 1)
                return res;
            else
                res *= i;
        }
        return res;
    }
}
