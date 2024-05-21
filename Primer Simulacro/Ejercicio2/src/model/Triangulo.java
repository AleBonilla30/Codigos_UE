package model;

import java.util.Objects;

public class Triangulo extends Figura2D {
    private Double lado1, lado2, lado3;

    public Triangulo() {
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = lado1+lado2+lado3;
        return perimetro;
    }

    public Triangulo(String nombre, Double lado1, Double lado2, Double lado3) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: "+getNombre()+", Perimetro: "+calcularPerimetro());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangulo triangulo)) return false;
        return Objects.equals(lado1, triangulo.lado1) && Objects.equals(lado2, triangulo.lado2) && Objects.equals(lado3, triangulo.lado3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lado1, lado2, lado3);
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Double getLado3() {
        return lado3;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }
}
