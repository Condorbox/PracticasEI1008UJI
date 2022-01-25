package Practica3;

public class ListaCadenasEnlaceSimple implements ListaCadenas {

    int talla;
    Nodo primero;

    private static class Nodo {
        String dato;
        Nodo siguiente;

        Nodo(String dato, Nodo siguiente) {
            this.dato = dato;
            this.siguiente = siguiente;
        }
    }

    public boolean add(String s) {
        Nodo añadir = new Nodo(s,null);
        Nodo aux = primero;
        if (size()==0) {
            primero = añadir;
            return true;
        }
        else{
            while (aux!=null){
                if (aux.siguiente == null){
                    aux.siguiente = añadir;
                    return true;
                }
                aux = aux.siguiente;
            }
        }
        return false;
    }

    public void add(int i, String s) {
        if (i<0 || size()<i)
            throw new IndexOutOfBoundsException();
        else {
            Nodo añadir = new Nodo(s,null);
            Nodo aux = primero;
            int contador = 1;
            if (i==1){
                añadir.siguiente = primero;
                primero = añadir;
            }
            else {
                while (aux != null) {
                    if (contador + 1 == i) {
                        añadir.siguiente = aux.siguiente.siguiente;
                        aux.siguiente = añadir;
                    }
                    aux = aux.siguiente;
                    contador++;
                }
            }
        }
    }

    public void clear() {
        primero = null;
    }

    public String get(int i) {
        if (i<=0 || size()<i)
            throw new IndexOutOfBoundsException();
        else{
            Nodo aux = primero;
            System.out.println(primero.dato);
            int contador = 1;
            while (aux!=null){
                if (contador==i)
                    return aux.dato;
                aux = aux.siguiente;
                contador++;
            }
        }
        return null;
    }

    public int indexOf(String s) {
        Nodo aux = primero;
        int contador = 1;
        while (aux!=null){
            if (aux.dato.equals(s))
                return contador;
            aux = aux.siguiente;
            contador++;
        }
        return -1;
    }

    public int lastIndexOf(String s) {
        Nodo aux = primero;
        int contador = 1;
        int acierto = -1;
        while (aux!=null){
            if (aux.dato.equals(s))
                acierto = contador;
            aux = aux.siguiente;
            contador++;
        }
        return acierto;
    }

    public boolean isEmpty() {
        return primero==null;
    }

    public String remove(int i) {
        if (i<0 || size()<i)
            throw new IndexOutOfBoundsException();
        else if (!isEmpty()){
            Nodo anterior = primero;
            Nodo temporal = primero.siguiente;
            int contador = 1;
            if (i==1){
                primero = temporal;
                return anterior.dato;
            }
            while (temporal!=null){
                if (contador==i){
                    anterior.siguiente = temporal.siguiente;
                    return temporal.dato;
                }
                temporal = temporal.siguiente;
                anterior = anterior.siguiente;
                contador++;
            }
        }
        return null;
    }

    public boolean remove(String s) {
        Nodo anterior = primero;
        Nodo temporal = primero.siguiente;
        if (primero.dato.equals(s)){
            primero=temporal;
            return true;
        }
        while (temporal!=null){
            if (temporal.dato.equals(s)){
                anterior.siguiente = temporal.siguiente;
                return true;
            }
            temporal = temporal.siguiente;
            anterior = anterior.siguiente;
        }
        return false;
    }

    public String set(int i, String s) {
        Nodo sutituto = new Nodo(s,null);
        if (i<=0 || size()<i)
            throw new IndexOutOfBoundsException();
        else if(!isEmpty()){
            Nodo anterior = primero;
            Nodo temporal = primero.siguiente;
            int contador = 1;
            if (i==1){
                primero = sutituto;
                sutituto.siguiente = temporal;
                return anterior.dato;
            }
            while (temporal!=null){
                if (contador==i){
                    anterior.siguiente = sutituto;
                    sutituto.siguiente = temporal.siguiente;
                    return anterior.dato;
                }
                temporal = temporal.siguiente;
                anterior = anterior.siguiente;
                contador++;
            }
        }
        return null;
    }

    public int size() {
        Nodo p = primero;
        int contador = 0;
        while (p!=null){
            contador++;
            p=p.siguiente;
        }
        talla = contador;
        return talla;
    }
    public String toString(){
        String cola = "[";
        Nodo trabajo = primero;
        int contador = 1;
        while (trabajo != null){
            if (contador!=size())
                cola += trabajo.dato.toString() + ", ";
            else{
                cola += trabajo.dato.toString();
            }
            trabajo = trabajo.siguiente;
            contador++;
        }
        cola+="]";
        return cola;
    }
}
