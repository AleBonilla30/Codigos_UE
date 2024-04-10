package model;

import utils.Inventariable;

public class Lacteo extends Alimento {
    private int volumen;

    public Lacteo() {
    }

    public Lacteo(String calidad, String origen, int precio, int volumen) {
        super(calidad, origen, precio);
        this.volumen = volumen;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Volumen: " + volumen);
    }

    @Override
    public int calcularPrecio() {
        int precioTotal = getPrecio() * IVA_ALIMENTOS;
        return precioTotal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
