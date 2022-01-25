package Practica2;

import java.util.Arrays;

public class Prueba2_2{
    public static void main(String[] args) {
        Prueba2_1 p = new Prueba2_1();
        Circulo[] v1 = { new Circulo(new Punto(1, 1), 1),
                new Circulo(new Punto(2, 2), 2),
                new Circulo(new Punto(3, 3), 3) };

        Circulo[] v2 = new Circulo[v1.length];
        for (int i = 0; i < v1.length; i++) {
            v2[i] = new Circulo(v1[i]);
            v1[i].getCentro().mover(1, 1);
        }

        System.out.println("v1: " + Arrays.toString(v1));
        System.out.println("v2: " + Arrays.toString(v2));
        System.out.println(p.toString());
    }
}
