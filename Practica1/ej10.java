package Practica1;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args){
        int num;
        int numMaxDiv = 1;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        num = numero.nextInt();

        for (int i = 1; i < num; i++){
            int maxDiv = Divisores(numMaxDiv);
            int divisor = Divisores(i);

            int max = Max(maxDiv, divisor);
            if (max == divisor) numMaxDiv = i;
        }

        System.out.print("El número con más divisores es " + numMaxDiv + " (" + Divisores(numMaxDiv) + " divisores)");
        numero.close();
    }

    static int Divisores(int n){
        int divisores = 1;
        for(int i = 1; i<n; i++){
            if (n%i == 0) divisores++;
        }
        return divisores;
    }

    static int Max(int a, int b){
        if (a > b) return a;
        else return b;
    }
}
