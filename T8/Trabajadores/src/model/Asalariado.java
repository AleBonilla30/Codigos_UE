package model;

public class Asalariado extends Trabajador {
        private int numeroPagas;

    public Asalariado() {
    }

    public Asalariado(String dni, String nombre, String correo, int salario, int numeroPagas) {
        super(dni, nombre, correo, salario);
        this.numeroPagas = numeroPagas;
    }

    @Override
    public void trabajar() {
        System.out.println("Iniciando la jornada");
        System.out.println(getNombre()+" Empieza a trabajar");
        System.out.println("Tu numero de pagas es "+numeroPagas);
        System.out.println("Que sepas que eres un trabajador");
        System.out.println();
    }
}
