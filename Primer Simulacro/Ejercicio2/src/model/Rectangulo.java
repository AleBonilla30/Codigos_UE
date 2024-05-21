package model;

import java.util.Objects;

public class Rectangulo extends Figura2D{
    private double base, altura;

    public Rectangulo() {
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = base+altura;
        return perimetro;
    }

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: "+getNombre()+", Perimetro: "+calcularPerimetro());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangulo that)) return false;
        return Double.compare(base, that.base) == 0 && Double.compare(altura, that.altura) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
