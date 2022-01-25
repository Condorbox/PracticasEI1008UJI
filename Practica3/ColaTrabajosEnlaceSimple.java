package Practica3;

import java.util.NoSuchElementException;
import java.util.PropertyResourceBundle;

public class ColaTrabajosEnlaceSimple implements ColaTrabajos {
     int talla;
     Nodo primero;
     Nodo ultimo;

    private static class Nodo {
        TrabajoImpresora dato;
        Nodo siguiente;

        Nodo(TrabajoImpresora dato, Nodo siguiente) {
            this.dato = dato;
            this.siguiente = siguiente;
        }
    }

    public ColaTrabajosEnlaceSimple(){
        talla = 0;
        primero = null;
        ultimo = null;
    }

    public void insertar(TrabajoImpresora unTrabajo) {
        Nodo nuevo = new Nodo(unTrabajo, null);
        talla++;
        if (esVacía()){
            primero=nuevo;
            ultimo=nuevo;
        }
        else {
            ultimo.siguiente =nuevo;
            ultimo=nuevo;
        }
    }

    public TrabajoImpresora extraerPrimero() {
       if (esVacía())
           throw new NoSuchElementException();
       TrabajoImpresora elemento = primero.dato;
       primero=primero.siguiente;
       if (primero==null)
           ultimo=null;
       return elemento;
    }

    public TrabajoImpresora consultarPrimero() {
        if (esVacía())
            throw new NoSuchElementException();
        return primero.dato;
    }

    public int getTalla() {
        Nodo p = primero;
        int contador = 0;
        while (p!=null){
            contador++;
            p=p.siguiente;
        }
        talla = contador;
        return talla;
    }

    public boolean esVacía() {
        return primero==null;
    }

    public void cancelar(String idUsuario) {
        if (!esVacía()){
            Nodo anterior = primero;
            Nodo temporal = primero.siguiente;
            if (primero==ultimo&&primero.dato.getIdUsuario()==idUsuario){
                primero=ultimo=null;
            }
            while (temporal!=null){
                if (primero.dato.getIdUsuario() == idUsuario){
                    primero = primero.siguiente;
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
                else if (temporal.dato.getIdUsuario()==idUsuario) {
                    if (temporal.siguiente == null){
                        ultimo = anterior;
                    }
                    anterior.siguiente = temporal.siguiente;
                    temporal = temporal.siguiente;
                }
                else{
                    anterior = anterior.siguiente;
                    temporal = temporal.siguiente;
                }
            }
        }
    }

    public void adelantar(int idTrabajo) {
        Nodo anterior = primero;
        Nodo temporal = primero.siguiente;
        while (temporal!=null){
            if (temporal.dato.getIdTrabajo()==idTrabajo){
                if (temporal == ultimo){
                    ultimo = anterior;
                }
                anterior.siguiente = temporal.siguiente;
                temporal.siguiente = primero;
                primero = temporal;
                break;
            }
            anterior = anterior.siguiente;
            temporal = temporal.siguiente;
        }
    }

    public String toString(){
        String cola = "[";
        Nodo trabajo = primero;
        while (trabajo != null){
            if (!trabajo.equals(ultimo))
                cola += trabajo.dato.toString() + " -> ";
            else{
                cola += trabajo.dato.toString();
            }
            trabajo = trabajo.siguiente;
        }
        cola+="]";
        return cola;
    }
}
