package model;

import utils.Inventariable;

public class Silla extends Mueble {
    private int patas;

    public Silla() {
    }

    public Silla(String material, int peso, int precio, int patas) {
        super(material, peso, precio);
        this.patas = patas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Patas: " + patas);
    }

    @Override
    public int calcularPrecio() {
        int precioTotal = getPrecio() * IVA_MUEBLES;
        return precioTotal;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
