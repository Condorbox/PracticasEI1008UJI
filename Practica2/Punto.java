package Practica2;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p) {
        x = p.x;
        y = p.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void mover(int incrementoX, int incrementoY) {
        x += incrementoX;
        y += incrementoY;
    }
}
