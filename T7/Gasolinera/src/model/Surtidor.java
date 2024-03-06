package model;

public class Surtidor {
    private int capacidadTotal, capacidadActual;
    private String tipoGasolina;
    private boolean fucionamiento;

    public Surtidor() {
    }

    public Surtidor(int capacidadTotal, String tipoGasolina) {
        this.capacidadTotal = capacidadTotal;
        this.tipoGasolina = tipoGasolina;
        this.fucionamiento = true;
        this.capacidadActual = capacidadTotal;
    }

    public Surtidor(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public void arreglar(){
        this.fucionamiento = true;
    }
    public void rellenarGasolina(int cantidad){
        this.capacidadActual += cantidad;
    }

    public void quitarGasolina(int cantidad){
        this.capacidadTotal -= cantidad;
    }

    public int getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public boolean isFucionamiento() {
        return fucionamiento;
    }

    public void setFucionamiento(boolean fucionamiento) {
        this.fucionamiento = fucionamiento;
    }
}
