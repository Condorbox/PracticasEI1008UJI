package Practica1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ej11 {
    static String p = "35.2";
    static float i;
    static int[][] v1, v2;

    public static void main(String[] args){
        /*v1 = new int[2][3];
        v2 = new int[][]{{3,4,5},{3,2,1}};

        String ar = Arrays.toString(v2);

        boolean x = esSufijo("Memento", "mento");

        i = Float.parseFloat(p);

        System.out.println(x);
        System.out.println(i);
        System.out.println(Arrays.deepEquals(v1,v2));

        printArray2D(v1);
        printArray2D(v2);*/
    }

    public static void printArray2D(int[][] v){
        for (int i = 0; i<v.length; i++){
            for (int j = 0; j<v[i].length;j++){
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean esSufijo(String palabra, String sujijo){
        for(int i = 0; i<sujijo.length(); i++){
            if (sujijo.charAt(i) != palabra.charAt(palabra.length()-(sujijo.length()-i))){
                return false;
            }
        }
        return true;
    }
}
