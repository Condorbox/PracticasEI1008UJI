package Practica2;

public class Prueba2_1 {
    public static final int[] díasHasta1Enero = new int[2500 - 1800 + 1];
    public static int pep = 32;

    static {
        // Rellenamos el vector:
        díasHasta1Enero[0] = 0;
        for (int i = 1; i <= 2500 - 1800; i++) {
            díasHasta1Enero[i] = díasHasta1Enero[i - 1] + 365;
            díasHasta1Enero[i] += 1; // Sumamos el 29 de febrero del año anterior
        }
        System.out.println("Hola");
    }

    public String toyTopeSad(){
        return "Pos eso estoy tope sad uwun't";
    }
    public static int[] getDíasHasta1Enero(){
        return díasHasta1Enero;
    }

    public Prueba2_1(){

    }

    @Override
    public String toString() {
        return "Hola";
    }
}
