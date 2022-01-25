package Practica3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ej1 {
    public static void main(String[] args) {
        ArrayList<String> d = new ArrayList();
        d.add("Uwu");
        d.add(":(");
        System.out.println(d);
        for (int i = 0; i<d.size();i++){
            System.out.println(d.get(i));
        }
        d.remove(d.size() - 1);
        for (String palabra: d) {
            System.out.println(palabra);
        }
        d.remove(d.size() -1);
        Iterator<String> it = d.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        LinkedList<String> lista = new LinkedList<String>();
        lista.add("Hola");
        lista.add("Hol");
        lista.add("Ho");
        lista.add("H");
        System.out.println(lista);
    }
}
