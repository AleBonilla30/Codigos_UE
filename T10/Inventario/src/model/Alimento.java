package model;

import utils.Inventariable;

public abstract class Alimento implements Inventariable {
    private String calidad, origen;
    private int precio;

    public Alimento() {
    }

    public Alimento(String calidad, String origen, int precio) {
        this.calidad = calidad;
        this.origen = origen;
        this.precio = precio;
    }

    public void mostrarDatos(){
        System.out.println("Calidad: " + calidad);
        System.out.println("Origen: " + origen);
        System.out.println("Precio: " + precio);
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
