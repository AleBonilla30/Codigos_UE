package model;

public final class Audio extends Elemento  {
    private double duracion;
    private String soporte;

    public Audio() {
    }

    public Audio(int identificador, int tamano, String titulo, String formato, Persona autor, double duracion, String soporte) {
        super(identificador, tamano, titulo, formato, autor);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("duracion: " + duracion);
        System.out.println("soporte: " + soporte);
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}
