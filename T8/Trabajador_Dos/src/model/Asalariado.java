package model;

public class Asalariado extends Trabajador {
    private int numPagas;
    private boolean contratado;

    public Asalariado() {
    }

    public Asalariado(String nombre, String apellido, String dni, int numPagas, boolean contratado) {
        super(nombre, apellido, dni);
        this.numPagas = numPagas;
        this.contratado = true;

    }

    @Override
    public void mostrarDatos(String dni) {
        System.out.println("Los datos de los Asalariados son");
        super.mostrarDatos(dni);
        System.out.println("numPagas: " + numPagas);
        System.out.println("contratado: " + contratado);

    }

    public int getNumPagas() {
        return numPagas;
    }

    public void setNumPagas(int numPagas) {
        this.numPagas = numPagas;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
