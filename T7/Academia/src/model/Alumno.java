package model;

public class Alumno  {

   private Asignatura asignatura1, asignatura2, asignatura3;

    public Alumno() {
    }

    public Alumno(Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }
     public Alumno(int identificador1, int identificador2, int identificador3){
        this.asignatura1 = new Asignatura(identificador1);
         this.asignatura2 = new Asignatura(identificador2);
         this.asignatura3 = new Asignatura(identificador3);
    }

     public void mostrarDatosAlumno(){
         System.out.println("Mostrando las calificaciones del alunmo");
         System.out.println("Asignatura con id "+asignatura1.getIdentificador());
         System.out.println("\tTiene una calificacion "+asignatura1.getCalificacion());
         System.out.println("Asignatura con id "+asignatura2.getIdentificador());
         System.out.println("\tTtiene una calificacion "+asignatura2.getCalificacion());
         System.out.println("Asignatura con id "+asignatura3.getIdentificador());
         System.out.println("\tTtiene una calificacion "+asignatura3.getCalificacion());
     }
    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }
}
