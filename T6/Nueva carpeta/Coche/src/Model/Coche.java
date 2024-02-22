package Model;

public class Coche {

    private Motor motor;
    private String Marca, Modelo;
    private double precioAcumulado;

    public Coche() {
    }

    public Coche(String marca, String modelo) {
        Marca = marca;
        Modelo = modelo;
        this.precioAcumulado = 0.0;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public double getPrecioAcumulado() {
        return precioAcumulado;
    }

    public void acumularAveria(double importe){
        this.precioAcumulado += importe;
    }


}
