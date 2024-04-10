package model;

import utils.Inventariable;

public abstract class Mueble implements Inventariable {
    private String material;
    private int peso, precio;

    public Mueble() {
    }

    public Mueble(String material, int peso, int precio) {
        this.material = material;
        this.peso = peso;
        this.precio = precio;
    }
    public void mostrarDatos(){
        System.out.println("Material: " + material);
        System.out.println("Peso: " + peso);
        System.out.println("Precio: " + precio);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
