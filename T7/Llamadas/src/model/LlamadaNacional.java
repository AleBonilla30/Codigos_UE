package model;

public class LlamadaNacional {
    private long numeroOrigen, numeroDestino;
    private double coste;
    private double duracion;
    private int destino;


    public LlamadaNacional() {
    }

    public LlamadaNacional(long numeroOrigen, long numeroDestino, double duracion, int destino){
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.destino = destino;
        this.duracion = duracion;

    }

    public void mostrarLlamadaNacional(){
        System.out.println("El numero de origen: "+numeroOrigen);
        System.out.println("El dumero de destino es: "+numeroDestino);
        System.out.println("Duracion de la llamada: "+duracion);
        System.out.println("Coste: " + coste + " unidades monetarias");
        System.out.println("Destino: " + destino);

    }
    public double costeLlamada(){
        switch (this.destino){
            case 1:
                this.coste = this.duracion * 0.40;
                break;
            case 2:
                this.coste = this.duracion * 0.50;
                break;
            case 3:
                this.coste = this.duracion * 0.60;
                break;
            default:
                this.coste = this.duracion * 0.70;
        }
        return destino;
    }

    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
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
