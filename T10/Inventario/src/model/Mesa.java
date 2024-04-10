package model;

import utils.Inventariable;

public class Mesa extends Mueble  {
    private int capacidad;

    public Mesa() {
    }

    public Mesa(String material, int peso, int precio, int capacidad) {
        super(material, peso, precio);
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capacidad: " + capacidad);
    }

    @Override
    public int calcularPrecio() {
        int precioTotal = getPrecio() * IVA_MUEBLES;
        return precioTotal;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
