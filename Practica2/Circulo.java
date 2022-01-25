package Practica2;

public class Circulo {
    private Punto centro;
    private int radio;

    public Circulo(Punto p, int r) {
        centro = p;
        radio = r;
    }

    public Circulo(Circulo c) {
        centro = new Punto(c.centro);
        radio = c.radio;
    }

    public String toString() {
        return centro + "R" + radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public int getRadio() {
        return radio;
    }
}
