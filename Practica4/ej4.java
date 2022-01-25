package Practica4;

public class ej4 {
    public static void main(String[] args) {
        variacionesRepeticion(2,2);
    }
    public static void variacionesRepeticion(int n, int m){
        System.out.print("{");
        variacionesRepeticion(n,m,"");
        System.out.print("}");
    }
    private static void variacionesRepeticion(int n, int m, String prefijo){
        if (m==0){
            System.out.print(prefijo+", ");
        }
        else {
            for (int i = 1; i<=n;i++){
                variacionesRepeticion(n,m-1,prefijo+i);
            }
        }
    }


}
