package Practica3;

public class PruebaDiccionarios {
    public static void main(String[] args) {
        Diccionarios diccionario = new Diccionarios();
        System.out.println(diccionario.toString());

        diccionario.añadir("Aaaa", 1);
        System.out.println(diccionario.toString());
        diccionario.añadir("Hola", 3);
        System.out.println(diccionario.toString());
        diccionario.añadir("Hola", 3);
        System.out.println(diccionario.toString());
        diccionario.añadir("Pepe", 1);
        System.out.println(diccionario.toString());
        diccionario.añadir("Alejandro", 5);
        System.out.println(diccionario.toString());
        diccionario.añadir("Zzzz", 10);
        System.out.println(diccionario.toString());

        System.out.println(diccionario.cadenaConMayorCantidad());
        System.out.println(diccionario.cantidad("X"));
        System.out.println(diccionario.cantidad("Zzzz"));

        Diccionarios prueba = new Diccionarios();
        System.out.println(prueba.toString());
        System.out.println(prueba.cadenaConMayorCantidad());
        System.out.println(prueba.cantidad("S"));
    }
}
