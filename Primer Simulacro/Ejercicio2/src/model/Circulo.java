package model;

import java.util.Objects;

public class Circulo extends Figura2D{
    private double radio;

    public Circulo() {
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    }

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: "+getNombre()+", Perimetro: "+calcularPerimetro());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circulo circulo)) return false;
        return Double.compare(radio, circulo.radio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
