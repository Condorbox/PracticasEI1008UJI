package Practica2;

public class ThrowEj{
    public static void main(String[] args) {

    }

    public int div(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Sad");
        }
        return a/b;
    }
}
