package Practica3; // Indica aquí el nombre del paquete que utilizas.

public interface ColaTrabajos {
    void insertar(TrabajoImpresora unTrabajo);
    TrabajoImpresora extraerPrimero();
    TrabajoImpresora consultarPrimero();
    int getTalla();
    boolean esVacía();
    void cancelar(String idUsuario);
    void adelantar(int idTrabajo);
}
