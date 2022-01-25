package Practica3;

import java.util.HashMap;
import java.util.Objects;

public class Diccionarios {
    Nodo primero;
    private static class Nodo{
        String cadena;
        int cantidad;
        Nodo siguiente;

        Nodo(String cadena, int cantidad,Nodo siguiente) {
            this.cadena = cadena;
            this.cantidad = cantidad;
            this.siguiente = siguiente;
        }
        public boolean equals(Object o){
            if (o == this)
                return true;
            if (o instanceof Nodo){
                Nodo e = (Nodo)o;
            if (Objects.equals(cadena,e.cadena)&&Objects.equals(cantidad,e.cantidad))
                return true;
            }
            return false;
        }
    }

    public void añadir(String unaCadena, int unaCantidad){
        Nodo aux = primero;
        Nodo repe = null;
        while (aux!=null){
            if (aux.cadena.equals(unaCadena))
                repe = aux;
            aux = aux.siguiente;
        }
        if (repe!=null){
            repe.cantidad += unaCantidad;
        }
        else{
            Nodo añadir = new Nodo(unaCadena,unaCantidad,null);
            if (primero == null){
                primero = añadir;
            }
            else{
                Nodo anterior = primero;
                aux = primero.siguiente;
                if (primero.cadena.compareTo(unaCadena)<0){
                    añadir.siguiente = primero;
                    primero = añadir;
                }
                else {
                    while (aux!=null){
                        if (aux.cadena.compareTo(unaCadena)<0){
                            anterior.siguiente = añadir;
                            añadir.siguiente = aux;
                        }
                        aux = aux.siguiente;
                        anterior = anterior.siguiente;
                    }
                }
            }
        }
    }

    public String cadenaConMayorCantidad(){
        Nodo aux = primero;
        Nodo mayor = aux;
        if (primero==null){
            return null;
        }
        while (aux!=null){
            if (aux.cantidad > mayor.cantidad){
                mayor = aux;
            }
            aux = aux.siguiente;
        }
        return mayor.cadena;
    }

    public int cantidad(String unaCadena){
        Nodo aux = primero;
        while (aux!=null){
            if (aux.cadena.equals(unaCadena)){
                return aux.cantidad;
            }
            aux = aux.siguiente;
        }
        return 0;
    }

    public String toString(){
        String cola = "{";
        Nodo aux = primero;
        int contador = 1;
        while (aux != null){
            if (contador!=size())
                cola += aux.cadena + "-->" + aux.cantidad + ", ";
            else{
                cola += aux.cadena + "-->" + aux.cantidad;
            }
            aux = aux.siguiente;
            contador++;
        }
        cola+="}";
        return cola;
    }

    public int size(){
        Nodo p = primero;
        int contador = 0;
        while (p!=null){
            contador++;
            p=p.siguiente;
        }
        return contador;
    }
}
