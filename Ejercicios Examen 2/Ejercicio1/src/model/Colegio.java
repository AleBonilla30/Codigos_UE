package model;

import java.util.ArrayList;

public class Colegio {
    private ArrayList<Alumno> listaAlumnos;
    private int matriculaContador;

    public Colegio() {
        listaAlumnos = new ArrayList<>();
        matriculaContador = 1;
    }
    public void darAlta(Alumno alumno){
            alumno.setNumeroMatricula(matriculaContador++);
            listaAlumnos.add(alumno);



    }
    public void listarAlumno(){
        if (listaAlumnos.isEmpty()){
            System.out.println("No hay alumnos matriculados");
        }else {
            System.out.println("Listando alumnos.");
            for ( Alumno alumno : listaAlumnos) {
                alumno.mostrarDatos();
            }
        }

    }

    public void calificarAlumno(int matricula, double calificacion){
        Alumno alumno = null;
        for (Alumno alumnoItem:listaAlumnos) {
           if (alumnoItem.getNumeroMatricula()== matricula){
               alumno = alumnoItem;
               break;
           }
        }
        if (alumno != null){
            alumno.setCalificacion(calificacion);
        }

    }
}
