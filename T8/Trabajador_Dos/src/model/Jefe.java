package model;

public class Jefe extends Trabajador{
    private int acciones;
    private double beneficio;

    public Jefe() {
    }

    public Jefe(String nombre, String apellido, String dni, int acciones, double beneficio) {
        super(nombre, apellido, dni);
        this.acciones = acciones;
        this.beneficio = beneficio;
    }

    public void despedir(Trabajador trabajador){
        System.out.println("El jefe "+getNombre()+" ha despedido a "+trabajador.getNombre()+" "+trabajador.getApellido());
    }

    @Override
    public void mostrarDatos(String dni) {
        super.mostrarDatos(dni);
        System.out.println("acciones: " + acciones);
        System.out.println("beneficio:" + beneficio);
    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }

    public double getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(double beneficio) {
        this.beneficio = beneficio;
    }
}
