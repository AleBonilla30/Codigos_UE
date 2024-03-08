package model;

public class LlamadaLocal {
    private long numOrigen, numDestino;
    private double coste, duracion;

    public LlamadaLocal() {
    }

    public LlamadaLocal(long numOrigen, long numDestino, double duracion) {
        this.numOrigen = numOrigen;
        this.numDestino = numDestino;
        this.duracion = duracion;
        this.coste =  0.15 + 0.50 *duracion;
    }

    public void mostrarDatos(){
        System.out.println("Llamada Local:");
        System.out.println("Numero de origen: "+numOrigen);
        System.out.println("Numero de destino: "+numDestino);
        System.out.println("Duracion de la llamada: "+duracion);
        System.out.println("Coste: " + coste + " unidades monetarias locales");
    }

    public long getNumOrigen() {
        return numOrigen;
    }

    public void setNumOrigen(long numOrigen) {
        this.numOrigen = numOrigen;
    }

    public long getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(long numDestino) {
        this.numDestino = numDestino;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
