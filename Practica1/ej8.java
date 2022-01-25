package Practica1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej8 {
    public static void main(String[] args){
        int num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = numero.nextInt();
        List<Integer> primos = new ArrayList<Integer>();

        for(int i = 2; i < num; i++){
            if (esPrimo(i)) primos.add(i);
        }

        System.out.println("Los números primos menores de " + num + " son: " + primos);

        numero.close();
    }
    static boolean esPrimo(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
