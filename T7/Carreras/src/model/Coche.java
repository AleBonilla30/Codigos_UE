package model;

public class Coche {
    private int velocidad, cv;
    private String matricula, modelo;
    private double kmRecorridos;

    public Coche() {
        this.cv = 0;
        this.velocidad = 0;
        this.matricula = "0000AAA";
        this.modelo = "Sin especificar";
        this.kmRecorridos = 0.0;
    }

    public Coche(int cv, String matricula, String modelo) {
        this.cv = cv;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public void acelerar(int velocidadAcelerar){
        this.velocidad += velocidadAcelerar;
       double distanciaRecorrida = velocidad *(cv * (1+Math.random()*10));
       kmRecorridos = distanciaRecorrida;
        int velocidadMaxima = 180;
        if (velocidad > velocidadMaxima){
            velocidad = velocidadMaxima;
            System.out.println("La velocidad maxima del coche es: "+velocidadMaxima);
        }

    }

    public void frenar(int frenarCoche){
        velocidad -= frenarCoche;
        int velocidadMinima = 0;
      if (velocidad < velocidadMinima){
          velocidad = velocidadMinima;
        System.out.println("La velocidad minima del coche es "+velocidadMinima);
      }
    }

    public void resetear(){
        velocidad = 0;
        kmRecorridos =0;
    }

    public void mostrarDatos(){
        System.out.println("Los datos del coche es");
        System.out.println("La matricula "+matricula+" el modelo "+modelo+" los CV del coche "+cv+" la velocidad "+velocidad+" los km recorridos del coche "+kmRecorridos);
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}
