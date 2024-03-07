package model;

public class Jefe extends Trabajador implements Responsable{
    private int percAcciones;
    private Puesto puesto;

    public Jefe() {
    }

    public Jefe(String dni, String nombre, String correo, int salario, int percAcciones, Puesto puesto) {
        super(dni, nombre, correo, salario);
        this.percAcciones = percAcciones;
        this.puesto = puesto;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("percAcciones = " + percAcciones);
        System.out.println(puesto.getDescripcion());
        System.out.println("Salario adicional al puesto "+puesto.getSalarioAdd());
        System.out.println();
    }

    @Override
    public void trabajar() {
        System.out.println("El jefe se pone a trabajar");
    }

    @Override
    public void realizarVotacion() {
        System.out.println("El jefe se dispone a votar");
        int aleatorio = (int) (Math.random()*5)/2;
        System.out.println("El voto del jefe con nombre "+getNombre()+" es: "+aleatorio);
        System.out.println();
    }
}
